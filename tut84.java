class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "radius cannot be negative";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return   "make sure that the value of age netered is correct";
    }
}
public class tut84 {
    public static double area(int r) throws NegativeRadiusException
    {
        if(r<0)
        {
             throw new  NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;

    }
    public static int divide(int a , int b) 
    // throws ArithmeticException
    {
        //made by harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //throw and throws
        //shivam-uses divide function created by harry
        try{

            // int c= divide(6,0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println("exception");
        }
    }
}
