@FunctionalInterface
interface DemoAno{
    void meth1();
    // void meth2();

}
// class HarryFun  implements DemoAno{

//     @Override
//     public void meth1() {
//         // TODO Auto-generated method stub
//         System.out.println("this is meth1 ");
//     }
// }
// class AnnonyDemo implements DemoAno{
//     void display()
//     {
//         System.out.println("hello");
//     }

//     @Override
//     public void meth1() {
//         // TODO Auto-generated method stub
//         System.out.println("i am meth 1 ");
        
//     }

//     @Override
//     public void meth2() {
//         // TODO Auto-generated method stub
//         System.out.println("i am meth 2 ");
//     }
// }
public class tut109 {
    // DemoAno obj = new AnnonyDemo();
    // obj.meth1();
    public static void main(String[] args) {
        //Annonymous class
        //  DemoAno obj = new DemoAno() {
        //         @Override
        //         public void meth1()
        //         {
        //              System.out.println("i am meth 1");
        //         }

        //         @Override
        //         public void meth2()
        //         {
        //                System.out.println("i am meth 2");
        //         }
        //  };
        //  obj.meth1();

        //lambda Expression
        //   DemoAno obj = new HarryFun(); 
        //   obj.meth1();
        DemoAno obj = ()->{
            System.out.println("i am method 1");
        };
        DemoAno obj2 = ()->{
            System.out.println("i am method 2");
        };

        obj.meth1();
        obj2.meth1();


    }
        
}
