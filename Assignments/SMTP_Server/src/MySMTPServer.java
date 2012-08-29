/**
 * @author Ashwin Ramesh
 * This code is referencing the code found in the University of Sydney's COMP2121 Week 4 Lecture Slides
 */

import java.net.*;
import java.io.*;

public class MySMTPServer {

	public static void main(String[] args) {
		try {
			int port = 1063;
			ServerSocket listenSocket = new ServerSocket(port);
			while(true) {
				Socket clientSocket = listenSocket.accept();
				Thread t = new Thread(new Connection(clientSocket));
				t.start();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
