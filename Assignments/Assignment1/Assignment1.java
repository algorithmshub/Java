public class Assignment1 {
  public static void main(String[] args) {
    System.out.println(f(new int[]{1, 2, 3, 4}) == 3);
    System.out.println(f(new int[]{4, 1, 2, 3}) == 3);
    System.out.println(f(new int[]{1, 1, 2, 2}) == 1);
    System.out.println(f(new int[]{1, 1}) == -1);
    System.out.println(f(new int[]{1}) == -1);
    System.out.println(f(new int[]{}) == -1);
  }

  public static int f(int[] a) {
    int max1 = -1;
    int max2 = -1;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max1) {
        max2 = max1;
        max1 = a[i];
      } else if (a[i] > max2 && a[i] != max1) {
        max2 = a[i];
      }
    }

    return max2;
  }
}
