//in java deque using ArrayDeque class
import java.util.*;
public class Deques {
    public static void main(String args[]){
        Deque<Integer> dp = new ArrayDeque<>();
        //we donot use offer in this
        dp.addFirst(10);
        dp.addFirst(789);
        dp.addFirst(30);
        dp.addLast(79);
        dp.addFirst(2);
        dp.addLast(1);
        System.out.println(dp);
        System.out.println(dp.removeFirst());
        System.out.println(dp);
        System.out.println(dp.removeLast());
        System.out.println(dp);
        System.out.println(dp.remove(10));
        System.out.println(dp);
        System.out.println(dp.removeAll(dp));
        System.out.println(dp);
        }
}
