public class Assignment85 {
  public static void main(String args[]) {
    int result = factorTwoCount(48);
    System.out.println(result);

    result = factorTwoCount(27);
    System.out.println(result);
  }

  static int factorTwoCount(int n) {
    int count = 0;
    
    while (n % 2 == 0) {
      n /= 2;
      count++;
    }

    return count;
  }
}
