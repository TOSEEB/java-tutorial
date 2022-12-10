class InvalidInputException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "cannot add 8 and 9";
    }
    // @Override
    // public String getMessage() {
    //     // TODO Auto-generated method stub
    //     return super.getMessage();
    // }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "input cannot be greater than 100000";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}
class MaxMulValue extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "cannot use value greater than 7000 in multiplication";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "cannot divide by 0";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}
class CustomCalcultor {
    public double addition(double a , double b) throws InvalidInputException , MaxInputException
    {
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        if(a==8 || b==9)
        {
            throw new  InvalidInputException();
        }
        return a+b;
    }
    public double substraction(double a , double b)   throws MaxInputException
    {
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        return a-b;
    }
    public double multiplication(double a , double b)   throws MaxInputException , MaxMulValue
    {
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        else if(a>7000  || b>7000){
             throw new MaxMulValue();
        }
        return a*b;
    }
    public double division(double a , double b)  throws  CannotDivideByZeroException   , MaxInputException
    {
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        if(b==0)
        {
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
  
}
public class tut103 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException , MaxInputException, MaxMulValue{
        
        //excercise 6: you have to create a custom calculator which throws the following exxception
        // 1 ->Addition;
        // 2->substraction
        // 3->multiplication
        // 4->division
        // which thorws the following exception:
        // 1. invalid input Exception ex 6 & 9
        // 2. cannot divide by 0 Exception
        // 3.max input Exception if any of the input is greater than 100000
        // 4.cannot multiplier reached exception - dont allow any multiplication input to be greater than 7000
        CustomCalcultor c = new CustomCalcultor();
        // c.addition(8,9);
        // c.division(5,0);
      
        c.multiplication(40000,7);

    }
}
 