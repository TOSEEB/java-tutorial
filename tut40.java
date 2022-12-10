class myemployee{

    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
            this.name=n;
    }
    public int getId()
    {
        return id;
    }
    public  void setId(int i)
    {
         this.id=i;
    }
}
public class tut40 {
    public static void main(String[] args) {
          myemployee harry =new myemployee();
        //   harry.id=101;
        //   harry.name="codewithharry";  -->thow error becz of private access modefier

        harry.setName("codewithharry");
        System.out.println(harry.getName());
        harry.setId(120);
        System.out.println(harry.getId());

    }
}
