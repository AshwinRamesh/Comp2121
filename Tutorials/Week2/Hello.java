class Hello implements Runnable {
    
    public static int globalInt;

    public void run() {
        System.out.println("Hello World.");
    }

    public static void main(String[] args) {
        Thread mt = new Thread(new Hello());
        mt.start("");

    }



}