package VolenteeringProject.App;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VolenteeringProject.Model.Admin;

public class App {
	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration();

			// This step will read hibernate.cfg.xml
			sessionFactory = configuration.configure().buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

public static void main(String[] args) {
		
		Session s=null;
		Transaction tx=null;
		try{
			
			s=sessionFactory.openSession();
			tx=s.beginTransaction();
			
			Admin a1=new Admin();
			s.persist(a1);
			
			tx.commit();
			
		}
		catch (HibernateException e) {
			System.err.println(e);
			if (tx != null) tx.rollback();
		} finally {
			if (s != null) s.close();
		}

	}
}
