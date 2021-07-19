public class Assignment72 {
  public static void main(String[] args) {
    int result = isNice(new int[]{21, 3, 7, 9, 11, 4, 6});
    System.out.println(result);

    result = isNice(new int[]{13, 4, 4, 4, 4});
    System.out.println(result);

    result = isNice(new int[]{10, 5, 5});
    System.out.println(result);

    result = isNice(new int[]{0, 6, 8, 20});
    System.out.println(result);

    result = isNice(new int[]{3});
    System.out.println(result);

    result = isNice(new int[]{8, 5, -5, 5, 3});
    System.out.println(result);
  }

  static int isNice(int[] a) {
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i]) == 1) {
        sum += a[i];
      }
    }

    if (sum == a[0]) {
      return 1;
    }

    return 0;
  }

  static int isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return 0;
      }
    }

    return n > 1 ? 1 : 0;
  }
}
