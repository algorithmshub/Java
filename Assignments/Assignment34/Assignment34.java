public class Assignment34 {
  public static void main(String[] args) {
    int result = isCentered(new int[]{1, 2, 3, 4, 5});
    System.out.println(result);

    result = isCentered(new int[]{5, 3, 3, 4, 5});
    System.out.println(result);

    result = isCentered(new int[]{3, 2, 1, 4, 5});
    System.out.println(result);

    result = isCentered(new int[]{3, 2, 1, 4, 1});
    System.out.println(result);

    result = isCentered(new int[]{3, 2, 1, 1, 4, 6});
    System.out.println(result);

    result = isCentered(new int[]{});
    System.out.println(result);

    result = isCentered(new int[]{1});
    System.out.println(result);
  }

  static int isCentered(int[] a) {
    if (a.length == 0 && a.length % 2 == 0) {
      return 0;
    }

    int centerIndex = (a.length - 1) / 2;
    int centerValue = a[centerIndex];

    for (int i = 0; i < a.length; i++) {
      if (i != centerIndex && a[i] <= centerValue) {
        return 0;
      }
    }

    return 1;
  }
}
