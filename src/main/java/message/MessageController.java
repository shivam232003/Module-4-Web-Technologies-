package message;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class MessageController {
	
	  public void sendMessage(Message m) {
	      
		 try {
			 Connection conn = DBConnection.createConnectionMsg();
			 String sql = "insert into msg(from_a,to_b,msg) values(?,?,?)";
			 PreparedStatement pst = conn.prepareStatement(sql);
			 pst.setString(1, m.getFrom());
			 pst.setString(2, m.getTo());
			 pst.setString(3, m.getMsg());
			 pst.executeUpdate();
			 System.out.println("Msg Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	  }
}
