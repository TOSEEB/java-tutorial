class phone{
    public void showtime()
    {
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
         System.out.println("playing music");
    }
    public void on(){
        System.out.println("turning on smart phone");
    }
}
public class tut49 {
    public static void main(String[] args) {
        //  one obj1 = new one();
        //  obj1.name();

        phone obj = new smartphone();


        obj.showtime();
        obj.on();
        // obj.music();   //not allowed//
    }
}
