package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setStudent_id(1);
		s1.setStudent_name("java");

		Student s2 = new Student();
		s2.setStudent_id(2);
		s2.setStudent_name("php");

		Address a1 = new Address();
		a1.setAddress_id(1);
		a1.setStreet("maninagar");
		a1.setCity("ahmedabad");
		a1.setState("gujrat");
		a1.setZip_code("382330");

		Address a2 = new Address();
		a2.setAddress_id(2);
		a2.setStreet("nikol");
		a2.setCity("ahmedabad");
		a2.setState("gujrat");
		a2.setZip_code("382332");

		s1.setAddress(a2);
		s2.setAddress(a1);
		a1.setStudent(s2);
		a2.setStudent(s1);

		session.save(s1);
		session.save(s2);
		session.save(a1);
		session.save(a2);

		tx.commit();
		session.close();
		sf.close();
	}
}
