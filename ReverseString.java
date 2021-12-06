// HOW TO REVERSE A STRING

public class ReverseString {

  public static void main(String[] args) {
    String str = "Hello";
    String reverse = "";

    // Get string length
    int length = str.length();

    // Traverse through the characters of the string
    for (int i = 0; i < length; i ++) {
      reverse = str.charAt(i) + reverse;
    }

    // Display the reversed string
    System.out.println(reverse);
  }
}
