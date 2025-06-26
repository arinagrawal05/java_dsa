import java.util.Hashtable;

public class PossibleSum {
  public static void main(String[] var0) {
System.out.println(func(new Integer[]{2,1,6,3}, 6));
  }

   
static boolean func(Integer[] list,Integer sum){
Hashtable<Integer,Integer> mytable=new Hashtable<Integer,Integer>();
for (int i = 0; i < list.length; i++) {
  if (mytable.containsKey(sum-list[i])) {
    return true;
  }
  mytable.put(list[i],i);
}
 return false;
}
}