class MyThreadRunnable implements Runnable{
      public void run(){
        for(int i=0 ; i<100 ; i++){
             System.out.println("i am a thread 1 not a threat");
        }
      }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
      for(int i=0 ; i<100 ; i++){
        System.out.println("i am a thread 2 not a threat");
   }
    }
}
public class tut71 {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();   //aesa kuch khas nahi hai ye runnable syd built in class hai
        //aur ye start function bhi built in hai  
    }
}
