// import java.util.Scanner;
public class tut35 {
    static void table(int n)
    {
        for(int i=1 ; i<=10  ; i++)
        {
            System.out.format("%d * %d  = %d\n" ,n , i , n*i);
        }
    }

    static void pattern(int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                    System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int recsum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n+recsum(n-1);
        }
    }

    static void pattern2(int n)
    {
        for(int i=n ; i<=1 ; i--)
        {
        //     for(int j=0 ; j<i ; j++)
        //     {
        //         System.out.println("*");
        //     }
            System.out.print("8");
        }
    }

    static int fib(int n)
    {

       
        if(n==1 || n==2)
        {
             return (n-1);
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }


    static float avg(int ...arr)
    {  
           float sum=0;
           float count=0;
           for(int element: arr)
           {
                 sum+=element;
                 count++;
           }
           float ans= sum/count;
           return ans;

    }

    static void pattern1_rec(int n)
    {
       if(n>0)
       {
         pattern1_rec(n-1);
         for(int i=0 ; i<n ; i++)
         {
             System.out.print(" * ");
         }
         System.out.println("");
       }
    }

    static void pattern2_rec(int n)
    {
        if(n==0)
        {
            return ;
        }
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(" * ");
        }
        System.out.println("");
        pattern2_rec(n-1);
    }
    public static void main(String[] args)
    {
        //probelm1     
        // table(8);

        //probelm2
        // pattern(5);

        //probelm3
        // System.out.println(recsum(6));

        //probelm4
        // pattern2(4);
        //do latter

        //probelm5
        // System.out.println(fib(7));


        //probelm6
        // System.out.println(avg(2,4,6,8,12));
        
        //problem7
        // pattern2_rec(4);
        //probelm8
        pattern1_rec(9);

        //probelm
    }
}
