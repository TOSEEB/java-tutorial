import java.util.Scanner;
class MyException extends Exception{
     @Override
     public String toString() {
         // TODO Auto-generated method stub
         return  "I am to toString()";
     }
     @Override
     public String getMessage() {
         // TODO Auto-generated method stub
         return   "I am getMessage()";
     }
}
class MaxAgexception extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "age cannot be greater than 125";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return   "make sure that the value of age netered is correct";
    }
}
public class tut83 {
    public static void main(String[] args) {
         int a;
         Scanner sc= new Scanner(System.in);
         a=sc.nextInt();
         if(a<99)
         {
            try{
                // throw new MyException();
                throw new ArithmeticException("this is an exception");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());

                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
         }
    }
}
