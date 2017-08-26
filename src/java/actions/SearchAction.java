/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

/**
 *
 * @author dl724
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import forms.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;


import pojos.*;
import beans.*;
import utils.HibernateUtils;

/**
 *
 * @author dl723
 */
public class SearchAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */

    List<Busroute> busRouteList=null;
    ArrayList<Businfo> busInfoList=null;
    ArrayList<Busstop> busStopList=null;
    ArrayList<SearchBean> buslist=null;

    public SearchAction()
    {

        System.out.println("inside Action constructot: "+getClass().getName());
        buslist=new ArrayList<SearchBean>();
    }


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception
        {
          System.out.println("execute");
          SearchForm busForm=(SearchForm)form;

          request.getSession().setAttribute("busobject", busForm);


          Session hs=null;
          //Transaction tx=null;
          System.out.println("within ation");

          String outcome="failed";
          String busplace=null;
          try
          {
                System.out.println("sessionbefore");
		//sf & hib sess.
		SessionFactory sf=HibernateUtils.getSessionFactory();

                hs=sf.openSession();
		System.out.println("after opening session");

		String hql="from  Busroute b where b.stationone=:stopone and b.stationtwo=:stoptwo";
                System.out.println("...before.....");

                System.out.println("before  "+busForm.getStopone()+"  "+busForm.getStoptwo());
                busplace=busForm.getStopone();
                busRouteList=(List<Busroute>)hs.createQuery(hql).setProperties(busForm).list();
                System.out.println("after    "+busForm.getStopone()+"  "+busForm.getStoptwo());

                System.out.println("ID  : "+busRouteList.size());

               // hs.close();
                if(busRouteList!=null)
                {
                    buslist.clear();
                    for (Busroute busroute : busRouteList)
                    {
                       System.out.println("Bus route id  : "+busroute.getRouteid()+"  "+busroute.getStationone()+ "  "+busroute.getStationtwo());
                       //String hqlRoute="from Businfo b where b.busrouteid='Pune-Mum' and b.servicetype='A/C'";
                     
                       String hqlRoute="from Businfo b where b.busrouteid='"+busroute.getRouteid()+"'";

                       System.out.println("session");
                      // hs=sf.openSession();
                	//tx=hs.beginTransaction();
                        System.out.println("Before execution");
                        busInfoList=(ArrayList<Businfo>)hs.createQuery(hqlRoute).list();
                        System.out.println("After execution");
                    }


                }
              if(busInfoList!=null)
                  {

                    for (Businfo binfo :busInfoList)
                    {
                        SearchBean stopbean=new SearchBean();
                        String hqlStopTime="from Busstop stoptime where stoptime.businfo.busid="+binfo.getBusid()+" and stoptime.place='"+busplace+"'";
                        busStopList=(ArrayList<Busstop>)hs.createQuery(hqlStopTime).list();

                        stopbean.setBusname(binfo.getBusname());
                        stopbean.setServicetype(binfo.getServicetype());

                        for(Busstop stopinfo : busStopList )
                        {
                            stopbean.setBustime(stopinfo.getUptime()); 
                            System.out.println("hi.....");
                        }
                        buslist.add(stopbean);
                    }


                  }

                  request.setAttribute("businfolist",buslist);
                    if(busInfoList!=null)
                    {
                        for(Businfo info :busInfoList)
                        {
                            System.out.println("bus Id "+info.getBusid()+"  "+info.getBusname()+"  "+info.getBuscapacity()+"  "+info.getServicetype());
                        }
                    }

                 outcome="success";
                 System.out.println("..............."+outcome);
         }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {

          hs.close();
        }
         System.out.println("..............."+outcome);
        return mapping.findForward(outcome);
    }

}

