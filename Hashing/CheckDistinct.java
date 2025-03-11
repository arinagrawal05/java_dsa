import java.lang.reflect.Array;
import java.util.*; 
import java.util.Map.Entry;

public class CheckDistinct{
    
    static public void main(String[] var0) {
        Integer[] arr = {1,2, 3, 4,8, 5, 6,6,6, 7,7, 8, 9, 10};

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
// you can iterate also but this is better approach!
        
System.out.println(hashSet.size());

}
}