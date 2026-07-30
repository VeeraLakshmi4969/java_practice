// import java.util.*;
// public class PriorityQueues {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> q = new PriorityQueue<>();
//         q.offer(10);
//         q.offer(20);
//         q.offer(5);
//         System.out.println(q.poll());
//     }
// }

import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.offer("mahadev");
        q.offer("Sriyansh");
        q.offer("palak");
        q.offer("sriyansh");
        q.offer("Mahi");
        System.out.println(q.poll());
        System.out.println(q);
    }
}