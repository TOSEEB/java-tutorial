import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class tut102 {
    public static void main(String[] args) {
        //PS Q1
        // ArrayList ar = new ArrayList();
        // ar.add("Student 1");
        // ar.add("Student 2");
        // ar.add("Student 3");
        // ar.add("Student 4");
        // ar.add("Student 5");
        // ar.add("Student 6");
        // ar.add("Student 7");
        // ar.add("Student 8");
        // ar.add("Student 9");
        // ar.add("Student 10");
        // for(Object o : ar)
        // {
        //     System.out.println(o);
        // }

        //PS Q2
        Date d = new Date();
        System.out.println(d.getHours() + ":" +  d.getMinutes()  +  ":" +  d.getSeconds());
        //PQ3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)  + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
       

        //PS Q4
        LocalDateTime dt = LocalDateTime.now();
       

        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);
        System.out.println(myDate);
        //PQ5
        // HashSet<Integer> s  = new HashSet();
        // s.add(5);
        // s.add(6);
        // s.add(46);
        // s.add(60);
        // s.add(9);
        // s.add(6);
 




    }
}
