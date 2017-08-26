/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package actions;
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
public class CancellationAction extends org.apache.struts.action.Action {

   

    public CancellationAction()
    {
        System.out.println("inside Action constructot: "+getClass().getName()); 
    }


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception
        {
            String outcome="failed";
            
            CancellationForm cancel=(CancellationForm)form;
            Session hs=null;
            Transaction tx=null;
           try {
                //sf & hib sess.
                hs=HibernateUtils.getSessionFactory().openSession();
                //tx
                tx=hs.beginTransaction();

                String hqlticket="from  Passengerinfo  ticket where ticket.seatno = :seatno and ticket.businfo.busid=:busno ";
                Passengerinfo passenger=(Passengerinfo)hs.createQuery(hqlticket).setProperties(cancel).uniqueResult();
                System.out.println("....hi....");
                if (passenger != null)
                {
                    outcome="success";
                    hs.delete(passenger);
                    System.out.println("....inside....");
                }
           }
           finally {
            if(tx!=null)
            {
                tx.commit();
            }
                hs.close();
        }
    
          System.out.println("..............."+outcome);
          return mapping.findForward(outcome);
    }

}

