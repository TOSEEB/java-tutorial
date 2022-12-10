class base{
    public int x;

    base()
    {
        System.out.println("i am a constructor");
    }
    base(int x)
    {
        System.out.println("i am a overloaded constructor " + x);
    }
    public int getx()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x=x;
    }


}
class derived extends base{
    public int y;
   
    derived(){
        // super(0);
        System.out.println("i am a derved class constructor");
    }
    derived(int x, int y)
    {
        super(x);
        System.out.println("i am a overloaded constructor of derived class " + y);
    }
}

class childofDerived extends derived{
    
    childofDerived(){
        System.out.println("i am a child of derived constructor");
    }
    childofDerived(int x , int y , int z){
        super(x,y);
        System.out.println("i am a child of derived constructor " + z);
    }
}
 class tut46 {
    public static void main(String[] args) {
            //   base b= new base();
            // derived d = new derived();
            // derived d = new derived(4,3);
            childofDerived c = new childofDerived();
    }
}
