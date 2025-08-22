public class Ceilings {
    public static void main(String[] args) {
        int[] arr = {3, 5, 32, 39, 65, 123, 323};
        int target = 35;
        System.out.println(getCeiling(arr, target));
    }

    public static int getCeiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

         if (target > arr[high]) { //< for floor
            return target;
        }

        int result = target;  
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid]; 
            } else if (arr[mid] < target) {
                low = mid + 1;    
                                // result = arr[mid]; //for floor

            } else {
                                              result = arr[mid]; 

                high = mid - 1;     
            }
        }

        return result;
    }
}
