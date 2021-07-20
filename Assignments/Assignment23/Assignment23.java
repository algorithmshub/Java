public class Assignment23 {
  public static void main(String[] args) {
    int result = isFancy(1);
    System.out.println(result);

    result = isFancy(5);
    System.out.println(result);

    result = isFancy(17);
    System.out.println(result);

    result = isFancy(61);
    System.out.println(result);

    result = isFancy(62);
    System.out.println(result);
  }

  static int isFancy(int n) {
    if (n == 1)
      return 1;

    int sum = 1;
    int n1 = 1;
    int n2 = 1;

    for (int i = 1; i < n; i++) {
      sum = 2 * n1 + 3 * n2;
      
      if (sum == n)
        return 1;

      n1 = n2;
      n2 = sum;
    }

    return 0;
  }
}
