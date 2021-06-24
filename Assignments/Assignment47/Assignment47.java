public class Assignment47 {
  public static void main(String[] args) {
    int result = isConsectiveFactored(24);
    System.out.println(result);

    result = isConsectiveFactored(105);
    System.out.println(result);

    result = isConsectiveFactored(90);
    System.out.println(result);

    result = isConsectiveFactored(23);
    System.out.println(result);

    result = isConsectiveFactored(15);
    System.out.println(result);

    result = isConsectiveFactored(2);
    System.out.println(result);

    result = isConsectiveFactored(0);
    System.out.println(result);

    result = isConsectiveFactored(-12);
    System.out.println(result);
  }

  static int isConsectiveFactored(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0 && n % (i + 1) == 0) {
        return 1;
      }
    }

    return 0;
  }
}
