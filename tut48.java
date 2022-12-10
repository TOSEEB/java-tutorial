class A{
    public int a;
    public int harrry(){
        return 4;
    }
    public void meth2(){
        System.out.println("i ame method 2 of class A");
    }
  

}

class B extends A{
    public void meth2(){   //method overriding
        System.out.println("i ame method 2 of class B");
    }
    public void meth3(){
        System.out.println("i am meth3 of class B");
    }
}
public class tut48 {
    public static void main(String[] args) {
         A object1 = new A();
         object1.meth2();

         B object2 = new B();
         object2.meth2();
    }
}
