public class Assignment30 {
  public static void main(String[] args) {
    int result = sumDigits(3114);
    System.out.println(result);

    result = sumDigits(-6543);
    System.out.println(result);
  }

  static int sumDigits(int n) {
    if (n < 0)
      n = -n;

    int sum = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      sum += lastDigit;
      n /= 10;
    }

    return sum;
  }
}
