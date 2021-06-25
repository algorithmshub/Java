public class Assignment51 {
  public static void main(String[] args) {
    int result = isMagicArray(new int[]{21, 3, 7, 9, 11 4, 6});
    System.out.println(result);

    result = isMagicArray(new int[]{13, 4, 4, 4, 4});
    System.out.println(result);

    result = isMagicArray(new int[]{10, 5, 5});
    System.out.println(result);

    result = isMagicArray(new int[]{0, 6, 8, 20});
    System.out.println(result);

    result = isMagicArray(new int[]{3});
    System.out.println(result);

    result = isMagicArray(new int[]{8, 5, -­5, 5, 3});
    System.out.println(result);
  }

  static int isMagicArray(int[] a) {
    if (a.length == 0)
      return 0;

    int sumPrime = 0;

    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i] == 1))
        sumPrime += a[i];
    }

    if (a[0] == sumPrime)
      return 1;

    return 0;
  }

  static int isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return 0;
    }

    return n > 0 ? 1 : 0;
  }
}
