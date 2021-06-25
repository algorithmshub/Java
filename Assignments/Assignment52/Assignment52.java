public class Assignment52 {
  public static void main(String[] args) {
    int result = isBalanced(new int[]{-2, 3, 2, -3});
    System.out.println(result);

    result = isBalanced(new int[]{-2, 2, 2, 2});
    System.out.println(result);

    result = isBalanced(new int[]{-5, 2, -2});
    System.out.println(result);
  }

  static int isBalanced(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isBalanced = false;

      for (int j = 0; j < a.length; j++) {
        if (a[i] == -a[j]) {
          isBalanced = true;
          break;
        }
      }

      if(!isBalanced) {
        return 0;
      }
    }

    return 1;
  }  
}
