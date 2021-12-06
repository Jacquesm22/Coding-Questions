// HOW TO CODE AN INSERTION SORT ALGORITHM

public class SortInsertion {

  public static void main(String[] args) {
    int[] a = { 1, 2, 7, 6, 4, 9, 12 };

    for (int i = 1; i < a.length; i++) {
      int j = i;
      while (j > 0 && a[j - 1] > a[j]) {
        int k = a[j];
        a[j] = a[j - 1];
        a[j - 1] = k;
        j--;
      }
    }

    // Display insertion sorted array
    System.out.println("Array after insertion sort: ");
    for(int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
