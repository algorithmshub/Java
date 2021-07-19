public class Assignment36 {
  public static void main(String[] args) {
    int result = countDigit(33331, 3);
    System.out.println(result);

    result = countDigit(33331, 6);
    System.out.println(result);

    result = countDigit(3, 3);
    System.out.println(result);
  }

  static int countDigit(int n, int digit) {
    if (n < 0 || digit < 0)
      return 0;

    int countDigit = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      
      if (lastDigit == digit) {
        countDigit++;
      }

      n /= 10;
    }

    return countDigit;
  }
}
