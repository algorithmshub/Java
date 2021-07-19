public class Assignment50 {
  public static void main(String[] args) {
    int result = isEvens(2426);
    System.out.println(result);

    result = isEvens(3224);
    System.out.println(result);
  }

  static int isEvens(int n) {
    while (n > 0) {
      int lastDigit = n % 10;
      
      if (lastDigit % 2 != 0) {
        return 0;
      }

      n /= 10;
    }

    return 1;
  }
}
