    /*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

package actions;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.*;

import org.hibernate.*;
import forms.*;
import java.util.ArrayList;
import utils.*;
import pojos.*;

public class BusFareAction  extends Action {

public BusFareAction() throws Exception{
    System.out.println("in constr "+getClass().getName());

}
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String outcome="failed";
        BusFareBean busdetails=(BusFareBean)form;
        BusInfoActionForm busactionform=(BusInfoActionForm)request.getSession().getAttribute("busobject");
        

        Session hs=null;
        Transaction tx=null;
        try {
                //sf & hib sess.
                hs=HibernateUtils.getSessionFactory().openSession();
                //tx
                tx=hs.beginTransaction();
        
                String hqlBusstop="from  Busstop stop where stop.stopid = :selectedbus ";
                Busstop bStop=(Busstop)hs.createQuery(hqlBusstop).setProperties(busdetails).uniqueResult();

                if (bStop != null)
                {
                        outcome="success";
                        System.out.println(outcome+"...........");
                        String busservice=null;
                        String busroute=null;
                        int busrouteno=0;
                        int ac=0;
                        int semiluxury=0;
                        int sleeper=0;

         
                        int busno=bStop.getBusinfo().getBusid();
                        String busplace=bStop.getPlace();
                        System.out.println("..............."+busno+"...."+busplace);

                        String hqlBusinfo="from  Businfo bus where bus.busid = "+busno;
                        Businfo bInfo=(Businfo)hs.createQuery(hqlBusinfo).setProperties(busdetails).uniqueResult();

                        if (bInfo != null)
                        {
                            outcome="success";
                            busservice=bInfo.getServicetype();
                            busroute=bInfo.getBusrouteid();
                            System.out.println("...................."+busservice+"..."+busroute);
                        }

                
                        String hqlBusroute="from  Busroute route where route.routeid='"+busroute+"' and route.stationone='"+busplace+"' and route.stationtwo='"+busactionform.getStoptwo()+"'";
                        Busroute bRoute=(Busroute)hs.createQuery(hqlBusroute).setProperties(busdetails).uniqueResult();

                        if (bRoute != null)
                        {
                            busrouteno=bRoute.getRouteserialid();
                            System.out.println("...................."+busrouteno);

                        }

                        ///correct part of bus fare
                        String hqlBusfare="from Busfare fare where fare.busroute.routeserialid="+busrouteno;
                        Busfare bFare=(Busfare)hs.createQuery(hqlBusfare).setProperties(busdetails).uniqueResult();

                        if(bFare!=null)
                        {
                            ac=bFare.getAc();
                            semiluxury=bFare.getSemiluxury();
                            sleeper=bFare.getSleeper();
                            System.out.println("...................."+ac+"....."+semiluxury+"...."+sleeper);
                        }


                        //// get stops
                        int start=0;
                        int end=0;


                        String hqlStopone="select min(route.routeserialid) from  Busroute route where route.routeid='"+busroute+"' and route.stationone='"+busplace+"'";
                        Query queryone=hs.createQuery(hqlStopone);

                        Iterator itone=queryone.iterate();
                        start=Integer.parseInt(itone.next().toString());
                        System.out.println("......one......."+start+"hi");

                        String hqlStoptwo="select route.routeserialid from  Busroute route where route.routeid='"+busroute+"' and route.stationone='"+busplace+"' and route.stationtwo='"+busactionform.getStoptwo()+"'";
                        Query querytwo=hs.createQuery(hqlStoptwo);
                        Iterator ittwo=querytwo.iterate();
                        end=Integer.parseInt(ittwo.next().toString());
                        System.out.println("......two......."+end+"hi");

                        ArrayList<String> strStops=new ArrayList<String>();
                        
                        for(int stops=start;stops<=end;stops++)
                        {
                            System.out.println(stops+"....");
                            System.out.println(start+"....");
                            System.out.println(end+"....");

                            String hqlstop="from Busroute route where route.routeserialid="+stops;
                            Busroute bRoutestop=(Busroute)hs.createQuery(hqlstop).setProperties(busdetails).uniqueResult();
                            strStops.add(bRoutestop.getStationtwo());
                            System.out.println(bRoutestop.getStationtwo());
   
                        }

                      

                        request.setAttribute("businfo",bInfo);
                        
                        if(busdetails.getAction().equalsIgnoreCase("BookTicket"))
                        {
                            System.out.println("....book");
                            response.sendRedirect("BusBooking.jsp");
                        }
                        if(busdetails.getAction().equalsIgnoreCase("GetFare"))
                        {
                                System.out.println("....get");
                                request.setAttribute("busfare",0);
                                double childfare=0;
                                double totalfare=0;

                                if(busactionform.getServicetype().equalsIgnoreCase("A/C"))
                                {
                                     childfare=(ac/2);
                                     request.setAttribute("childbusfare",childfare);
                                     request.setAttribute("busfare",ac);
                                     totalfare=ac+childfare+50;
                                     request.setAttribute("amount",totalfare);

                                }
                                if(busactionform.getServicetype().equalsIgnoreCase("Semi-Luxury"))
                                {
                                     childfare=(semiluxury/2);
                                     request.setAttribute("childbusfare",childfare);
                                     totalfare=semiluxury+childfare+50;
                                     request.setAttribute("busfare",semiluxury);
                                     request.setAttribute("amount",totalfare);

                                }
                                if(busactionform.getServicetype().equalsIgnoreCase("Sleeper"))
                                {
                                    childfare=(sleeper/2);
                                    request.setAttribute("childbusfare",childfare);
                                    totalfare=sleeper+childfare+50;
                                    request.setAttribute("busfare",sleeper);
                                    request.setAttribute("amount",totalfare);

                                }
                               response.sendRedirect("GetFare.jsp");
                        }
                        if(busdetails.getAction().equalsIgnoreCase("ViewStops"))
                        {
                             request.setAttribute("bus_stations", strStops);
                             response.sendRedirect("ViewStops.jsp");
                        }
                        if(busdetails.getAction().equalsIgnoreCase("ShowAvailbility"))
                        {
                            
                            response.sendRedirect("ShowAvailbility.jsp");
                        }   
                }
     
        }
        finally {
            if(tx!=null)
            {
                tx.commit();
            }
                hs.close();
        }
    
    return mapping.findForward(outcome);
}

}

