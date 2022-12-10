import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tut101 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy -- E");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);
        System.out.println(myDate);

         
    }
}

