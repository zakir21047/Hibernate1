package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration();  
    	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
    	      
    	    //creating seession factory object  
    	    SessionFactory factory=cfg.buildSessionFactory();  
    	      
    	    //creating session object  
    	    Session session=factory.openSession();  
    	      
    	    //creating transaction object  
    	    Transaction t=session.beginTransaction();  
    	          
    	    Employee e1=new Employee();  
    	    e1.setId(115);  
    	    e1.setFirstName("Rasheeda");  
    	    e1.setLastName("Vetapalem");  
    	      
    	    session.persist(e1);//persisting the object  
    	      
    	    t.commit();//transaction is commited  
    	    session.close();  
    	      
    	    System.out.println("successfully saved");  
    }
}
