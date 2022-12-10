import java.io.FileWriter;
import java.io.IOException;
class MyDeprecated {
    @Deprecated
    void meth1(){
        System.out.println("i am method 1");
    }
}

 interface MyInt{
    void display();
}
public class tut112 {
    public static void main(String[] args) {
        //    MyDeprecated d = new MyDeprecated();
        //    d.meth1();
        //    MyInt i = ()-> System.out.println(" i am display");

            //code to write to a file
        // int i=19;
        String table ="";
        for(int i=2 ; i<=9 ;i++)
        {
                for(int j=1 ; j<=10 ; j++)
                {
                    table += i +"X" + j + "=" + i*j;
                    table+="\n";
                    if(j==10)
                    {
                        table+="\n";
                    }
                }
        }
        try{

            FileWriter myfileWriter = new FileWriter("multiplication.txt");
            myfileWriter.write(table);
            myfileWriter.close();
        }
        catch(IOException e)
        {
             e.printStackTrace();
        }

    }
}

