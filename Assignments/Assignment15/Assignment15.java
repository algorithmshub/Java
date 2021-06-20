public class Assignment15 {
  public static void main(String[] args) {
    int result = closestFibonacci(12);
    System.out.println(result);

    result = closestFibonacci(33);
    System.out.println(result);

    result = closestFibonacci(34);
    System.out.println(result);
  }

  static int closestFibonacci(int n) {
    if (n < 1) {
      return 0;
    }

    int next = 0;
    int n1 = 0;
    int n2 = 1;

    for (int i = 1; i <= n; i++) {
      if (i <= 1)
         next = i;
      else {
        next = n1 + n2;
        
        if (next > n) {
          next = n2;
          break;
        }

        n1 = n2;
        n2 = next;
      }
    }

    return next;
  }
}
