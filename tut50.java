import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputnumber;
    public int noOfGuesses=0;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
    void takeUserInput(){
           System.out.println("guess the number");
           Scanner sc = new Scanner(System.in);
           inputnumber = sc.nextInt();
         

    }
    boolean isCorrectNumber(){
        noOfGuesses++;
         if( inputnumber == number)
         {
            System.out.format("yes you guessed it right %d you guessed it in %d attempts", number , noOfGuesses);
             return true;
         }
         else if( inputnumber <number){
             System.out.println("too low");
         }
         else if( inputnumber >number)
         {
             System.out.println("too high");
         }
         return false;
    }

}
public class tut50 {
    public static void main(String[] args) {
        //guess the number
        //erercies 3
        Game g = new Game();
        boolean b = false;
        while(!b)
        {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}

