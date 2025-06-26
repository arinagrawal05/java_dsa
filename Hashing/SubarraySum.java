import java.util.HashSet;
// import java.util.Hashtable;

public class SubarraySum {
    public static void main(String[] var0) {
System.out.println(func(new Integer[]{5,8,6,13,3}, 21));
  }

   
static boolean func(Integer[] list,Integer sum){
HashSet<Integer> myset=new HashSet<>();
int prefixsum=0;
for (int i = 0; i < list.length; i++) {
    prefixsum=prefixsum+list[i];

  if (myset.contains(prefixsum-sum)) {
    return true;
    
  }
  myset.add(prefixsum);
}
  return false;
} 

 
}