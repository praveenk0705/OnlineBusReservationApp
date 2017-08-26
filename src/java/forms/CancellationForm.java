/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package forms;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;


public class CancellationForm extends org.apache.struts.action.ActionForm {
	 private int busno;
         private int seatno;
         private String action;

 public CancellationForm() {
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

    public void setBusno(int busno)
    {
        this. busno= busno;

    }
    public int getBusno()
    {
       return this.busno;

    }
    public void setSeatno(int seatno)
    {
        this. seatno= seatno;

    }
    public int getSeatno()
    {
       return this.seatno;

    }
}

