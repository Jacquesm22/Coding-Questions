// HOW TO DETERMINE IF TWO STRINGS ARE ANAGRAMS

import java.util.Arrays;

public class DetermineAnagram {

  // Main Method
  public static void main(String[] args) {
    String str = "Hello";
    String reverse = "loleH";
    boolean anagramState = false;

    // Exception: Strings are not the same length
    if (str.length() != reverse.length()) {
      System.out.println(str + " and " + reverse + " are not anagrams");
    }
    // Authoritative Condition: Strings are the same lengths
    else {
      // Convert strings into character arrays
      char[] anagram1 = str.toCharArray();
      char[] anagram2 = reverse.toCharArray();
      // Sort character arrays
      Arrays.sort(anagram1);
      Arrays.sort(anagram2);
      // Test if anagram1 and anagram2 character arrays are the same
      anagramState = Arrays.equals(anagram1, anagram2);

      // Authoritative Condition: Strings are anagrams
      if (anagramState == true) {
        System.out.println(str + " and " + reverse + " are anagrams");
      }
      // Exception: Strings are not anagrams
      else {
        System.out.println(str + " and " + reverse + " are not anagrams");
      }
    }
  }
}
