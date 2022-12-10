import java.util.*;
public class tut92 { 
    public static void main(String[] args) {
          
        //Linked list 
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l2.add(23);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(2,l2);
        l1.addLast(689);
        l1.addFirst(676);
        
       //  l1.clear();
        for(int i=0 ; i<l1.size() ; i++)
         
        {
            System.out.println(l1.get(i));
        }
    }
}
