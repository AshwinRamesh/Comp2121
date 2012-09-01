import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ashwin Ramesh aram7972
 */

public class Email {
	
	static int emailNo = 0;
	private static final Object countLock = new Object();
	
	int sequenceNo;
	String from = "";
	String to = "";
	String date = "";
	String subject = "";
	String body = "";
	String mail_from = null;
	String rcpt_to = null;
	String mime = "";
	String contentType = "";
	/* Constructor */
	
	public Email() { 
		incrementSequence();
	}
	
	/* Setters */

	public void setContentType(String arg) {
		contentType = arg;
	}
	
	public void setMIME(String arg) {
		mime = arg;
	}
	
	public void setRCPT_TO(String arg) {
		rcpt_to = arg;
	}

	public void setMAIL_FROM(String arg) {
		mail_from = arg;
	}
	
	public void setSequenceNo(int number) {
		sequenceNo = number;
	}
	public void setFrom(String arg) {
		from = arg;
	}

	public void setTo(String arg) {
		to = arg;
	}
	
	public void setDate(String arg) {
		date = arg;
	}
	
	public void setSubject(String arg) {
		subject = arg;
	}
	
	public void setBody(String arg) {
		body = arg;
	}
	
	/* Getters */
	public int getSequenceNo(int number) {
		return sequenceNo;
	}
	
	public String getContentType( ) {
		return contentType; 
	}
	
	public String getFrom( ) {
		return from; 
	}

	public String getMIME( ) {
		return mime; 
	}
	
	public String getTo( ) {
		return to; 
	}
	
	public String getDate( ) {
		return date; 
	}

	public String getRCPT_TO( ) {
		return rcpt_to; 
	}
	
	public String getMAIL_FROM( ) {
		return mail_from;
	}
	
	public String getSubject( ) {
		return subject; 
	}
	
	public String getBody( ) {
		return body;
	}
	
	/* Other Methods */
	
	public void incrementSequence(){ // thread safe incrementation of the sequence number
		synchronized (countLock) {
			emailNo++;
			sequenceNo = emailNo;
		}
	}
	
	public void writeToFile() {
		File f;
		try {
			f = new File("log_"+sequenceNo+".txt");
			if (!f.exists()) 
				f.createNewFile();
			FileWriter fstream = new FileWriter(f);
			BufferedWriter out = new BufferedWriter(fstream);
			String dataOutput = formatEmailOutput();
			out.write(dataOutput);
			out.close();
		}
		catch(IOException ioe) {
			System.err.println(ioe);
		}
	}
	
	private String formatEmailOutput() {
		String returnString = "";
		returnString += "Message " + sequenceNo;
		returnString += "\nMIME-Version: " + mime;
		returnString += "\nContent-Type: " + contentType;
		returnString += "\nFrom: " + from;
		returnString += "\nTo: " + to;
		returnString += "\nDate: " + date;
		returnString += "\nSubject: " + subject;
		returnString += "\nBody: " + body;
		return returnString;
	}
	
}
