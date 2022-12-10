
class base{
      int x;
      public int getx()
      {
          return x;
      }
      public void setx(int x)
      {
         System.out.println("i am in base setting base now");
          this.x=x;
      }
}
class base1{
    int z;
    public int getz()
    {
        return z;
    }
    public void setx(int z)
    {
       System.out.println("i am in base setting base now"); 
        this.z=z;
    }
}
class derived extends base{
    int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y)
    {
        this.y=y;
    }
}
public class tut45 {
    public static void main(String[] args) {
          base b = new derived();
          b.setx(6);
          System.out.println(b.getx());
          derived d = new derived();
          d.setx(76);
          System.out.println(d.getx());
    }
}
