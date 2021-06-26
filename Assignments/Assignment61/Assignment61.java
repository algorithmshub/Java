public class Assignment61 {
  public static void main(String[] args) {
    int result = isBunker(new int[]{7, 6, 10, 1});
    System.out.println(result);

    result = isBunker(new int[]{7, 6, 10});
    System.out.println(result);

    result = isBunker(new int[]{6, 10, 1});
    System.out.println(result);

    result = isBunker(new int[]{3, 7, 1, 8, 1});
    System.out.println(result);
  }

  static int isBunker(int[] a) {
    boolean one = false;
    boolean prime = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        one = true;
      }

      if (isPrime(a[i]) == 1) {
        prime = true;
      }
    }

    if (one && prime) {
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
