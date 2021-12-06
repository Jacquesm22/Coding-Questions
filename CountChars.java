// HOW TO FIND THE NUMBER OF OCCURENCES OF A CHARACTER IN A STRING

public class CountChars {

  public static void main(String[] args) {
    // Our test string
    String str = "Hello";
    // Counter for chars
    int count = 0;
    // The character we're searching for
    char search = 'l';

    // Get string length
    int length = str.length();

    // Traverse the entire string
    for (int i = 0; i < length; i++) {
      // Count the number of characters
      if (str.charAt(i) == search) {
        count ++;
      }
    }

    // Display output
    System.out.println(count);
  }
}
