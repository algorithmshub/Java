public class Assignment42 {
  public static void main(String[] args) {
    int result = isCubePowerful(153);
    System.out.println(result);

    result = isCubePowerful(370);
    System.out.println(result);

    result = isCubePowerful(371);
    System.out.println(result);

    result = isCubePowerful(407);
    System.out.println(result);

    result = isCubePowerful(87);
    System.out.println(result);

    result = isCubePowerful(0);
    System.out.println(result);

    result = isCubePowerful(-81);
    System.out.println(result);
  }

  static int isCubePowerful(int n) {
    if (n <= 0)
      return 0;

    int sum = 0;
    int copiedN = n;

    while (n > 0) {
      int lastDigit = n % 10;
      sum += lastDigit * lastDigit * lastDigit;
      n /= 10;
    }

    if (sum == copiedN) return 1;

    return 0;
  }
}
