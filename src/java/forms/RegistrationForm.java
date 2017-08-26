/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;



public class RegistrationForm  extends org.apache.struts.action.ActionForm
{
        String userfirstname;
        String userlastname;
        String password;
        String repassword;
        String gender;
        double mobileno;
        String address;
        String emailid;
        String action;
        String birthdate;



public RegistrationForm() {
        super();
	System.out.println("in constr "+getClass().getName());
}

@Override
public void reset(ActionMapping mapping, HttpServletRequest request) {
	System.out.println("in reset "+getClass().getName());
}

@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	System.out.println("in validate "+getClass().getName());
	ActionErrors ae=new ActionErrors();
	return ae;

}

public void setUserfirstname(String userfirstname)
{
    this.userfirstname=userfirstname;

}
public String getUserfirstname()
{
   return this.userfirstname;

}

public void setUserlastname(String  userlastname)
{
    this.userlastname= userlastname;

}
public String getUserlastname()
{
   return this.userlastname;

}
public void setPassword(String password)
{
    this.password= password;

}
public String getPassword()
{
   return this.password;

}
public void setRepassword(String repassword)
{
    this.repassword= repassword;

}
public String getRepassword()
{
   return this.repassword;

}
public void setGender(String gender)
{
    this.gender= gender;

}
public String getGender()
{
   return this.gender;

}
public void setAddress(String address)
{
    this.address= address;

}
public String getAddress()
{
   return this.address;

}
public void setMobileno(double mobileno)
{
    this.mobileno= mobileno;

}
public double getMobileno()
{
   return this.mobileno;

}
public void setEmailid(String emailid)
{
    this.emailid= emailid;

}
public String getEmailid()
{
   return this.emailid;

}
public String getAction()
{
   return this.action;

}
public void setAction(String action)
{
    this.action= action;

}
public String getBirthdate()
{
   return this.birthdate;

}
public void setBirthdate(String birthdate)
{
    this.birthdate= birthdate;

}
}



