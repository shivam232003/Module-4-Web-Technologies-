package message;

import java.util.Scanner;

public class UserView {
	
	 public User getUserInput() {
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter First Name: ");
	        String fname = scanner.nextLine();
	        System.out.print("Enter Last Name: ");
	        String lname = scanner.nextLine();
	        System.out.print("Enter Email: ");
	        String email = scanner.nextLine();
	        System.out.print("Enter Mobile: ");
	        String mobile = scanner.nextLine();

	        User user = new User();
	        user.setFname(fname);
	        user.setLname(lname);
	        user.setEmail(email);
	        user.setMobile(mobile);

	        return user;
	    }
}
