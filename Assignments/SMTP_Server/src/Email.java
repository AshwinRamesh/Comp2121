
public class Email {
	
	int sequenceNo;
	String from;
	String to;
	String date;
	String subject;
	String body;
	
	/* Constructor */
	
	public Email() { /** TODO */
		
	}
	
	/* Setters */
	
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
	public String getFrom( ) {
		return from; 
	}

	public String getTo( ) {
		return to; 
	}
	
	public String getDate( ) {
		return date; 
	}
	
	public String getSubject( ) {
		return subject; 
	}
	
	public String getBody( ) {
		return body;
	}
	
	/* Other Methods */
	
	/** TODO */
	
}
