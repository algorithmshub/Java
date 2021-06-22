public class Assignment29 {
  public static void main(String[] args) {
    int result = isSumSafe(new int[]{5, -5, 0});
    System.out.println(result);

    result = isSumSafe(new int[]{5, -2, 1});
    System.out.println(result);
 
    result = isSumSafe(new int[]{});
    System.out.println(result);
  }

  static int isSumSafe(int[] a) {
    if (a.length == 0)
      return 0;

    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == sum) {
        return 0;
      }
    }

    return 1;
  }
}
