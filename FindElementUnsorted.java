// HOW TO FIND A MISSING ELEMENT IN AN UNSORTED ARRAY

public class FindElementUnsorted {

  public static void main(String[] args) {

    // Variables
    int[] array = { 6, 7, 4, 9, 8 };
    int BOS = 4; // Beginning of Sequence
    int EOS = 9; // End of Sequence
    boolean found = false;

    // Traverse the size of the array list
    for (int i = BOS; i < EOS; i++) {
      // Traverse the inner loop until a matched element is found
      for (int j = 0; j < array.length; j++) {
        // Compare element in size list to element in actual list
        if (i == array[j]) {
          found = true;
          break;
        }
      }
      // If no matching element is found, display the following output:
      if (!found) {
        System.out.println("The missing element is: " + i);
      }
      // Reset the boolean value to prevent invalid output
      found = false;
    }
  }
}
