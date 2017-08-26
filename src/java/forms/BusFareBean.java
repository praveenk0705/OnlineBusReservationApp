
package forms;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;


public class BusFareBean extends org.apache.struts.action.ActionForm {
	 private int selectedbus;
         private String action;

public BusFareBean() {
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

public void setAction(String action)
{
    this.action=action;

}
public String getAction()
{
   return this.action;

}

public void setSelectedbus(int  selectedbus)
{
    this. selectedbus= selectedbus;

}
public int getSelectedbus()
{
   return this. selectedbus;

}
}

