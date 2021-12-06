// HOW TO CALCULATE THE NUMBER OF VOWELS AND CONSONANTS IN A STRING

public class CountVowels {

  // Main Method
  public static void main(String[] args) {
    // Our test string
    String str = "Hello";
    // Number of vowels
    int vowels = 0;
    // Number of consonants
    int consonants  = 0;

    // Traverse the entire string
    for (int i = 0; i < str.length(); i++) {
      // Our test character
      char c = str.charAt(i);
      // Authoritative Condition
      if (c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vowels ++;
      }
      // Exception
      else {
        consonants ++;
      }
    }
    // Display output
    System.out.println("Vowel count is: " + vowels);
    System.out.println("Consonant count is: " + consonants);
  }
}
