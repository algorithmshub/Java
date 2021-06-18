public class Assignment5 {
  public static void main(String[] args) {
    int result = f(1234);
    System.out.println(result);

    result = f(12005);
    System.out.println(result);

    result = f(1);
    System.out.println(result);

    result = f(0);
    System.out.println(result);

    result = f(-12345);
    System.out.println(result);
  }

  static int f(int n) {
    if (n == 0) {
      return 0;
    }
    int reverse = 0;
    while (n != 0) {
      reverse = (reverse * 10) + ( n % 10);
      n /= 10;
    }
    return reverse;
  }
}
