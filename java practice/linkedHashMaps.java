import java.util.*;
public class linkedHashMaps {
    //it follow insertion order
    public static void main(String args[]){
        LinkedHashMap<String,String> dictionary = new LinkedHashMap<>();
        dictionary.put("mahadev" ," python");
        dictionary.put("Sriyansh"," html");
        dictionary.put("Veera Lakshmi" ," css");
        dictionary.put("Srinu" ," js");
        dictionary.put("ramalakshmi" ," java");
        System.out.println(dictionary);
        System.out.println(dictionary.get(5));
        System.out.println(dictionary.get("Srinu"));
    }
}

