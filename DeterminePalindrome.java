// HOW TO DETERMINE IF A STRING IS A PALINDROME

public class DeterminePalindrome {

  // Main Method
  public static void main(String[] args) {
    // Our test string
    String str = "Hello";
    // String to be reversed
    String reverse = "";

    // Get string length
    int length = str.length();

    // Traverse through characters of string
    for (int i = 0; i < length; i ++) {
      // Reverse the string by adding each new character to the start of the reverse string
      reverse = str.charAt(i) + reverse;
    }

    // Check if the string is a palindrome
    if (str.equals(reverse)) {
      System.out.println(str + " is a palindrome");
    }
    else {
      System.out.println(str + " is not a palindrome");
    }
  }
}
