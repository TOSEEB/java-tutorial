import java.util.Scanner;

public class tut82 {
      public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("enter the value of index");
            int ind = sc.nextInt();
            try{
                    System.out.println("welocme to video no 82");
                    try{
                            System.out.println(marks[ind]);
                            flag=false;
                    }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println("sorry this index does not exist");
                        System.out.println("exception in level 2");
                    }
            }
            catch(Exception e)
            {
                System.out.println("exception in level 1");
            }
      }
}
}