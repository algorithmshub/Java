public class Assignment17 {
  public static void main(String[] args) {
    int result = isDigitSum(32121, 10);
    System.out.println(result);

    result = isDigitSum(32121, 9);
    System.out.println(result);

    result = isDigitSum(13, 6);
    System.out.println(result);

    result = isDigitSum(3, 3);
    System.out.println(result);

    result = isDigitSum(-543, 3);
    System.out.println(result);
  }

  static int isDigitSum(int n, int m) {
    if (n < 0 || m < 0) {
      return -1;
    }

    int sum = 0;

    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      n /= 10;
    }

    if (sum < m) return 1;

    return 0;
  }
}
