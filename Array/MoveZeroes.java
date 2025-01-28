import java.util.Arrays;

public class MoveZeroes {
  public static void main(String[] args)  { 

System.out.println(Arrays.toString(moveToEnd(new int[]{5,0,8,0,3,24})));    }

static public int[] moveToEnd(int[] n){
  int count=0;
  for (int i = 0; i < n.length; i++) {
    if (n[i]!=0) {
      swap(n, i, count);
      count++;
      
    }
  }
return n; 
}

private static void swap(int[] array, int i, int j) {
  int temp = array[i];
  array[i] = array[j];
  array[j] = temp;
}




}