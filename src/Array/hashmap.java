package src.Array;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args){

        //   A HashMap is a data structure that stores key-value pairs it allows you to store and retrieve elements
        //   based on keys rather than their index. In java, HashMap is part of the java.util package and implements the Map interface.

            //  Initialization and Basics
        //   Map<KeyType, ValueType> map =  new HashMap<>();
        //  Here, KeyType represent the type of keys, and ValueType represents the type of values stored in the HashMap

            Map<String, Integer> map = new HashMap<>();

        //      * Adding Element
        //          => map.put(key, value);

            map.put("apple", 10);
            map.put("banana", 20);
            map.put("apple", 15); //replaced previous value 10 with 15

            map.put("mango",40);
            map.put("orange", 30);

        // This method add a key-value pair tot the HashMap. If the key already exits, the previous value associated
        // with the key is replaced.

        //       * Retrieving Elements
        //          => map.get(key);
            System.out.println(map.get("apple"));

        //        * Size
        //          => map.size();

            int size = map.size();
            System.out.println(size);

        // Returns the number of key-value mappings in the HashMap.


        //        * Checking Existence
        //          => map.containsKey(key);

            boolean exists = map.containsKey("banana");
            System.out.println(exists);
        //  Checks if the HashMap contains a specific key.

        //         * Removing Elements
        //           => map.remove(key);

            map.remove("apple");
            System.out.println(map);

       //       * Iterating Over HashMasp
       //   map.entrySet()
       //   This returns a set of entries from the map.

       //   Each entry in the set is a key-value pair represented by Map.Entry<K, V>.

       //   for (Map.Entry<KeyType, ValueType> entry : map.entrySet())
       //This is an enhanced for-loop (also known as a for-each loop).

       //Map.Entry<KeyType, ValueType> is the type of each element you're looping over. It represents one key-value pair.

       //entry is the variable name used to refer to each entry while looping.

       //map is your HashMap (or any class that implements Map interface).

       //   entry.getKey() and entry.getValue()
       //entry.getKey() returns the key of the current key-value pair.

       //entry.getValue() returns the value of the current key-value pair.
       //  Why use entrySet()?
            // It is more efficient than looping over keySet() and calling map.get(key) each time, especially for large maps.
            //
            //entrySet() directly gives you both key and value in one go.

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                    String name = entry.getKey();
                    Integer price = entry.getValue();
                    System.out.println(name + " - "+ price);
            }

            for( String key: map.keySet()){
                System.out.println(key + " - " + map.get(key)+"ppp");
            }

//            Method	                                 When to Use	                                    Example
//            for (Map.Entry<K, V> 	                When you need both keys                             ✅ Best performance
//               entry : map.entrySet())             and values efficiently
//            for (K key : map.keySet())	        When you only need keys	                        map.get(key) gives value
//            for (V value : map.values())	        When you only care about values	                Skips keys entirely
//            Iterator<Map.Entry<K, V>>	            When you want to modify while                       Advanced use
//            it = map.entrySet().iterator()         iterating (e.g., remove)

//            This works — but is slightly slower than entrySet() because:
//            You first get the key,
//            Then do an additional lookup using map.get(key) to get the value.
//            ❌ You can't use	for (int i = 0; i < map.size(); i++)
//            ✅ You should use	entrySet() for both key-value pairs
//            ⚠️ Less efficient	keySet() + map.get(key)
    }
}
