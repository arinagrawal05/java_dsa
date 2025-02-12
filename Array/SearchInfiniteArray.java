public class SearchInfiniteArray {
  public static void main(String[] var0) {
    System.out.println(iterativeBinarySearch(new int[]{10,20,30,40,50,60,70,80,90,100,110},110    ));
  }

 public static int iterativeBinarySearch(int[] var0,int target) {
int i=1;
// int high=var0.length-1;
  while(var0[i]<target){
    i=i*2;
if (var0[i]==target) {
  return i;
}

  }
    return recursiveSearch(var0, target, i/2+1, i);
    
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