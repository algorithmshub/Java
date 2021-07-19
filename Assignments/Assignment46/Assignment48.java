public class Assignment48 {
  public static void main(String[] args) {
    int result = isNormal(1);
    System.out.println(result);

    result = isNormal(2);
    System.out.println(result);

    result = isNormal(3);
    System.out.println(result);

    result = isNormal(4);
    System.out.println(result);

    result = isNormal(5);
    System.out.println(result);

    result = isNormal(6);
    System.out.println(result);

    result = isNormal(7);
    System.out.println(result);

    result = isNormal(8);
    System.out.println(result);

    result = isNormal(9);
    System.out.println(result);
  }

  static int isNormal(int n) {
    for (int i = 2; i < n; i++) {
      int factor = 0;
      if (n % i ==0)
        factor = i;

      if (factor % 2 != 0)
        return 0;
    }

    return 1;
  }
}
