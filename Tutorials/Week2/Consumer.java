import java.util.Date;

public class Consumer implements Runnable {
    private Channel<Date> queue;
    
    public Consumer(Channel<Date> queue) {
        this.queue = queue;
    }
    
    public void run() {
        Date message;
        while (true) {
            // nap for a while
            try {
                Thread.sleep(500);
            } catch (Exception E) { System.err.println("Already interrupted"); }
            
            // consume an item from the shared buffer
            message = queue.receive();
            if (message != null)
                System.out.println("Consumer consumed" + message);
        }
    }
}