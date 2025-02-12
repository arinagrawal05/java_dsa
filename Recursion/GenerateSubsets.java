// need to understand

public class GenerateSubsets {
  public static void main(String[] args) {
      printAllSubsets("ABC", 0, "");
  }

  // Function to print all subsets of a string
  static public void printAllSubsets(String str, int current, String subset) {
      // Base case: if current index reaches the end of the string
      if (current == str.length()) {
          System.out.println(subset); // Print the current subset
          return;
      }

      // Recursive case: Two choices for each character
      // 1. Include the current character
      printAllSubsets(str, current + 1, subset + str.charAt(current));

      // 2. Exclude the current character
      printAllSubsets(str, current + 1, subset);
  }
}
