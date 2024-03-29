package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Model.User;
import connection.DBConnection;

public class UserDao {
	SessionFactory sf = null;
	Session session = null;
	Transaction tx = null;
	public void insertUser(User u) {
		session = new DBConnection().getSession();
		tx  = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
	}
}

