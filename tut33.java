public class tut33 {
    public static int sum(int x,int ...arr)
    {
        int result=x;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }
    public static  void main(String[] args)
    {
        System.out.println("welocme to varargs tutorial");
        System.out.println("the sum of nothing is" +sum(4));
        System.out.println("the sum of 4 ,3, and 5 is " + sum(4,3,5));
        System.out.println("the sum of 4 ,6 and  7 is "+ sum(4,6,7));
        System.out.println("the sum of 4 , 5 , 8  and 12  is "+ sum(4,5,8,12));

         
    }
}
