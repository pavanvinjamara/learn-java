package src.collections.map;

import java.util.*;
import java.util.List;
import java.util.Vector;

public class LearnMap {
    public static void main(String[] args) {
        List<String> l1 = new Vector<>();
//      Creation of a map
//        <Integer, String> m1 = new Hashtable<>();
//        similarly we can use for LinkedHashMap , TreeMap  etc
        Map<Integer, String> m1 = new HashMap<>();
//        Adding element
        m1.put(500050, "Hyderabad");
        m1.put(600060, "Chennai");
        m1.put(400040, "Pune");

//        Retrieve of keys from the map
        System.out.println(m1.keySet());
        Set<Integer> keys = m1.keySet();

        for( Integer key: keys){
            System.out.println(key);
        }

//        Retrieve of values from the map
        System.out.println(m1.values());
        Collection<String> values = m1.values();
        for (String value: values){
            System.out.println(value);
        }

//        Using key get value
        System.out.println(m1.get(400040));

        m1.remove(600060);
        System.out.println(m1);

//        Verify key
        System.out.println(m1.containsKey(600060));
        System.out.println(m1.containsKey(400040));

//        verify values
        System.out.println(m1.containsValue("Hyderabad"));
        System.out.println(m1.containsValue("chennai"));

//      Updating value
        m1.put(500050, "Mumbai");
        m1.putIfAbsent(600060, "Hyderabad"); // It will insert only not present keys
//        we can use replace method
//        m1.replace()

//      To get how many elements present in map
        System.out.println(m1.size());

        Set<Map.Entry<Integer, String>> entries = m1.entrySet();
        System.out.println(entries);
        for(Map.Entry<Integer, String> entry: entries){
            Integer key = entry.getKey();
            String  value =  entry.getValue();
            System.out.println(key+" -- "+ value);
        }

//      To empty the map
        m1.clear();



    }
}
