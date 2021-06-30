public class Assignment73 {
  public static void main(String[] args) {
    int result = isMeera(6);
    System.out.println(result);

    result = isMeera(30);
    System.out.println(result);

    result = isMeera(21);
    System.out.println(result);
  }

  static int isMeera(int n) {
    int meeraCount = 0;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        meeraCount++;
      }
    }

    if (n % meeraCount == 0) {
      return 1;
    }

    return 0;
  }
}
