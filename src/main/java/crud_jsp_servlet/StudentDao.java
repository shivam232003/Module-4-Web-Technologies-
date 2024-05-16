package crud_jsp_servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;

public class StudentDao {

	public static void addStudent(Student s) {

		try {
			Connection conn = DBConnection.createConnectionMsg();
			String sql = "insert into student(fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());
			pst.executeUpdate();
			System.out.println("student added...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {
		boolean flag = false;

		try {
			Connection conn = DBConnection.createConnectionMsg();
			String sql = "select * from student where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public static Student studentLogin(String email, String pass) {

		Student s = null;

		try {
			Connection conn = DBConnection.createConnectionMsg();
			String sql = "select * from student where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setFname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getString("mobile"));
				s.setGender(rs.getString("gender"));
				s.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public static void updateStudent(Student s) {

		try {
			Connection conn = DBConnection.createConnectionMsg();
			String sql = "update student set fname=?,lname=?email=?,mobile=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getMobile());
			pst.executeUpdate();
			System.out.println("Student updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
