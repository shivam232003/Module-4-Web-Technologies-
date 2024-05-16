package OneToManyToOne;

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
		Transaction tr = session.beginTransaction();
		
		Cart c1 = new Cart();
		c1.setCart_id(1);
		c1.setName("abc");
		c1.setTotal(12000.45);
		
		Cart c2 = new Cart();
		c2.setCart_id(2);
		c2.setName("ghi");
		c2.setTotal(25000.63);
		
		Cart c3 = new Cart();
		c3.setCart_id(3);
		c3.setName("jkl");
		c3.setTotal(9000.63);
		
		Items i1 = new Items();
		i1.setItem_id(1);
		i1.setItem_total(45000.00);
		i1.setQuantity(3);
		
		Items i2 = new Items();
		i2.setItem_id(2);
		i2.setItem_total(40000.40);
		i2.setQuantity(5);
		
		Items i3 = new Items();
		i3.setItem_id(3);
		i3.setItem_total(85000.70);
		i3.setQuantity(5);
		
		Items i4 = new Items();
		i4.setItem_id(4);
		i4.setItem_total(85000.70);
		i4.setQuantity(10);
	
		
		Set<Items> iset1 = new HashSet<Items>();
		iset1.add(i1);
		iset1.add(i2);
		
		Set<Items> iset2 = new HashSet<Items>();
		iset2.add(i3);
		iset2.add(i4);
		
		c1.setItems(iset1);
		c2.setItems(iset2);
		i1.setCart(c1);
		i2.setCart(c1);
		i3.setCart(c2);
		i4.setCart(c2);
				
//		session.delete(c3);
		session.save(c1);
		session.save(i1);
		session.save(i2);
		session.save(i3);
		session.save(i4);
		
		tr.commit();
		session.close();
		sf.close();
	}
}
