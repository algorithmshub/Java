public class Assignment41 {
  public static void main(String[] args) {
    int result = isCubePerfect(new int[]{-1, 1, -8, -27, 8});
    System.out.println(result);

    result = isCubePerfect(new int[]{1, 1, 1, 1});
    System.out.println(result);

    result = isCubePerfect(new int[]{64});
    System.out.println(result);

    result = isCubePerfect(new int[]{63});
    System.out.println(result);

    result = isCubePerfect(new int[]{-1, 0, 1});
    System.out.println(result);

    result = isCubePerfect(new int[]{});
    System.out.println(result);

    result = isCubePerfect(new int[]{3, 7, 21, 36});
    System.out.println(result);
  }

  static int isCubePerfect(int[] a) {
    if (a.length == 0)
      return 1;

    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] > 0 ? a[i] : -a[i];
      
      int n = 1;
      int cube = 0;
      
      while (cube < a[i]) {
        cube = n * n * n;
        n++;
      }

      if (a[i] != cube) {
        return 0;
      }
    }

    return 1;
  }
}
