import java.util.HashMap;

public class BasicHashmap {
  public static void main(String[] var0) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(1, 2);
    map.put(2, 26);
    map.put(3, 25);
    map.put(2, 5);
    map.remove(3 );
    System.out.println(
      map.containsKey(2));
    map.put(1, 29);
  printmap(map);
    }

 static void  printmap(HashMap map){
for (int i = 0; i < map.size(); i++) {
  // System.out.println(map.size());
  System.out.println(map.get(i+1));
}
   }

 
}