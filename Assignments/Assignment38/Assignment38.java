public class Assignment38 {
  public static void main(String[] args) {
    int result = isStacked(1);
    System.out.println(result);

    result = isStacked(3);
    System.out.println(result);

    result = isStacked(6);
    System.out.println(result);

    result = isStacked(10);
    System.out.println(result);

    result = isStacked(15);
    System.out.println(result);

    result = isStacked(7);
    System.out.println(result);

    result = isStacked(8);
    System.out.println(result);

    result = isStacked(9);
    System.out.println(result);
  }

  static int isStacked(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
      if (sum == n)
        return 1;
    }

    return 0;
  }
}
