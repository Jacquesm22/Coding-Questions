// HOW TO CODE A BUBBLE SORT ALGORITHM

public class SortBubble {

  public static void main(String[] args) {
    int[] a = { 1, 2, 7, 6, 4, 9, 12 };

    // Nested loops used for sorting
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length -1 -1; j++)
      {
        if (a[j] > a[j + 1]) {
          int k = a[j];
          a[j] = a[j + 1];
          a[j + 1] = k;
        }
      }
    }

    // Display bubble sorted array
    System.out.println("Array after bubble sort: ");
    for(int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
