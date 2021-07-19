public class Assignment49 {
  public static void main(String[] args) {
    int result = isOddValent(new int[]{9, 3, 4, 9, 1});
    System.out.println(result);

    result = isOddValent(new int[]{3, 3, 3, 3});
    System.out.println(result);

    result = isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2});
    System.out.println(result);

    result = isOddValent(new int[]{1, 2, 3, 4, 5});
    System.out.println(result);

    result = isOddValent(new int[]{2, 2, 2, 4, 4});
    System.out.println(result);
  }

  static int isOddValent(int[] a) {
    boolean occurrence = false;
    boolean odd = false;
    
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        odd = true;
      }

      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          occurrence = true;
          break;
        }
      }

      if (odd && occurrence)
        return 1;
    }

    return 0;
  }
}
