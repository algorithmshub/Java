public class Assignment63 {
  public static void main(String[] args) {
    int result = isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5);
    System.out.println(result);

    result = isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6);
    System.out.println(result);

    result = isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6);
    System.out.println(result);

    result = isPairedN(new int[]{1, 4, 1}, 5);
    System.out.println(result);

    result = isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15);
    System.out.println(result);

    result = isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15);
    System.out.println(result);

    result = isPairedN(new int[]{3}, 3);
    System.out.println(result);

    result = isPairedN(new int[]{}, 0);
    System.out.println(result);
  }

  static int isPairedN(int[] a, int n) {
    if (a.length <= 1) {
      return 0;
    }

    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] + a[j] == n && i + j == n) {
          return 1;
        }
      }
    }

    return 0;
  }
}
