@FunctionalInterface
interface myFunctionalinterface
{
    void thisMethod();
}
class NewPhone extends phone{
    @Override
     public void showtime()
     {
        System.out.println("time is 12pm");
     }
     @Deprecated
     public int sum(int a, int b)
     {
        return a+b;
     }
}
public class tut108 {
    @SuppressWarnings("deprecation")
     public static void main(String[] args) {
           NewPhone phone = new NewPhone();
           phone.showtime();
           phone.sum(5,6);
    }

}
