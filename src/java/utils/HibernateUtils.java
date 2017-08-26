/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtils {


	private static SessionFactory sf;
	static {
		sf=new Configuration().configure().buildSessionFactory();

	}
	public static SessionFactory getSessionFactory()
	{
            
		return sf;
	}
}
