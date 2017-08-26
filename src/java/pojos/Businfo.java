package pojos;
// Generated Feb 1, 2011 6:53:29 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Businfo generated by hbm2java
 */
public class Businfo  implements java.io.Serializable {


     private int busid;
     private String busname;
     private String servicetype;
     private int buscapacity;
     private String busrouteid;
     private Set passengerinfos = new HashSet(0);
     private Set busstops = new HashSet(0);

    public Businfo() {
    }

	
    public Businfo(int busid, String busname, String servicetype, int buscapacity, String busrouteid) {
        this.busid = busid;
        this.busname = busname;
        this.servicetype = servicetype;
        this.buscapacity = buscapacity;
        this.busrouteid = busrouteid;
    }
    public Businfo(int busid, String busname, String servicetype, int buscapacity, String busrouteid, Set passengerinfos, Set busstops) {
       this.busid = busid;
       this.busname = busname;
       this.servicetype = servicetype;
       this.buscapacity = buscapacity;
       this.busrouteid = busrouteid;
       this.passengerinfos = passengerinfos;
       this.busstops = busstops;
    }
   
    public int getBusid() {
        return this.busid;
    }
    
    public void setBusid(int busid) {
        this.busid = busid;
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
    public int getBuscapacity() {
        return this.buscapacity;
    }
    
    public void setBuscapacity(int buscapacity) {
        this.buscapacity = buscapacity;
    }
    public String getBusrouteid() {
        return this.busrouteid;
    }
    
    public void setBusrouteid(String busrouteid) {
        this.busrouteid = busrouteid;
    }
    public Set getPassengerinfos() {
        return this.passengerinfos;
    }
    
    public void setPassengerinfos(Set passengerinfos) {
        this.passengerinfos = passengerinfos;
    }
    public Set getBusstops() {
        return this.busstops;
    }
    
    public void setBusstops(Set busstops) {
        this.busstops = busstops;
    }




}


