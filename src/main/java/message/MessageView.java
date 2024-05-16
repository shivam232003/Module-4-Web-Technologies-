package message;

import java.util.Scanner;

public class MessageView {
	
	 public Message getMessageInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("From: ");
	        String from = scanner.nextLine();
	        System.out.print("To: ");
	        String to = scanner.nextLine();
	        System.out.print("Message: ");
	        String msg = scanner.nextLine();

	        Message message = new Message();
	        message.setFrom(from);
	        message.setTo(to);
	        message.setMsg(msg);

	        return message;
	    }
}
