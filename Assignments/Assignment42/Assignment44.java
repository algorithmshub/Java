public class Assignment44 {
  public static void main(String[] args) {
    int result = isDual(new int[]{1, 2, 1, 3, 3, 2});
    System.out.println(result);

    result = isDual(new int[]{2, 5, 2, 5, 5});
    System.out.println(result);

    result = isDual(new int[]{3, 1, 1, 2, 2});
    System.out.println(result);
  }

  static int isDual(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int twice = 1;
      
      for (int j = 0; j < a.length; j++) {
        if (i != j && a[i] == a[j]) {
          twice++;
        }
      }

      if (twice != 2) {
        return 0;
      }
    }

    return 1;
  }
}
