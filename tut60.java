
abstract class Pen{
        abstract void write();
        abstract void refill();
} 
class fountainPen extends Pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refilling ");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
      void jump(){
            System.out.println("jumping");
      }
      void bite(){
        System.out.println("biting");
      }
}

class Human extends Monkey implements BasicAnimal{
        void speak(){
            System.out.println("hello sir");
        }
        @Override
        public void eat(){
            System.out.println("kha loo");
        }
        @Override
        public void sleep(){
            System.out.println("sooo jaoooo");
        }

}
public class tut60 {
    public static void main(String[] args) {
        //problem1and 2
        //   fountainPen obj1 = new fountainPen();
        //   obj1.changeNib();

        //problem3
        // Human toseeb = new Human();
        // toseeb.sleep();


        Monkey m1 = new Human();
        m1.jump();
        // m1.speak();
        m1.bite();
        // m1.speak();   //cannot use speak method bcz the reference is monkey which does not have speak method
       

        BasicAnimal lavish = new Human();
        lavish.eat();
        // lavish.speak();
        lavish.sleep();
       

    }
}
