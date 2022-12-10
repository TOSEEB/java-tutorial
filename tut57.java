interface camera{
    void takesSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("recording 4k video");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectTONetworks(String network);
}
class CellPhone{
    void callNumber(int phonenumber){
        System.out.println("phonenumber");
    }
    void pickCall(){
        System.out.println("connecting");
    }
    // void takeSnap(){
    //     System.out.println("take snap");
    // }
}
class SmartPhone extends CellPhone implements Wifi , camera{
    public void takesSnap(){
        System.out.println("take snap");
    }
    public void recordVideo(){
        System.out.println("screen rec");
    }
    public void connectTONetworks(String network){
         System.out.println("connecting......");
    }
    public String[] getNetworks(){
        // System.out.println("searching for network");
        String[] networkList ={"harry" ,"elon " , "jeff"};
        return networkList;
    }
    public void record4kVideo(){
        System.out.println("tanking snap");
    }
}
public class tut57 {
    public static void main(String[] args) {
          SmartPhone obj1 = new SmartPhone();
        //   obj1.record4kVideo();
      
        //   obj1.recordVideo();
          String[] str = obj1.getNetworks();   
          for(String item:str){
               System.out.println(item); 
          }
        // System.out.println(obj1.getNetworks());
    }
}
