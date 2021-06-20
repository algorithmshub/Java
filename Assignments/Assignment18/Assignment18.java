public class Assignment18 {
  public static void main(String[] args) {
    int result = isTwinPrime(5);
    System.out.println(result);

    result = isTwinPrime(7);
    System.out.println(result);

    result = isTwinPrime(53);
    System.out.println(result);

    result = isTwinPrime(9);
    System.out.println(result);
    
  }

  static int isTwinPrime(int n) {
    if (isPrime(n)) {
      if (isPrime(n - 2) || isPrime(n + 2)) {
        return 1;
      }
    }

    return 0;
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }

    return n < 0 ? false : true;
  }
}
