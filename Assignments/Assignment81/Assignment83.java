public class Assignment83 {
  public static void main(String[] args) {
    int result = goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9});
    System.out.println(result);

    result = goodSpread(new int[]{3, 1, 3, 1, 3, 5, 5, 3});
    System.out.println(result);
  }

  static int goodSpread(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int count = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[i] == a[j]) {
          count++;
          if (count > 3) {
            return 0;
          }
        }
      }
    }

    return 1;
  }
}
