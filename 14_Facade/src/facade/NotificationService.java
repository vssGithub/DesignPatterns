package facade;

public class NotificationService {
	public void send(String message, String target) {
		var server = new NotificationServer();
		var connection = server.connect("12.32.65.5");
		var authToken = server.authenticate("appId", "key");
		
		System.out.println("NotificationService: " + message);		
		
		server.send(authToken, new Message(message), target);
		connection.disconnect();
	}
}
