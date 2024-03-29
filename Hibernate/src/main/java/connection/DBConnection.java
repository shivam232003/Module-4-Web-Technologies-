package connection;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.User;

public class DBConnection {
	Session session = null;
	SessionFactory sf = null;
	Configuration cfg = null;
	Properties prop = null;

	public Session getSession() {
		prop = new Properties();
		prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernatecrud");
		prop.setProperty("hibernate.connection.username", "root");
		prop.setProperty("hibernate.connection.password", "");
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");
		cfg = new Configuration();
		cfg.setProperties(prop);
		cfg.addAnnotatedClass(User.class);
		sf = cfg.buildSessionFactory();
		session = sf.openSession();
		return session;
	}
}
