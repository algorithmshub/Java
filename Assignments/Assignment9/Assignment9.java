public class Assignment9 {
  public static void main(String[] args) {
    int result = isDivisible(new int[]{3, 3, 6, 36}, 3);
    System.out.println(result);

    result = isDivisible(new int[]{4}, 2);
    System.out.println(result);

    result = isDivisible(new int[]{3, 4, 3, 6, 36}, 3);
    System.out.println(result);

    result = isDivisible(new int[]{6, 12, 24, 36}, 12);
    System.out.println(result);

    result = isDivisible(new int[]{}, 1);
    System.out.println(result);
  }

  static int isDivisible(int [] a, int divisor) {
    int isDivisible = 1;
    
    for (int i = 0; i < a.length; i++) {
      if (a[i] % divisor != 0) {
        isDivisible = 0;
        break;
      }
    }

    return isDivisible;
  }
}
