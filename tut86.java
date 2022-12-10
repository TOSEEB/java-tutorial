import java.util.Scanner;
public class tut86 {
    public static void main(String[] args) {
         //problem1 
        //syntax error  int a=3
        
        // int age=70;
        // int year_born=2000-78; //logical error

        // System.out.println(6/0);

        //probelm-2
        // try{
        //     int a=666/0;
        // }
        // catch(IllegalArgumentException e)
        // {
        //     System.out.println("haa haa");
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("hee hee");
        // }
        // catch(Exception e)
        // {
        //   System.out.println(e);
        // }

        //probelm-3
        boolean flag=true;
        int  [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc= new Scanner(System.in);
        int index;
        int count=0;
        while(flag && count<5)
        {
            try{

                index=sc.nextInt();
                System.out.println("the value of marks[ind] is " + marks[index]);
                break;
            }
            catch(Exception e)
            {
                System.out.println("invalid index");
                count++;

            }
            if(count>=5)
            {
                System.out.println("error");
            }
        }



    }
}
