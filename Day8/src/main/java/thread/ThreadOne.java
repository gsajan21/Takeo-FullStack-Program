package thread;

public class ThreadOne implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("ThreadOne." + Thread.currentThread());
        }
    }
}
