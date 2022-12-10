class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
            id=45;
            name="elon musk";
    }


 
    public MyMainEmployee(String myname){
                id=45;
                name=myname;
    }
    public void setId(int i)
    {
         this.id=i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
          this.name=n;
    }
    public String getName()
    {
         return name;
    }
}
public class tut42
{
    public static void main(String[] args) {
       // MyMainEmployee harry = new MyMainEmployee("mark zukerberg");
       
       MyMainEmployee harry = new MyMainEmployee();
    
        // harry.setName("codwithharry");
        // harry.setId(34);
        // System.out.println(harry.getName());
        // System.out.println(harry.getId());
    }
}
