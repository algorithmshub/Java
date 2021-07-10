public class Assignment93 {
  public static void main(String[] args) {
    int result = arrayHasNoZeroes(new int[]{1, 2, 3});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{1, 0, 4, 0});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{1, 2, 3, 0});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{0, 0, 0, 0});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{});
    System.out.println(result);
  }

  static int arrayHasNoZeroes(int[] a) {
    for (int anA : a) {
      if (anA == 0) return 0;
    }
    return 1;
  }
}
