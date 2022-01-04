package chainofresponsibilitytest;

import chainofresponsibility.Authenticator;
import chainofresponsibility.Compressor;
import chainofresponsibility.Encryptor;
import chainofresponsibility.HttpRequest;
import chainofresponsibility.Logger;
import chainofresponsibility.WebServer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Workflow 1: authenticator -> logger -> compressor");
		// authenticator -> logger -> compressor
		var compressor1 = new Compressor(null);
		var logger1 = new Logger(compressor1);
		var authenticator1 = new Authenticator(logger1);
		var server1 = new WebServer(authenticator1);
		server1.handle(new HttpRequest("admin", "1234"));
		
		System.out.println("Workflow 2: authenticator -> compressor -> encryption");
		// authenticator -> compressor -> encryption
		var encryption = new Encryptor(null);
		var compressor2 = new Compressor(encryption);
		var authenticator2 = new Authenticator(compressor2);
		var server2 = new WebServer(authenticator2);
		server2.handle(new HttpRequest("admin", "1234"));
	}

}
