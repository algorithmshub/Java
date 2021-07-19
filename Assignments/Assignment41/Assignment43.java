public class Assignment43 {
  public static void main(String[] args) {
    int result = isDigitIncreasing(7);
    System.out.println(result);

    result = isDigitIncreasing(36);
    System.out.println(result);

    result = isDigitIncreasing(984);
    System.out.println(result);

    result = isDigitIncreasing(7404);
    System.out.println(result);
  }

  static int isDigitIncreasing(int n) {
    for (int i = 1; i <= 9; i++) {
      int sum = 0;
      int product = 0;

      while (sum < n) {
        product = (product * 10) + i;
        sum += product;
        System.out.println(sum);
      }

      if (n == sum) {
        return 1;
      }
    }

    return 0;
  }
}
