// Question:

// y(n) = n + (n-1) + (n-2) + … + 1

// y(4) = 4 + 3 + 2 + 1 = 10

// y(3) = 3 + 2 + 1 = 6

// Simplified:

// y(4) = 4 + y(3)

// y(n) = n + y(n-1)

public class Decrement {

  // Method 1: Complex
  public static int decrement(int n) {

	int sum = 0;

	for (int i = n; i > 0; i--) {
		sum += i;
	}
	return sum;
  }

  // Method 2: Simplified
  public static int decrement2(int n) {

    if (n == 1) {
      return 1;
    }
    return n + decrement2(n-1);
  }

  // Main Method
  public static void main(String[] args) {
    System.out.println(decrement(5));
    System.out.println(decrement2(5));
  }
}