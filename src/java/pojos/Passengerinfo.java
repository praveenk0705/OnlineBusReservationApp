package pojos;
// Generated Feb 1, 2011 6:53:29 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * Passengerinfo generated by hbm2java
 */
public class Passengerinfo  implements java.io.Serializable {


     private int seatno;
     private Userregistration userregistration;
     private Businfo businfo;
     private String passengername;
     private int age;
     private int amount;

    public Passengerinfo() {
    }

	
    public Passengerinfo(int seatno, String passengername, int age, int amount) {
        this.seatno = seatno;
        this.passengername = passengername;
        this.age = age;
        this.amount = amount;
    }
    public Passengerinfo(int seatno, Userregistration userregistration, Businfo businfo, String passengername, short age, int amount) {
       this.seatno = seatno;
       this.userregistration = userregistration;
       this.businfo = businfo;
       this.passengername = passengername;
       this.age = age;
       this.amount = amount;
    }
   
    public int getSeatno() {
        return this.seatno;
    }
    
    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }
    public Userregistration getUserregistration() {
        return this.userregistration;
    }
    
    public void setUserregistration(Userregistration userregistration) {
        this.userregistration = userregistration;
    }
    public Businfo getBusinfo() {
        return this.businfo;
    }
    
    public void setBusinfo(Businfo businfo) {
        this.businfo = businfo;
    }
    public String getPassengername() {
        return this.passengername;
    }
    
    public void setPassengername(String passengername) {
        this.passengername = passengername;
    }
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }




}

