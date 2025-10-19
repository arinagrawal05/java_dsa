import java.util.*;
public class Frequencies {
  public static void main(String[] var0) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,9,2, 10};
    HashMap<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < arr.length; i++) {
//   if (map.containsKey(arr[i])) {
//     map.put(arr[i],map.get(arr[i])+1);    
//   }else{
//     map.put(arr[i],1);
// }
map.put(arr[i],
map.getOrDefault(arr[i],0)+1);
  }
   
  System.out.println(map);

  
 
}
}