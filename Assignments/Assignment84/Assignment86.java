public class Assignment86 {
  public static void main(String args[]) {
    int result = factorEqual(10, 33);
    System.out.println(result);

    result = factorEqual(9, 10);
    System.out.println(result);
  }

  static int factorEqual(int n, int m) {
    if (n < 0 || m < 0) return 0;

    int countN = 0;
    int countM = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        countN++;
      }
    }

    for (int j = 1; j <= m; j++) {
      if (m % j == 0) countM++;
    }

    if (countN == countM) return 1;
    return 0;
  }
}
