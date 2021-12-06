// HOW TO FIND MATCHING ELEMENTS IN AN INTEGER ARRAY

public class MatchingElements {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 1, 2, 6, 7 };

    for (int m = 0; m < a.length; m++) {
      for (int n = m + 1; n < a.length; n++) {
        if (a[m] == a[n]) {
          System.out.print(a[m] + " ");
        }
      }
    }
  }
}
