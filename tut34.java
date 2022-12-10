public class tut34 {
    // static int factorial(int n)
    // {
          
    //     if(n==0 || n==1)
    //     {
    //         return 1;
    //     }else{
    //         return n*factorial(n-1);
    //     }
    //}

    // static int fact(int n)
    // {
    //     int ans=1;
    //     for(int i=1 ; i<=n ; i++)
    //     {  
    //           ans*=i;
    //     }
    //     return ans;
    // }

    static int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args)
    {
          System.out.println("the value of fctorial is " + fib(5));
    }
}
