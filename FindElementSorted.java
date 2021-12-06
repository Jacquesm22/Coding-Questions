// HOW TO FIND A MISSING ELEMENT IN A SORTED ARRAY

public class FindElementSorted {

  public static void main(String[] args) {

    // Variables
    int[] array = { 4, 6, 7, 8, 9 };
    int BOS = 4; // Beginning of Sequence

    // Traverse the entire list
    for  (int i = 0; i < array.length; i++) {
      // Compare element in array to BOS number
      if (array[i] == BOS) {
        BOS ++;
      }
      // Display output if the elements in the previous condition don't match up
      else {
        System.out.println("The missing element is: " + BOS);
        break; // Stop loop when missing element is found
      }
    }
  }
}