public class Assignment40 {
  public static void main(String[] args) {
    int result = isZeroLimited(new int[]{1, 0, 5, -1, 0, 2, 3, 0, 8});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{0, 0, 0, 0, 0});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{1, 0});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{0, 1});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{5});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{});
    System.out.println(result);
  }

  static int isZeroLimited(int[] a) {
    for (int i = 1; i < a.length; i += 3) {
      for (int j = 0; j < a.length; j++) {
        if (i == j) {
          if (a[i] != 0) {
            return 0;
          }
          break;
        }

        if (a[j] == 0) {
          return 0;
        }
        break;
      }
    }

    return 1;
  }
}
