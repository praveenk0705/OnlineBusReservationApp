/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.util.ArrayList;

import org.hibernate.*;


import utils.HibernateUtils;


public class HibernateBean
{

   // private ArrayList<String> stopList;
    private String name=null;
    public HibernateBean()
    {
        System.out.println("Inside  bean Constr"+getClass().getName());
      
    }

    public String getName()
    {
        return name;
    }
    public ArrayList<String> getstopList()
    {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        // create hib. session
        Session hs=null;
        ArrayList<String> routeList=null;
        Transaction tx=null;
        try
        {
            hs=HibernateUtils.getSessionFactory().openSession();
       
            System.out.println("Opensession");
            tx = hs.beginTransaction();
            System.out.println("Opensession trttt");
            String hql = "select distinct b.place from Busstop b";
            System.out.println("...........2...........");
        
            routeList =new ArrayList<String>(hs.createQuery(hql).list());
            System.out.println("...............3...........");
            if(routeList!=null)
            {
                return  routeList;
        
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        finally
        {
            tx.commit();
            hs.close();
        }
         return routeList;
    }
   
}
