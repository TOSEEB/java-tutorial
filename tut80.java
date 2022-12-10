public class tut80 {
    
    public static void main(String[] args) {
         int a=698;
         int b=0;
        //  int c=a/b;
        //  System.out.println("the  result is " + c);
         //with try
         try{
            int c=a/b;
            System.out.println("the result is " + c);
         }
         catch(Exception e)
         {
            System.out.println("we failed to divide reason");
            System.out.println(e);
         }


    }
}
