import java.net.*;
import java.io.*;

public class Connection implements Runnable {

	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	String address,hostName;
	
	/* Response Strings */
	String 500_
	
	/********************/
	
	public Connection(Socket aClientSocket,String host) {
		try {
			clientSocket = aClientSocket;
			in = new DataInputStream(clientSocket.getInputStream());
			out = new DataOutputStream(clientSocket.getOutputStream());
			address = clientSocket.getLocalAddress().getHostAddress().toString();
			hostName = host;
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		try {
			out.writeUTF("Hi " + address + "\n");
			while (true) {
				@SuppressWarnings("deprecation")
				String lineInput = in.readLine();
				
				if (lineInput.substring(0,4).equals("HELO")){
					commandHELO(lineInput.trim());
				}
				else if(lineInput.substring(0, 4).equals("QUIT")) {
					commandQUIT(lineInput.trim());
				}
				else if(lineInput.substring(0,10).equals("MAIL FROM:")){
					commandMAILFROM();
				}
				else if(lineInput.substring(0,8).equals("RCPT TO:")){
					commandRCPTTO();
				}
				else if(lineInput.substring(0,4).equals("DATA")){
					commandDATA();
				}
				else {
					commandERROR();
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
	
	private void commandDATA(String line) throws IOException {
		// TODO Auto-generated method stub
		
	}

	private void commandRCPTTO(String line) throws IOException {
		// TODO Auto-generated method stub
		
	}

	private void commandMAILFROM(String line) throws IOException {
		// TODO Auto-generated method stub
		
	}

	private void commandQUIT(String line) throws IOException {
		// TODO Auto-generated method stub
		
	}

	private void commandERROR(String line) throws IOException {
		// TODO Auto-generated method stub
		
	}

	private void commandHELO(String line) throws IOException {
		
	}
}
