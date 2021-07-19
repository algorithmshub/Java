public class Assignment35 {
  public static void main(String[] args) {
    int result = isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9});
    System.out.println(result);

    result = isCentered15(new int[]{2, 10, 4, 1, 6, 9});
    System.out.println(result);

    result = isCentered15(new int[]{3, 2, 10, 4, 1, 6});
    System.out.println(result);

    result = isCentered15(new int[]{1, 1, 8, 3, 1, 1});
    System.out.println(result);

    result = isCentered15(new int[]{9, 15, 6});
    System.out.println(result);

    result = isCentered15(new int[]{1, 1, 2, 2, 1, 1});
    System.out.println(result);

    result = isCentered15(new int[]{1, 1, 15 -1,-1});
    System.out.println(result);
  }

  static int isCentered15(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int sum = 0;
      for (int j = i; j < a.length; j++) {
        sum += a[j];

        if (sum == 15) {
          if (i == a.length - j - 1) {
            return 1;
          }
        }
      }
    }

    return 0;
  }
}
