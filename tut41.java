import java.util.Scanner;
import java.util.Random;
public class tut41 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter 0 for rock , 1 for paper , 2 for Scissor");
         int userinput = sc.nextInt();

         Random random = new Random();
         int computerInput = random.nextInt(3);


         if(userinput == computerInput)
         {
               System.out.println("draw");
         }
         else if(userinput==0 && computerInput==2 || userinput==1 && computerInput==0 || userinput==2 && computerInput==1)
         {

            System.out.println("you win");
         }
         else{
            System.out.println("you loose");
         }


         if(computerInput==0)
         {
            System.out.println("computer choice rock");
         }
         else if(computerInput==1)
         {
            System.out.println("computer choice paper");
         }
         else if(computerInput==2)
         {
            System.out.println("computer choice scissor");
         }

    }
}
