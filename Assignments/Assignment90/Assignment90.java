public class Assignment90 {
  public static void main(String args[]) {
    int result = isSuff(new int[]{2, 10, 9, 3});
    System.out.println(result);

    result = isSuff(new int[]{2, 2, 3, 3, 3});
    System.out.println(result);

    result = isSuff(new int[]{1, 1, 1, 2, 1, 1});
    System.out.println(result);

    result = isSuff(new int[]{0, 1, 1});
    System.out.println(result);

    result = isSuff(new int[]{3, 4, 5, 7});
    System.out.println(result);
  }

  static int isSuff(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isSuff = false;

      for (int j = 0; j < a.length; j++) {
        if ((a[i] == (a[j] - 1)) || (a[i] == (a[j] + 1))) {
          isSuff = true;
          break;
        }
      }

      if (!isSuff) return 0;
    }

    return 1;
  }
}
