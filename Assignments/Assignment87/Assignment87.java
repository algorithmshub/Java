public class Assignment87 {
  public static void main(String args[]) {
    int result = isDaphne(new int[]{2, 4, 2});
    System.out.println(result);

    result = isDaphne(new int[]{1, 3, 17, -5});
    System.out.println(result);

    result = isDaphne(new int[]{3, 2, 5});
    System.out.println(result);
  }

  static int isDaphne(int[] a) {
    boolean isOdd = false;
    boolean isEven = false;

    for (int item : a) {
      if (item % 2 == 0) {
        isEven = true;
      } else {
        isOdd = true;
      }

      if (isEven && isOdd) return 0;
    }

    return 1;
  }
}
