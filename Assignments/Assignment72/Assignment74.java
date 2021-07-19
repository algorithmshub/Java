public class Assignment74 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{-4, 0, 1, 0, 2});
    System.out.println(result);

    result = isMeera(new int[]{-1, 0, 0, 8, 0});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= i) {
        return 0;
      }
    }

    return 1;
  }
}
