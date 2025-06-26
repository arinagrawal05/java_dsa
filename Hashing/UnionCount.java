import java.util.*;
// import java.util.HashSet;

public class UnionCount {
  public static void main(String[] var0) {
   Integer[] a = {15,20,5,25};
   
   Integer[] b = {15,20,10};
   System.out.println(func(a,b));
   }

   static int func(Integer[] a,Integer[] b){
HashSet myset=new HashSet<>(Arrays.asList(a));
myset.addAll(Arrays.asList(b));
// System.out.println(myset);
return myset.size();
   }
 
}