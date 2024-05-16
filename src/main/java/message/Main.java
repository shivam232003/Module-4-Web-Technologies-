package message;

public class Main {

	public static void main(String[] args) {
		
		MessageController messageController = new MessageController();
        MessageView messageView = new MessageView();

        // Send a message
        Message newMessage = messageView.getMessageInput();
        messageController.sendMessage(newMessage);
        
        
        UserController userController = new UserController();
        UserView userView = new UserView();

        // Create a new user
        User newUser = userView.getUserInput();
        userController.createUser(newUser);

	}

}
