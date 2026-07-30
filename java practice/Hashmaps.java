import java.util.*;
public class Hashmaps {
    //it does not follow insettion order
    public static void main(String args[]){
        HashMap<Integer,String> dictionary = new HashMap<>();
        dictionary.put(6 ," python");
        dictionary.put(1 ," python");
        dictionary.put(2 ," html");
        dictionary.put(3 ," css");
        dictionary.put(4 ," js");
        dictionary.put(5 ," java");
        System.out.println(dictionary);
        System.out.println(dictionary.get(5));
    }
}

// import java.util.*;
// public class maps {
//     public static void main(String args[]){
//         HashMap<String,String> dictionary = new HashMap<>();
//         dictionary.put("mahadev" ," python");
//         dictionary.put("Sriyansh"," html");
//         dictionary.put("Veera Lakshmi" ," css");
//         dictionary.put("Srinu" ," js");
//         dictionary.put("ramalakshmi" ," java");
//         System.out.println(dictionary);
//         System.out.println(dictionary.get(5));
//         System.out.println(dictionary.get("Srinu"));
//     }
// }
