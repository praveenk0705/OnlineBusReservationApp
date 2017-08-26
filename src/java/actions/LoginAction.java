/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;
import forms.*;
import pojos.Userregistration;



import utils.HibernateUtils;

public class LoginAction  extends org.apache.struts.action.Action
{

        public LoginAction()
        {
             System.out.println("inside Action constructot: "+getClass().getName());

        }

        @Override
        public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception
        {
            String outcome="failed";
            LoginForm cancel=(LoginForm)form;
            Session hs=null;
            Transaction tx=null;
           try {
                //sf & hib sess.
                hs=HibernateUtils.getSessionFactory().openSession();
                //tx
                tx=hs.beginTransaction();

                String hqluser="from  Userregistration user where user.emailid = :username and user.password=:password ";
                Userregistration validuser=(Userregistration)hs.createQuery(hqluser).setProperties(cancel).uniqueResult();
                System.out.println("...login....");

                if (validuser != null)
                {
                    outcome="success";      
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
