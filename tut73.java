class MyThr extends Thread{
    public MyThr(String name)
    {
            super(name);
          
    }
   
    public  void run(){
        //  while(true)
        //  {
        //     System.out.println("i am a thread");
        //  }
        int i=34;
        System.out.println("thank you");
    }
}
public class tut73 {
    public static void main(String[] args) {
            MyThr t1 = new MyThr("Harry");
            MyThr t2 = new MyThr("mark zukerberg");
            t1.start();
            System.out.println("the id of thread is " + t1.getId());
            System.out.println("the name of thread is " + t1.getName());
            t2.start();
            System.out.println("the id of thread is " + t2.getId());
            System.out.println("the name of thread is " + t2.getName());
    }
}
