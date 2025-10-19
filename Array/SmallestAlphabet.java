public class SmallestAlphabet {
    public static void main(String[] args) {
        char[] arr = {'a','b','h','v','z'};
        char target = 'x';
        System.out.println(getCeiling(arr, target));
    }

    public static char getCeiling(char[] arr, char target) {
        int low = 0, high = arr.length - 1;

         if (target > arr[high]) { //< for floor
            return arr[0];
        }

        char result = target;  
        while (low <= high) {
            int mid = low + (high - low) / 2;
          if (arr[mid] < target) {
                low = mid + 1;    
            } else {
                high = mid - 1;    
                                result = arr[mid]; 
 
            }
        }

        return result;
    }
}
