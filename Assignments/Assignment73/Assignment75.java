public class Assignment75 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{3, 5, -2});
    System.out.println(result);

    result = isMeera(new int[]{8, 3, 4});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if ((a[i] * 2) == a[j]) {
          return 0;
        }
      }
    }

    return 1;
  }
}
