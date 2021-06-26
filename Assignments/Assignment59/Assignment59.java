public class Assignment59 {
  public static void main(String[] args) {
    int result = isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6});
    System.out.println(result);

    result = isBeanArray(new int[]{13, 4, 4, 4, 4});
    System.out.println(result);

    result = isBeanArray(new int[]{10, 5, 5});
    System.out.println(result);

    result = isBeanArray(new int[]{0, 6, 8, 20});
    System.out.println(result);

    result = isBeanArray(new int[]{3});
    System.out.println(result);

    result = isBeanArray(new int[]{8, 5, -5, 5, 3});
    System.out.println(result);
  }

  static int isBeanArray(int[] a) {
    int a1 = a[0];
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i])) {
        sum += a[i];
      }
    }

    if (sum == a1) {
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
