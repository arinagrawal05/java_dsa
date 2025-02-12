public class FindTriplet {

  public static void main(String[] var0) {
    System.out.println(findTriplet(new int[]{2,3, 4, 8, 9, 20, 40}, 32));
 }

 public static boolean findTriplet(int[] arr, int target) {
    // int left = 0;
    // int right = var0.length - 1;

  for (int i = 0; i < arr.length; i++) {
    int left = i;
    int right = arr.length - 1;
    while(left < right) {
      if (arr[left] + arr[right]+arr[i] == target) {
         return true;
      }

      if (arr[left] + arr[right] < target) {
         ++left;
      } else {
         --right;
      }
   }
  }

    return false;
 }

 
}