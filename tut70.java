class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100)
        {
          System.out.println("my cooking thread is running");
          System.out.println("i am happy");
          i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100)
        {
          System.out.println("thread 2 for chatting with her");
          System.out.println("i am sad");
          i++;
        }
    }

}
public class tut70 {
    public static void main(String[] args) {
          MyThread1 t1 = new MyThread1();
          MyThread2 t2 = new MyThread2();
          t1.start();
          t2.start();

    }
}
