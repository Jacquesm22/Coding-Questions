// HOW TO CALCULATE THE FIBONACCI NUMBER OF AN INTEGER

public class CalculateFibonacci {

  // Method: Determine Fibonacci Number
  public static int fibonacci(int n) {
    // Exception
    if (n <= 1) {
      return n;
    }
    // Authoritative Condition
    else {
      // Mathematical Fibonacci Algorithm
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  // Main Method
  public static void main(String[] args) {
    int n = 3;
    System.out.println(fibonacci(n));
  }
}
