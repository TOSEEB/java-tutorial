class ques1a extends Thread{
       public void run()
       {
           while(true)
            {
                  System.out.println("good mornning");
             }
        }
    }
class ques1b extends Thread{
public void   run()
    {
        // while(true){
        //     System.out.println("welcome");
        //     try {
        //         Thread.sleep(200);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
    }
}

public class tut76 {
    public static void main(String[] args) {
            ques1a  obj1 = new ques1a();
            ques1b  obj2 = new ques1b();
            // obj1.setPriority(6);
            // obj2.setPriority(9);
            System.out.println(obj1.getPriority());
            System.out.println(obj2.getPriority());
            System.out.println(obj2.getState());
            // obj1.start();
            obj2.start();
            System.out.println(obj2.getState());
            System.out.println(Thread.currentThread().getState());
    }
}
