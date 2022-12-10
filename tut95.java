import java.util.HashSet;

public class tut95 {
    public static void main(String[] args) {
        HashSet<Integer> myhashSet = new HashSet<>(6,0.5f);
        myhashSet.add(6);
        myhashSet.add(8);
        myhashSet.add(11);
        myhashSet.add(23);
        System.out.println(myhashSet);
    }
}
