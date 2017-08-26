/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;


public class SearchBean {

     private String busname;
     private String servicetype;
     private String bustime;
    
     public SearchBean()
     {

     }

     public SearchBean(String busname, String servicetype,  String bustime ) {

       this.busname = busname;
       this.servicetype = servicetype;
       this.bustime = bustime;
      
    }


    public String getBusname() {
        return this.busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }
    public String getServicetype() {
        return this.servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    public String getBustime() {
        return this.bustime;
    }

    public void setBustime(String bustime) {
        this.bustime =bustime;
    }

}
