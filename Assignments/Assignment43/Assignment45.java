public class Assignment45 {
  public static void main(String[] args) {
    int result = isDual(new int[]{1, 2, 3, 0});
    System.out.println(result);

    result = isDual(new int[]{1, 2, 2, 1, 3, 0});
    System.out.println(result);

    result = isDual(new int[]{1, 1, 2, 2});
    System.out.println(result);

    result = isDual(new int[]{1, 2, 1});
    System.out.println(result);
  }

  static int isDual(int[] a) {
    if (a.length % 2 != 0) {
      return 0;
    }

    int sum = a[0] + a[1];

    for (int i = 0; i < a.length - 1; i += 2) {
      if (sum != a[i] + a[i + 1]) {
        return 0;
      }
    }

    return 1;
  }
}
