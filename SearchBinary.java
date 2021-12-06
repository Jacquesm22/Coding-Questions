// HOW TO IMPLEMENT A BINARY SEARCH

public class SearchBinary {

  public static void binarySearch(int arr[], int low, int high, int key) {
    // Formula
    int mid = (low + high) / 2;

    while (low <= high) {
      // Condition 1
      if (arr[mid] < key) {
        low = mid + 1;
      }
      // Condition 2
      else if (arr[mid] == key) {
        System.out.println("Element is found at index: " + mid);
      }
      // Condition 3
      else {
        high = mid - 1;
      }
      mid = (low + high) / 2;
    }
    if (low > high) {
      System.out.println("Element is not found");
    }
  }

  // Main Method
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50};
    int key = 30;
    int last = arr.length - 1;
    binarySearch(arr, 0, last, key);
  }
}
