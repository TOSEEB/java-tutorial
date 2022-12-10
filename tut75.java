class MyThr1 extends Thread{
    public void run(){
      int i=0;
      while(true)
      {
          System.out.println("thank you " +  this.getName());
          try {
            Thread.sleep(455);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
      }
      
  }
}
class MyThr2 extends Thread{
    public void run(){
        int i=34;
        while(true)
        {
            System.out.println("to kese hai aap log " +  this.getName());
            
        } 
    }
}
public class tut75 {
    public static void main(String[] args) {
        
        //thread method 
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();

        t1.start();
        try{
            t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        t2.start();
    }
}
