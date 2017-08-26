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

public class RegistrationAction  extends org.apache.struts.action.Action
{

        public RegistrationAction()
        {
             System.out.println("inside Action constructot: "+getClass().getName());

        }

        @Override
        public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception
        {
          
                String outcome="failed";
                Session hs=null;
                Transaction tx=null;
                try
                {
                    SessionFactory sf=HibernateUtils.getSessionFactory();
                    hs=sf.openSession();
                    tx=hs.beginTransaction();
                    RegistrationForm reg=(RegistrationForm)form;

                    Userregistration user=new Userregistration();

                    user.setFirstname(reg.getUserfirstname());
                    user.setLastname(reg.getUserlastname());
                    user.setEmailid(reg.getEmailid());
                    user.setPassword(reg.getPassword());
                    user.setGender(reg.getGender());
                    user.setDob("1");
                    user.setMobileno(reg.getMobileno());
                    user.setAddress(reg.getAddress());
                    hs.save(user);


                }
                 catch(Exception e)
                 {
                      System.out.println(e.getMessage());
                 }
                finally
                {
                  tx.commit();
                  hs.close();
                }

             
            outcome="success";
            return mapping.findForward(outcome);
        }
}
