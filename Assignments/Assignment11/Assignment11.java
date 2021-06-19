public class Assignment12 {
  public static void main(String[] args) {
    int result = sumFactor(new int[]{3, 0, 2, -5, 0});
    System.out.println(result);

    result = sumFactor(new int[]{9, -3, -3, -1, -1});
    System.out.println(result);

    result = sumFactor(new int[]{1});
    System.out.println(result);

    result = sumFactor(new int[]{0, 0, 0});
    System.out.println(result);
  }

  static int sumFactor(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    int sumFactor = 0;
    for (int i = 0; i < a.length; i++) {
      if (sum == a[i]) {
        sumFactor++;
      }
    }

    return sumFactor;
  }
}
