public class tut107 {
    /**
     * 
     * @param args These are arguments supplied to the command line
     */
   
    public static void main(String[] args) {
        
         System.out.println("i am main method");
    }
    /**
     * 
     * @param i  This is the first number to add
     * @param j  This is the second number to add
     * @return   Sum of two number as integer
     * @throws Exception if i is 0
     * @deprecated This method is depricated please use+ operator
     * 
     */

    public int add(int i , int j)  throws Exception
    {
        if(i==0)
        {
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
