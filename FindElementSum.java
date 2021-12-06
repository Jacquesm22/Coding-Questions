// HOW TO FIND A MISSING ELEMENT BY USING THE SUM OF ALL THE ELEMENTS IN AN ARRAY

public class FindElementSum {

  public static void main(String[] args) {

    // Variables
    int[] array = { 6, 7, 4, 9, 8 };
    int BOS = 4; // Beginning of Sequence
    int EOS = 9; // End of Sequence
    int sum1 = 0; // Sum of array values
    int sum2 = 0; // Sum of intended list values

    // Calculate sum of array list
    for (int i = 0; i < array.length; i++) {
      sum1 += array[i];
    }

    // Calculate sum of intended list
    for (int j = BOS; j <= EOS; j++) {
      sum2 += j;
    }

    System.out.println("Sum of array values: " + sum1);
    System.out.println("Sum of intended list values: " + sum2);

    if (sum1 == sum2) {
      System.out.println("There is no missing element.");
    }
    else {
      System.out.println("The missing element is: " + (sum2 - sum1));
    }

  }
}