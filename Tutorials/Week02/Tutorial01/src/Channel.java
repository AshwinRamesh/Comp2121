public interface Channel<E> {
	// Send a message to the channel
	public void send(E item);
		
	// Receive a message from the channel
	public E receive();
}