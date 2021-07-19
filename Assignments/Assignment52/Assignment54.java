public class Assignment54 {
  public static void main(String[] args) {
    int result = isContinuousFactored(6);
    System.out.println(result);

    result = isContinuousFactored(60);
    System.out.println(result);

    result = isContinuousFactored(120);
    System.out.println(result);

    result = isContinuousFactored(90);
    System.out.println(result);

    result = isContinuousFactored(121);
    System.out.println(result);

    result = isContinuousFactored(2);
    System.out.println(result);

    result = isContinuousFactored(13);
    System.out.println(result);
  }

  static int isContinuousFactored(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0 && n % (i + 1) == 0) {
        return 1;
      }
    }

    return 0;
  }  
}
