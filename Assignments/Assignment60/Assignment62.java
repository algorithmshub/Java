public class Assignment62 {
  public static void main(String[] args) {
    int result = isBunkerArray(new int[]{4, 9, 6, 7, 3});
    System.out.println(result);

    result = isBunkerArray(new int[]{4, 9, 6, 15, 21});
    System.out.println(result);
  }

  static int isBunkerArray(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] % 2 != 0 && isPrime(a[i + 1]) == 1) {
        return 1;
      }
    }

    return 0;
  }

  static int isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return 0;
      }
    }

    return 1;
  }
}
