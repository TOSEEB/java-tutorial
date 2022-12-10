package com.codewithharry.shape;


class rectangle{
    float length;
    float breadth;
    public float area(int l , int b){
             this.length=l;
             this.breadth=b;
             return length*breadth;
    }
}

class square{
     float side;
     public float sq_area(int s){
        this.side=s;
        return side*side;
     }
}

class circle{
    float radius;
    public float area(int r){
        this.radius=r;
        return 3.14f*radius*radius;
    }
}
class cylinder extends circle{
       int height;
       public float volume(int h)
       {
            this.height=h;
            return 3.14f*radius*radius*height;
       } 
       public float surf_area()
       {
            float cyl_area=  2*3.14f*radius*height  + 2*3.14f*radius*radius;
            return cyl_area;
       }
        
}

class Sphere extends circle{
      public float  sph_area()
      {
           return 4*3.14f*radius*radius;
      }
      public float sph_vol()
      {
           return (4/3)*3.14f*radius*radius*radius;
      }
}
public class tut68 {
    public static void main(String[] args) {
        //erercise 5
        // you have to create a package named com.codewithharry.shape
        // this package should have individual classes for rectangle , square , circle , cylinder , Sphere 
        // these classes should use inheritence to properly manage the code!
        // include methods like volume , surface area and getters/setters for dimension

        circle obj1 = new circle();
        obj1.area(12);
        Sphere sp1 = new Sphere();
     
        System.out.println(sp1.sph_area());
        System.out.println(sp1.sph_vol());


    }
}
