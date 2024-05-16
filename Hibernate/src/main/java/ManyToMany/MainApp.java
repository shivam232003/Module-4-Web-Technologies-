package ManyToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Reader r1 = new Reader();
		r1.setId(1);
		r1.setFirst_name("Meet");
		r1.setLast_name("Vaghela");
		r1.setEmail("meet@gmail.com");
		
		Reader r2 = new Reader();
		r2.setId(2);
		r2.setFirst_name("Shivam");
		r2.setLast_name("Goswami");
		r2.setEmail("shivam123@gmail.com");
		
		Reader r3 = new Reader();
		r3.setId(3);
		r3.setFirst_name("Raj");
		r3.setLast_name("Prajapati");
		r3.setEmail("raj159@gmail.com");
		
		Reader r4 = new Reader();
		r4.setId(4);
		r4.setFirst_name("Jay");
		r4.setLast_name("Lal");
		r4.setEmail("jay123@gmail.com");
		
		Subscription s1 = new  Subscription();
		s1.setId(1);
		s1.setSubscription_name("amazon prime");
		
		Subscription s2 = new  Subscription();
		s2.setId(2);
		s2.setSubscription_name("kuku fm");
		
		Subscription s3 = new  Subscription();
		s3.setId(3);
		s3.setSubscription_name("disney plus hotstar");
		
		Subscription s4 = new  Subscription();
		s4.setId(4);
		s4.setSubscription_name("netflix");
		
		
		Set<Reader> rset1 = new HashSet<Reader>();
		rset1.add(r1);
		rset1.add(r2);
		rset1.add(r3);
		rset1.add(r4);
		
		Set<Subscription> sset = new HashSet<Subscription>();
		sset.add(s1);
		sset.add(s2);
		sset.add(s3);
		sset.add(s4);
		
		r1.setSubscription(sset);
		r2.setSubscription(sset);
		r3.setSubscription(sset);
		r4.setSubscription(sset);
		s1.setReader(rset1);
		s2.setReader(rset1);
		s3.setReader(rset1);
		s4.setReader(rset1);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(r1);
		session.save(r2);
		session.save(r3);
		session.save(r4);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
