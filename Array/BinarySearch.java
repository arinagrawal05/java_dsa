public class BinarySearch {
  public static void main(String[] var0) {
    System.out.println(iterativeBinarySearch(new int[]{10,20,30,40,50,60,70,80,90,100,110},80    ));
    System.out.println(recursiveSearch(new int[]{10,20,30,40,50,60,70,80,90,100,110},80 ,0,10   ));
 }

 public static int iterativeBinarySearch(int[] var0,int target) {
int low=0;
int high=var0.length-1;
  while(low<=high){
    int mid=low+(high-low)/2;
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
 public static int recursiveSearch(int[] var0,int target,int low,int high) {
 
  System.out.println("something");

  if(low>high){
    return -1;
  }
  int mid=low + (high - low) / 2;
  if(var0[mid]==target){
    return mid+1;
    
   }else if (var0[mid]<target){
   
    return recursiveSearch(var0, target,mid+1,high);
    
   } else {
    return recursiveSearch(var0, target,low,mid-1);

   }
  //  return 0;
}

}