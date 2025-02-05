public class BinarySearch {
  public static void main(String[] var0) {
    System.out.println(binarySearch(new int[]{10,20,30,40,50,60,70,80,90,100,110},80    ));
 }

 public static int binarySearch(int[] var0,int target) {
int low=0;
int high=var0.length-1;
  while(low<=high){
    int mid=low+(high-low)/2;
    // System.out.println(mid);
    if(var0[mid]==target){
      return mid+1;
  }else if(var0[mid]<target){
    low=mid+1;}
    else{
      high=mid-1;
    }
  }
    return -1;
 }
}