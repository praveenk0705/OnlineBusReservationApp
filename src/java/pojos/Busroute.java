package pojos;
// Generated Feb 1, 2011 6:53:29 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Busroute generated by hbm2java
 */
public class Busroute  implements java.io.Serializable {


     private int routeserialid;
     private String routeid;
     private String stationone;
     private String stationtwo;
     private Set busfares = new HashSet(0);

    public Busroute() {
    }

	
    public Busroute(int routeserialid, String routeid, String stationone, String stationtwo) {
        this.routeserialid = routeserialid;
        this.routeid = routeid;
        this.stationone = stationone;
        this.stationtwo = stationtwo;
    }
    public Busroute(int routeserialid, String routeid, String stationone, String stationtwo, Set busfares) {
       this.routeserialid = routeserialid;
       this.routeid = routeid;
       this.stationone = stationone;
       this.stationtwo = stationtwo;
       this.busfares = busfares;
    }
   
    public int getRouteserialid() {
        return this.routeserialid;
    }
    
    public void setRouteserialid(int routeserialid) {
        this.routeserialid = routeserialid;
    }
    public String getRouteid() {
        return this.routeid;
    }
    
    public void setRouteid(String routeid) {
        this.routeid = routeid;
    }
    public String getStationone() {
        return this.stationone;
    }
    
    public void setStationone(String stationone) {
        this.stationone = stationone;
    }
    public String getStationtwo() {
        return this.stationtwo;
    }
    
    public void setStationtwo(String stationtwo) {
        this.stationtwo = stationtwo;
    }
    public Set getBusfares() {
        return this.busfares;
    }
    
    public void setBusfares(Set busfares) {
        this.busfares = busfares;
    }




}


