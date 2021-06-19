public class Assignment7 {
  public static void main(String[] args) {
    int result = sumIsPower(new int[]{8, 8, 8});
    System.out.println(result);
    
  }

  static int sumIsPower(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    int power = 1;
    for (int i = 1; i < 1000; i++) {
      power *= 2;
      if (sum == power) {
        return 1;
      }
    }

    return 0;
  }
}
