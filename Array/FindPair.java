public class FindPair {
  public static void main(String[] var) {
    System.out.println(findPair(new int[]{2,4,8,9,11,12,20,30},23 ));
  }

 public static boolean findPair(int[] arr,int target) {

// two pointer approach
int i=0;
int j=arr.length-1;
while(i<j){
  if(arr[i]+arr[j]==target){
    return true;
  }else if(arr[i]+arr[j]<target){
    i++;
  }else{
    j--;
  }
}
 return false;
}
}