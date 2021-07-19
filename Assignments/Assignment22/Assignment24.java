public class Assignment24 {
  public static void main(String[] args) {
    int result = isFactorialPrime(2);
    System.out.println(result);

    result = isFactorialPrime(3);
    System.out.println(result);

    result = isFactorialPrime(7);
    System.out.println(result);

    result = isFactorialPrime(8);
    System.out.println(result);

    result = isFactorialPrime(11);
    System.out.println(result);

    result = isFactorialPrime(721);
    System.out.println(result);
  }

  static int isFactorialPrime(int n) {
    if (isPrime(n)) {
      int sum = 0;

      for (int i = 1; i < n && sum < n; i++) {
        sum = factorial(i) + 1;
      }

      if (sum == n)
        return 1;

      return 0;
    }

    return 0;
  }

  static int factorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * factorial(n -1);
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }

    return n < 0 ? false : true;
  }
}
