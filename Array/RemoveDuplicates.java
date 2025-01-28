import java.util.Arrays;

public class RemoveDuplicates {
  public static void main(String[] args)  { 
    System.out.println(removeDuplicates(new int[]{3,5,5,7,17,19,19,20,22}));    
 }
 
 static public int removeDuplicates(int[] n){
 
    int idx=0;
  for (int i = 1; i < n.length; i++) {
    if (n[i]!=n[idx]) {
      // n[idx]=n[i];
      idx++;
    }
  }
  return idx;
}
}