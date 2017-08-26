/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;


public class BusStopBean {

     private String busname;
     private String servicetype;
     private String bustime;
     private int stopid;

     public BusStopBean()
     {
         
     }

     public BusStopBean(String busname, String servicetype,  String bustime ,int stopid) {

       this.busname = busname;
       this.servicetype = servicetype;
       this.bustime = bustime;
       this.stopid=stopid;

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
  
     public int getStopid() {
        return this.stopid;
    }

    public void setStopid(int stopid) {
        this.stopid =stopid;
    }


}
