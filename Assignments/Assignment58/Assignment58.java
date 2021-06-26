public class Assignment58 {
  public static void main(String[] args) {
    int result = isBean(new int[]{4, 9, 8});
    System.out.println(result);

    result = isBean(new int[]{2, 2, 5, 11, 23});
    System.out.println(result);

    result = isBean(new int[]{7, 7, 3, 6});
    System.out.println(result);

    result = isBean(new int[]{0});
    System.out.println(result);

    result = isBean(new int[]{3, 8, 4});
    System.out.println(result);
  }

  static int isBean(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isBean = false;

      for (int j = 0; j < a.length; j++) {
        if ((a[i] == (a[j] * 2)) || (a[i] == (a[j] * 2 +1)) || (a[i] == (a[j] / 2))) {
          isBean = true;
        }
      }

      if (!isBean) {
        return 0;
      }
    }

    return 1;
  }
}
