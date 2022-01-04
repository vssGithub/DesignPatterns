package facade;

public class Message {
	private String content;

	public Message(String content) {
		this.content = content;
	}
	
	//https://www.geeksforgeeks.org/overriding-tostring-method-in-java/
	@Override
	public String toString() {
		return String.format("message: " + content) ;
	}
}
