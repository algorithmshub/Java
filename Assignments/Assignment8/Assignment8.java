public class isSquare {
  public static void main(String[] args) {
    int result = isSquare(4);
    System.out.println(result);

    result = isSquare(25);
    System.out.println(result);

    result = isSquare(-4);
    System.out.println(result);

    result = isSquare(8);
    System.out.println(result);

    result = isSquare(0);
    System.out.println(result);
  }

  static int isSquare(int n) {
    for (int i = 0 ; i <= n; i++) {
      if ((i * i) == n) {
        return 1;
      }
    }

    return 0;
  }
}
