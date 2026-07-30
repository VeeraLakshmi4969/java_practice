import java.util.*;

public class linkedHashSets {
    //only difference between linkedHashSet and HashSet is linkedHashSet follow insertion order hashsets wont follow
    public static void main(String args[]){
        // SET ==> HashSet,LinkedHashSet, TreeSet
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(10);
        set.add(30);
        set.add(60);
        System.out.println(set);
        System.err.println(set.remove(20));
         System.err.println(set.remove(30));
          System.err.println(set);
    }
}
