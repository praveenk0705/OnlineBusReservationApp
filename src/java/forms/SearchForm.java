/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

/**
 *
 * @author dl724
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import pojos.Busroute;


/**
 *
 * @author dl723
 */
public class SearchForm extends org.apache.struts.action.ActionForm {

     private String stopone;
     private String stoptwo;
     private String action;

     private ArrayList<Busroute> list=null;


    public SearchForm() {
        super();
        // TODO Auto-generated constructor stub
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

     public ArrayList<Busroute> getList() {
        return list;
    }

      public void setList(ArrayList<Busroute> list) {
        this.list=list;
    }
    public String getStopone()
    {
        System.out.println("setone "+stopone);
        return stopone;
    }


    public void setStopone(String stopone) {
         System.out.println("get1 "+stopone);
        this.stopone = stopone;
    }

    public String getStoptwo() {
         System.out.println("getstop2 "+stoptwo);
        return stoptwo;
    }


    public void setStoptwo(String stoptwo) {
        System.out.println("settop2 "+stoptwo);
        this.stoptwo = stoptwo;
    }


    public String getAction() {
        System.out.println("setacbtn "+action);
        return action;

    }

    public void setAction(String action) {
        System.out.println("getbtn "+action);
        this.action = action;
    }

}

