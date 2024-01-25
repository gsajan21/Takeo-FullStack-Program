package thread;

public class ThreadTwo extends Thread{

    @Override
    public void run() {
        for(int i = 1; i < 11; i ++) {
            System.out.println("ThreadTWo is counting "+ i+ " " + Thread.currentThread());

        }
    }
}
