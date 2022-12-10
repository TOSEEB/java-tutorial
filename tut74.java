class MyThr extends Thread{
      public MyThr(String name)
      {
           super(name);
      }

      public void run(){
        int i=34;
        while(true)
        {
            System.out.println("thank you " +  this.getName());
        }
        
    }
}
public class tut74 {
    public static void main(String[] args) {
        //thread priority
        MyThr t1 = new MyThr("harry");
        MyThr t2 = new MyThr("rohit");
        MyThr t3 = new MyThr("karan");
        MyThr t4 = new MyThr("rajesh");
        MyThr t5 = new MyThr("shilpa");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        
        
        


        
    } 
}
