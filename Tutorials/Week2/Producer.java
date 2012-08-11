import java.util.Date;

public class Producer implements Runnable {
    private Channel<Date> queue;
    
    public Producer(Channel<Date> queue) {
        this.queue = queue;
    }
    
    public void run() {
        Date message;
        while (true) {
            // nap for a while
            /*try {
                Thread.sleep(500);
            } catch (Exception E) { System.err.println("Already interrupted"); }*/
                
            // produce an item and enter it into the shared buffer
            message = new Date();
            System.out.println("Producer produced " + message);
            queue.send(message);
        }
    }
}