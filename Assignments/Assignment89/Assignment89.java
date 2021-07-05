public class Assignment89 {
  public static void main(String args[]) {
    int result = isPascal(6);
    System.out.println(result);

    result = isPascal(15);
    System.out.println(result);

    result = isPascal(7);
    System.out.println(result);
  }

  static int isPascal(int n) {
    int sum = 0;
    int isPascal = 0;

    for (int i = 1; i < n; i++) {
      sum += i;
      if (sum == n) isPascal = 1;
    }

    return isPascal;
  }
}
