class circle{
    public int  radius;
    circle(){
        System.out.println("i am non param of circle");
    }
    circle(int r)
    {
        System.out.println("i am parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return   Math.PI*this.radius*this.radius;
    }

   
}
class cylinder extends circle{
      public int height;
      cylinder(int r ,int h)
      {
          super(r);
          System.out.println("i am cylinder parameterised constructor");
          this.height=h;
      }
      public double volume(){
            //  return  Math.PI*this.radius*this.radius*this.height;
             return area()*this.height;
      }
}

class rectangle{
    public int length;
    public int breadth;
    rectangle(int l , int b)
    {
        this.length=l;
        this.breadth=b;
    }
    public int  rec_area()
    {
         return 2*(length+breadth);
    }
}
class cuboid extends rectangle{
      public int height;
      cuboid(int l , int b ,int h){
             super(l,b);
             this.height=h;
      }
      
      public int cub_vol()
      {
           return length*breadth*height;
      }
}
public class tut52 {
    public static void main(String[] args) {
          
        //problem1

        //   circle  obj1 = new circle(3);
        //   System.out.println(obj1.area());
        //  cylinder obj2 = new cylinder(5,6);   
        //  System.out.println(obj2.volume());

        //problem2
        //  rectangle obj1 = new rectangle();
        //  obj1.setlen_bred(3,5);
        //  obj1.setbred(3);
        // System.out.println(obj1.rec_area());
        //  System.out.println(obj1.rec_area());
            cuboid obj2 = new cuboid(2,3,4);
            System.out.println(obj2.cub_vol());
    }
} 
 