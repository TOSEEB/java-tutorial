

class Employee{
    int salary;
    String name;

    public int getSalary()
    {
          return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
         name=n;
    }

}

class cellPhone{
    public void ring()
    {
           System.out.println("ringing");
    }
    public void Vibrate()
    {
           System.out.println("vibrating");
    }
    public void callFriend()
    {
         System.out.println("calling elon");
    }
}


class Square{
       int side;
       int area;
       int perimeter;
       public  int getArea(){
           area=side*side;  
           return area;
       }

       public int getperimeter()
       {
            perimeter=4*side;
            return perimeter;
       }
}


class Rectangle
{
    int length;
    int breadth;
    int area;
    int perimeter;
    public int getArea()
    {
          area=length*breadth;
          return area;
    }
    public int getPerimeter()
    {
          perimeter=2*(length+breadth);
          return perimeter;
    }
}


class pubg{
    public void  hit()
    {
        System.out.println("hitting");
    }
    public  void run()
    {
         System.out.println("running");
    }
    public void fire()
    {
        System.out.println("firing");
    }
}


class circle{

    float radius;
    float area;
    float circumference;
    public float  getArea()
    {
        area=3.14f*radius*radius;
        return area;
    }
    public float getCircumference()
    {
         circumference=2*3.14f*radius;
         return circumference;
    }
}

public class tut39
{
    public static void main(String[] args)
    {
        //pvroblem3
        // Square first= new Square();
        // first.side=6;
        
        // System.out.println(first.getArea());
        // System.out.println(first.getperimeter());

        //probelm4
        // Rectangle  first = new Rectangle();
        // first.length=2;
        // first.breadth=4;
        // System.out.println(first.getArea());
        // System.out.println(first.getPerimeter());


        //problem5
        // pubg player1=new pubg();
        // player1.fire();
        // player1.run();
        // player1.hit();


        //probelm6
        // circle object1 = new circle();
        // object1.radius=3;

      
        // System.out.println(object1.getArea());
        // System.out.println(object1.getCircumference()); 
        
    }
}
       