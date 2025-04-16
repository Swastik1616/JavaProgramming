import java.lang.Thread;

class MyThread1 implements Runnable{
    @Override
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("This is Thread 1");
            i++;
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("This is Thread 2");
            i++;
        }
    }
}

public class Threads_run {
    public static void main(String[] args) {
        MyThread1 r1 = new MyThread1();
        Thread t1 = new Thread(r1);
        MyThread2 r2 = new MyThread2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
