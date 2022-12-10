interface Bicycle{
    public  int a=45;
    void must();
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface hornBicycle{
     void blowhornk3g();
     void blowhornmhn();
}
class AvonCycle implements Bicycle , hornBicycle{
    // public int a=47;
    public void applyBrake(int decrement){
         System.out.println("appluing brake");
    }
    public void speedUp(int decrement){
        System.out.println("applying speedup");
    }
    public void must(){
        System.out.println("testing");
    }
    public void blowhornk3g(){
        System.out.println("kabhi kushi kabhi gum");
    }
    public void  blowhornmhn(){
        System.out.println("mai hoon na");
    }
}
public class tut55 {
     public static void main(String[] args) {
           AvonCycle toseebcycle = new AvonCycle();
           toseebcycle.applyBrake(1);
           System.out.println(toseebcycle.a);
           toseebcycle.blowhornk3g();
           toseebcycle.blowhornmhn();
     }
}
