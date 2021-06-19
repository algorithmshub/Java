public class Assignment6 {
  public static void main(String[] args) {
    int result = isAllPossibilities(new int[]{1, 2, 0, 3});
    System.out.println(result);

    result = isAllPossibilities(new int[]{3, 2, 1, 0});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{1, 2, 4, 3});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{0, 2, 3});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{0});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{});
    System.out.println(result);
  }

  static int isAllPossibilities(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean f = false;
      for (int j = 0; j < a.length; j++) {
        if (i == a[j]) f = true;
      }
      if (!f) return 0;
    }

    return 1;
  }
}
