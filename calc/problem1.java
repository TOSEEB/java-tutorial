package calc;
class Calculator{
    public void calculate(int a,int b)
    {
        System.out.println("you result is "+ a+b);
    }
}

class ScCalculator{
    public void calculate(int a,int b)
    {
        System.out.println("your result is " + Math.sin(a+b));
    }
}

class HyCalculator{
    public void calculator(int a,int b)
    {
        System.out.println("you result is "+ a+b);
        System.out.println("your result is " + Math.sin(a+b));
    }

   
}
public class problem1 {
    public static void main(String[] args) {
        System.out.println("i am main method");
    }
}
