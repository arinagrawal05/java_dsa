public class FirstOccurence {
  public static void main(String[] var0) {
    System.out.println(iterativeBinarySearch(new int[]{10,20,30,40,50,80,80,80,90,100,110},80    ));
  }

 public static int iterativeBinarySearch(int[] var0,int target) {
  int first=Integer.MAX_VALUE;
  int low=0;
  int high=var0.length-1;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(var0[mid]==target){
        first=mid;
        // for last occurence
        low=mid+1;
// for first occurence
        // high=mid-1;

    }else if(var0[mid]<target){
      low=mid+1;}
      else{
        high=mid-1;
      }
    }
    return first;
 }

 
}

// nlog