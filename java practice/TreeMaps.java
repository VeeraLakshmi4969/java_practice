// import java.util.*;
// public class TreeMaps {
    //it follow sorted order
//     public static void main(String args[]){
//         TreeMap<Integer,String> dictionary = new TreeMap<>();
//         dictionary.put(6 ," python");
//         dictionary.put(1 ," python");
//         dictionary.put(2 ," html");
//         dictionary.put(3 ," css");
//         dictionary.put(4 ," js");
//         dictionary.put(5 ," java");
//         System.out.println(dictionary);
//         System.out.println(dictionary.get(5));
//     }
// }

import java.util.*;
public class TreeMaps {
    public static void main(String args[]){
        TreeMap<String,String> dictionary = new TreeMap<>();
        dictionary.put("mahadev" ," python");
        dictionary.put("Sriyansh"," html");
        dictionary.put("Veera Lakshmi" ," css");
        dictionary.put("Srinu" ," js");
        dictionary.put("ramalakshmi" ," java");
        System.out.println(dictionary);
        System.out.println(dictionary.get("Srinu"));
    }
}

