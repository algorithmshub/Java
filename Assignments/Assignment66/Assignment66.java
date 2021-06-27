public class Assignment66 {
  public static void main(String[] args) {
    int result = isPrimeHappy(5);
    System.out.println(result);

    result = isPrimeHappy(25);
    System.out.println(result);

    result = isPrimeHappy(32);
    System.out.println(result);

    result = isPrimeHappy(8);
    System.out.println(result);

    result = isPrimeHappy(2);
    System.out.println(result);
  }

  static int isPrimeHappy(int n) {
    int number = 2;
    int sum = 0;
    boolean isPrimeHappy = false;

    while (number < n) {
      if (isPrime(number)) {
        isPrimeHappy = true;
        sum += number;
      }

      number++;
    }

    if (isPrimeHappy && sum % n == 0) {
      return 1;
    }

    return 0;
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
