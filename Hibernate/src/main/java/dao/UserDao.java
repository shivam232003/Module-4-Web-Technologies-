package dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {

	public static void addUser(User u) {

		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.save(u);
			tx.commit();
			session.close();
			sf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean loginUser(String email, String password) {
		boolean flag = false;

		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Query sql = session.createQuery("from User where email = :email and password = :password",User.class);
			sql.setParameter("email", email);
			sql.setParameter("password", password);
			User u = (User) session.get(User.class, 1);
			
			if(u != null && u.getPassword().equals(password)) {
				flag = true;
			}
			
			tx.commit();
			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
