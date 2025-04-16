import java.lang.Thread;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("This is Thread 1");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("This is Thread 2");
            i++;
        }
    }
}

public class Threads_ext {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
