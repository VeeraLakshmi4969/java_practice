import java.util.*;

public class hashSets {
    public static void main(String args[]){
        //only difference between linkedHashSet and HashSet is linkedHashSet follow insertion order hashsets wont follow

        // SET ==> HashSet,LinkedHashSet, TreeSet
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(60);
        System.out.println(set);
        System.err.println(set.remove(20));
        System.err.println(set.remove(30));
        System.err.println(set);
    }
}
