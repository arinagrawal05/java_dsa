import java.util.Arrays;

public class RemoveDuplicateInSorted {
    public static void main(String[] args) {
        int[] input = {3, 5, 6, 8, 13, 13};  // ✅ Sorted input
        int[] result = func(input);
        System.out.println(Arrays.toString(result));
    }

    static int[] func(int[] list) {
        if (list.length == 0) return new int[0];

        int j = 0;  // index of the last unique element
        for (int i = 1; i < list.length; i++) {
            if (list[i] != list[j]) {
                j++;
                list[j] = list[i];
            }
        }

        // Create new array with unique elements
        return Arrays.copyOfRange(list, 0, j + 1);
    }
}
