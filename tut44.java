class cylinder{
    private int radius;
    private int height;
    // public void setradius(int r)
    // {
    //     this.radius=r;
    // }
    // public void setheight(int h)
    // {
    //     this.height=h;
    // }
    // public int getheight()
    // {
    //      return height;
    // }
    // public int getradius()
    // {
    //      return radius;
    // }
    // public int getvolume()
    // {
    //      return radius;
    // }
    // public float getarea(int radius,int height)
    // {
    //     float area;
    //     area=2*3.14f*radius*height + 2*3.14f*radius*radius;
    //     return area;
    // }
    // public float getvolume(int radius,int height)
    // {
    //     float volume;
    //     volume=3.14f*radius*radius*height;
    //     return volume;
    // }

    // public  cylinder()
    // {
    //        radius=4;
    //        height=7;
    // }
    // public int getRadius() 
    // {
    //     return radius;
    // }

    // public int getheight() 
    // {
    //     return height;
    // } 
}

class rectangle{
    
    private int length;
    private int breadth;

    public rectangle()
    {
         this.length=20;
         this.breadth=30;

    }

    public rectangle(int l,int b)
    {
         this.length=l;
         this.breadth=b;

    }
    public int getlength()
    {
        return length;
    }
    public int getbreadth()
    {
         return breadth;
    }
}
public class tut44 {
    public static void main(String[] args) {
        //   cylinder object1 = new cylinder();
        //   object1.setradius(4);
        //   object1.setheight(7);
        //   System.out.println(object1.getradius());
        //   System.out.println(object1.getheight());

        //probelm2
        // cylinder object1= new cylinder();
        // System.out.println(object1.getvolume(4,7));
     
         //problem3

        //  cylinder object1 = new cylinder();
        // rectangle object1 = new rectangle();
        
        //  System.out.println(object1.getheight());
        //  System.out.println(object1.getRadius());


        //problem4
        rectangle object1 = new rectangle();
        System.out.println(object1.getlength());
        System.out.println(object1.getbreadth());

        

    }
}
