import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

public class HashmapExcercise {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Fruit1", "Mango");
        hashMap.put("Fruit2", "banana");
        hashMap.put("Fruit3", "watermaleon");
        System.out.println(hashMap);
        System.out.println("***Print only keys******");
        for (String i : hashMap.keySet()) {
            System.out.println(i);
        }
        //Retrieve a value associated with a given key from the HashMap.
        System.out.println(hashMap.get("Fruit2"));

        /*
      To check whether a particular key exists in HashMap use
      boolean containsKey(Object key) method of HashMap class.
      It returns true if the HashMap contains mapping for specified key
      otherwise false.
    */
        boolean blnExists = hashMap.containsKey("3");
        boolean fruitsExists = hashMap.containsKey("Fruit3");
        System.out.println("3 exists in HashMap ? : " + blnExists);
        System.out.println("Fruit3 exists in HashMap ? : " + fruitsExists);

        //Remove all the key-value from the hashmap
       /* hashMap.clear();
        System.out.println("Empty hashmap"+hashMap);*/
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
        //Replacing a value associates with a given key
        hashMap.put("Fruit2", "Apple");
        System.out.println(hashMap);

        //replace value of hashmap if its mapped
        if(hashMap.containsKey("Fruit2")) {
            System.out.println(hashMap.replace("Fruit2", "Orange"));
            System.out.println(hashMap);
        }
        else {
            System.out.println("old hashmap"+hashMap);
        }

    }
}
