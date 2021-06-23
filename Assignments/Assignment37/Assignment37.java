public class Assignment37 {
  public static void main(String[] args) {
    int result = countOnes(9);
    System.out.println(result);

    result = countOnes(5);
    System.out.println(result);

    result = countOnes(15);
    System.out.println(result);
  }

  static int countOnes(int n) {
    int countOnes = 0;

    while (n > 0) {
      int digit = n % 2;

      if (digit == 1) {
        countOnes++;
      }

      n /= 2;
    }

    return countOnes;
  }
}
