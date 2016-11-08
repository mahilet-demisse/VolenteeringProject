package VolenteeringProject.App;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VolenteeringProject.Model.Admin;
import VolenteeringProject.Model.Task;

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

@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
		Session s=null;
		Transaction tx=null;
		try{
			
			s=sessionFactory.openSession();
			tx=s.beginTransaction();

			
			List<Task>task=new ArrayList<Task>();
			Task t1=new Task();
			task.add(t1);
			
			Date d1=new Date();
			d1.setYear(2016);
			d1.setMonth(04);
			d1.setDate(01);

			Date d2=new Date();
			d2.setYear(2016);
			d2.setMonth(04);
			d2.setDate(01);
			
			Admin a1=new Admin();
			//a1.create_project(d1 , d2, task);
			
//creates new project and persist it
			s.persist(a1.create_project(d1 , d2, task));
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
