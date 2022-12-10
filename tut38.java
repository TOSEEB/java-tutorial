class Employee{   //this is template
    int id;
    int salary;
    String name;

    public void printDetails() //this is method
    {
        System.out.println("my name is" + id);
        System.out.println("and my name is" + name);
    }

    public int getSalary()
    {
        return salary;
    }
}


public class tut38 {
  public static void main(String[] args) {
      System.out.println("this is our custom class");  
      //setting properties or attributes
      Employee harry = new Employee();   //syntax for createing object
      Employee roman = new Employee();

      harry.id=12;
      harry.name="codewithharry";
      harry.salary=34000;
      roman.id=21;
      roman.name="roman reings";
      roman.salary=12000;
      //printing the properties
      //System.out.println(harry.id);
      //System.out.println(harry.name);
      harry.printDetails();
      roman.printDetails();
      int salary = roman.getSalary();
      System.out.println(salary);
  }
}
