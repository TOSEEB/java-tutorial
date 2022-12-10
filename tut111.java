import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class tut111 {
    public static void main(String[] args) {
         
        //code to cretae a new file
        // File myfile = new File("cwh11file.txt");
        // try{
        //     myfile.createNewFile();
        // }
        // catch(IOException e)
        // {
        //     System.out.println("unable to create this file");
        //     e.printStackTrace();
        // }

        //code to write to a file
        // try{

        //     FileWriter myfileWriter = new FileWriter("cwh11file.txt");
        //     myfileWriter.write("this is  our first file from this java course\n ok now bye");
        //     myfileWriter.close();
        // }
        // catch(IOException e)
        // {
        //      e.printStackTrace();
        // }

        //reading a file
        // File myfile = new  File("this.txt");
        // try {
        //     Scanner sc = new Scanner(myfile);
        //     while(sc.hasNextLine())
        //     {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } 
        // catch (FileNotFoundException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        //delete a file
        // File myfile= new File("cwh11file.txt");
        // if(myfile.delete())
        // {
        //     System.out.println("i have deleted " + myfile.getName());
        // }
        // else{
        //     System.out.println("some erorr occured while deleting a file");
        // }

    }
}
