import java.net.*;
import java.io.*;

public class Connection implements Runnable {

	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	
	public Connection(Socket aClientSocket) {
		try {
			clientSocket = aClientSocket;
			in = new DataInputStream(clientSocket.getInputStream());
			out = new DataOutputStream(clientSocket.getOutputStream());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		try {
			while (true) {
				@SuppressWarnings("deprecation")
				String lineInput = in.readUTF();
				if (lineInput.equals("HELO")){
					out.writeUTF("My name is Ashwin.");
				}
				else {
					clientSocket.close();
				}
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(clientSocket != null) {
				try {
					clientSocket.close();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
}
