public class Assignment55 {
  public static void main(String[] args) {
    int result = checkConcatenatedSum(198, 2);
    System.out.println(result);

    result = checkConcatenatedSum(198, 3);
    System.out.println(result);

    result = checkConcatenatedSum(2997, 3);
    System.out.println(result);

    result = checkConcatenatedSum(2997, 2);
    System.out.println(result);

    result = checkConcatenatedSum(13332, 4);
    System.out.println(result);

    result = checkConcatenatedSum(9, 1);
    System.out.println(result);
  }

  static int checkConcatenatedSum(int n, int catlen) {
    int tmpN = n;
    int sum = 0;

    while (tmpN > 0) {
      int lastDigit = tmpN % 10;

      for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
        sum += lastDigit * i;
      }

      tmpN /= 10;
    }

    if (n == sum) {
      return 1;
    }

    return 0;
  }  
}
