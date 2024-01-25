package thread;

public class ThreadEx {
    public static void main(String[] args) {
        System.out.println("Start");
        ThreadOne t1 = new ThreadOne(); // we can use to write data into the file
        ThreadTwo t2 = new ThreadTwo() ; // we can read data from the different file

        Thread actualThread = new Thread(t1);
        actualThread.start();
        t2.start();

        System.out.println("End");

    }
}
