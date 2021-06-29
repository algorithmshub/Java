public class Assignment71 {
  public static void main(String[] args) {
    int result = isNice(new int[]{2, 10, 9, 3});
    System.out.println(result);

    result = isNice(new int[]{2, 2, 3, 3, 3});
    System.out.println(result);

    result = isNice(new int[]{1, 1, 1, 2, 1, 1});
    System.out.println(result);

    result = isNice(new int[]{0, -1, 1});
    System.out.println(result);

    result = isNice(new int[]{3, 4, 5, 7});
    System.out.println(result);
  }

  static int isNice(int[] a) {
    for (int i = 0 ; i < a.length; i++) {
      boolean isNice = false;
      
      for (int j = 0; j < a.length; j++) {
        if ((a[i] == a[j] - 1) || (a[i] == a[j] + 1)) {
          isNice = true;
          break;
        }
      }

      if (!isNice) {
        return 0;
      }
    }

    return 1;
  }
}
