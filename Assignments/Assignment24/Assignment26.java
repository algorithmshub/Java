public class Assignment26 {
  public static void main(String[] args) {
    int result = largestPrimeFactor(10);
    System.out.println(result);

    result = largestPrimeFactor(6936);
    System.out.println(result);

    result = largestPrimeFactor(1);
    System.out.println(result);

    result = largestPrimeFactor(11);
    System.out.println(result);
  }

  static int largestPrimeFactor(int n) {
    if (n <= 1) 
      return 0;

    int largestPrimeFactor = 2;

    for (int i = 2; i < n; i++) {
      if (n % i == 0 && isPrime(i)) {
        largestPrimeFactor = i;
      }
    }

    return largestPrimeFactor;
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return n > 0;
  }
}
