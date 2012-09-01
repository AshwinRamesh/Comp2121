/**
 * @author Ashwin Ramesh aram7972
 * This code is referencing the code found in the University of Sydney's COMP2121 Week 4 Lecture Slides
 */

import java.net.*;
import java.io.*;

public class MySMTPServer {

	static String hostName;
	
	public static void main(String[] args) {
		try {
			int port = 1063;
			ServerSocket listenSocket = new ServerSocket(port);
			listenSocket.getInetAddress();
			hostName = InetAddress.getLocalHost().getHostAddress();
			while(true) {
				Socket clientSocket = listenSocket.accept();
				Thread t = new Thread(new Connection(clientSocket,hostName));
				t.start();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
