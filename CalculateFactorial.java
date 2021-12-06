import java.util.Scanner;

// HOW TO CALCULATE THE FACTORIAL OF AN INTEGER

public class CalculateFactorial {

  // Method: Determine Factorial
  public static long factorial(long num) {
    // Exception
    if (num == 1) {
      return 1;
    }
    // Authoritative Condition
    else {
      // Mathematical Formula For Determining Factorials
      return (num* factorial(num - 1));
    }
  }

  // Main Method
  public static void main(String[] args) {
    // Allow user input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive value: ");
    // Scan user input
    int num = sc.nextInt();
    // Close scanner
    sc.close();
    // Display Output
    System.out.println("Factorial of " + num + " is: " + factorial(num));
  }
}
