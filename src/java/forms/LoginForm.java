/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends org.apache.struts.action.ActionForm{

        String username;
        String password;
        String action;

public LoginForm() {
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

public void setUsername(String username)
{
    this.username=username;

}
public String getUsername()
{
   return this.username;

}
public void setPassword(String password)
{
    this.password= password;
}
public String getPassword()
{
   return this.password;
}
public String getAction()
{
   return this.action;

}
public void setAction(String action)
{
    this.action= action;

}

}



