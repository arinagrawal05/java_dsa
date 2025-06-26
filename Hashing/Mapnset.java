import java.util.*;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Iterator;
import java.util.Map.Entry;

public class Mapnset{
    
    static public void main(String[] var0) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        set.add("there");
        set.add("hello");
        set.add("world");
        set.remove("there");
System.out.println(set.contains("hello"));
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        map.put("Ram", 2);
        map.put("Shyam", 26);
        
        map.put("Hari", 13);
        map.remove("Shyam");
        System.out.println(map.get("Hari"));
        System.out.println(map.containsKey("Hari"));
 for ( Entry<String,Integer> entry:map.entrySet()) {
    
         System.out.println(entry.getKey()+" is "+entry.getValue());
    }
}
}