//Queue<Integer> s=new LinkedList<>();
//queues are implemented using linkedlist so we must qive linkedlist class

/*import java.util.*;
class queues{
    public static void main(String args[])
    {
        Queue<Integer> s=new LinkedList<>();
        s.offer(10);
        s.offer(20);
        s.offer(70);
        System.out.println(s);
        System.out.println(s.peek());//front value
        System.out.println(s.poll());//read
        System.out.println(s);
    }
}*/

// with Strings also it work the same

import java.util.*;
class queues{
    public static void main(String args[])
    {
        Queue<String> s=new LinkedList<>();
        s.offer("palak");
        s.offer("veera");
        s.offer("lakshmi");
        System.out.println(s);
        System.out.println(s.peek());//front value
        System.out.println(s.poll());//read
        System.out.println(s);
    }
}