public class Assignment77 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{7, 6, 0, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{7, 6, 10});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 0});
    System.out.println(result);

    result = isMeera(new int[]{3, 7, 0, 8, 0, 5});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    boolean zero = false;
    boolean prime = false;

    for (int i = 0 ; i < a.length; i++) {
      if (isPrime(a[i]) == 1) {
        prime = true;
      }

      if (a[i] == 0) {
        zero = true;
      }
    }

    if ((zero && prime) || (!zero && !prime)) {
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
