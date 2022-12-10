class Ekclass{
    int a;
    public int getA()
    {
        return a;
    }
    Ekclass(int a)
    {
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int c)
    {
        super(c);
        System.out.println("mai ek constructor hu");
    }
}
public class tut47 {
    public static void main(String[] args){
          Ekclass e = new Ekclass(5);
          Doclass d = new Doclass(45);
          System.out.println(e.getA());
           
    }
}
