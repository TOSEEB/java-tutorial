// import java.util.*;
import java.util.ArrayList;
class myGeneric<T1 , T2>
{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val, T1 t1 , T2 t2)
    {
           this.val=val;
           this.t1=t1;
           this.t2=t2;
    }
    public int  getval()
    {
        return val;
    }

    public void setval(int val)
    {
        this.val=val;
    }
   
    public T1  getT1()
    {
        return t1;
    }

    public void setT2(T2 t2)
    {
        this.t2=t2;
    }
    public T2  getT2()
    {
        return t2;
    }

    public void setT1(T1 t1)
    {
        this.t1=t1;
    }
}
public class tut110 {
    public static void main(String[] args) {
        //   ArrayList<String> lst = new ArrayList();
         
        //   lst.add("hghjg");
        //   lst.add("srd");
        
        //   String a =(String) lst.get(0);
        //   System.out.println(a);
          myGeneric<String , Integer> g1 = new myGeneric(23,"MyString is money" , 777);
          String str = g1.getT1();
          Integer str2 = g1.getT2();

          System.out.println(str);
          System.out.println(str2);
    }
}
