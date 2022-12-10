abstract class Parent{    //abstract class ek aese class hai jiske help se aur classes banege
    public Parent(){      //set a standard for other classes
        System.out.println("mai base2 ka constructor hu");
    }
    public void seyHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
    

}

class child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");

    }
    @Override
    public void greet2(){
        System.out.println("good morning");

    }
}
abstract class child2 extends Parent{
   public void th(){
        System.out.println("i am good");
   }
}
public class tut53 {
    public static void main(String[] args) {
          
              child obj = new child();
        //    Parent obj2 = new Parent(); //thow an error
        //    child2 obj2 = new child2();  //thow an error
         
        
         
    }

}
