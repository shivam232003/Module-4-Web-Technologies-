package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.User;

public class UserDao {
	public static void addUser(User u) {
	 try {
		 Connection conn = DBConnection.createConnection();
		 String sql = "insert into user(fname,lname,email,mobile,password) values(?,?,?,?,?)";
		 PreparedStatement pst= conn.prepareStatement(sql);
		 pst.setString(1,u.getFname());
		 pst.setString(2,u.getLname());
		 pst.setString(3,u.getEmail());
		 pst.setLong(4,u.getMobile());
		 pst.setString(5,u.getPassword());

		 
	 }catch(Exception e) {
		 System.out.println("user not added ");
		 e.printStackTrace();
	 }
 }

}
