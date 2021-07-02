public class Assignment78 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{7, 9, 0, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 8});
    System.out.println(result);

    result = isMeera(new int[]{7, 6, 1});
    System.out.println(result);

    result = isMeera(new int[]{9, 10, 0});
    System.out.println(result);

    result = isMeera(new int[]{1, 1, 0, 8, 0, 9, 9, 1});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    boolean no1 = false;
    boolean no9 = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        no1 = true;
      }

      if (a[i] == 9) {
        no9 = true;
      }
    }

    if ((no1 && no9) || (!no1 && !no9)) {
      return 1;
    }

    return 0;
  }
}
