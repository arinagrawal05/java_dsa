import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
  public static void main(String[] var0) {
    Integer arr1[] = { 1, 2, 3, 4, 8, 5,};
    Integer arr2[] = {   9,4,3,2, 10 };
HashSet myset=new HashSet<>(Arrays.asList(arr1));

for (int i = 0; i < arr2.length; i++) {
  if (myset.contains(arr2[i])) {
    System.out.println(arr2[i]);
  }
}
   

 
}
}