import java.util.HashSet;
import java.util.Hashtable;

public class Base {
    public static void main(String[] var0) {
System.out.println(func(new Integer[]{-3,4,-3,-1,1}, 0));
  }

   
static boolean func(Integer[] list,Integer sum){
HashSet<Integer> mytable=new HashSet<Integer>();
int prefix_sum = 0;
for (int i = 0; i < list.length; i++) {
  prefix_sum+=list[i];
  if (mytable.contains(prefix_sum-sum)) {
    return true;
  }
  mytable.add(prefix_sum);
if (prefix_sum==sum) {
  return true;
}
  
}
 return false;
} 

 
}