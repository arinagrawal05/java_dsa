import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args)  { 
System.out.println(Arrays.toString(gfgReverse(new int[]{1,2,3,4,5})));

}
static public int[] myReverse(int[] n){
int[] newArray=new int[n.length];
  for (int i = 0; i < n.length; i++) {
    newArray[i]=n[n.length-i-1];
  }
  return newArray;
}

static public  int[] gfgReverse(int[] n ){
  int start=0;
  int end=n.length-1;
  for (int i = 0; i < n.length; i++) {
   int temp=n[start];
    n[start]=n[end];
    n[end]=temp;
  }
  return n;
}
}