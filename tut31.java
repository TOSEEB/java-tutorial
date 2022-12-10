public class tut31 {

     static int logic(int x, int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
}
    public static void main(String[] args)
    {
        int a=5;
        int b=7;
        int c;
        // tut31 obj = new tut31();  
        // c=obj.logic(a,b);
        c =logic(a,b);
        // int a1=7;
        // int b1=3;
        // int c1;
        
        // // c1=logic(a1,b1);
        System.out.println(c);
        // System.out.println(c1);

        
    } 
}
