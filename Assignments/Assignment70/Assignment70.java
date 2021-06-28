public class Assignment70 {
  public static void main(String[] args) {
    int result = isOddHeavy(new int[]{11, 4, 9, 2, 8});
    System.out.println(result);

    result = isOddHeavy(new int[]{11, 4, 9, 2, 3, 10});
    System.out.println(result);

    result = isOddHeavy(new int[]{1});
    System.out.println(result);

    result = isOddHeavy(new int[]{2});
    System.out.println(result);

    result = isOddHeavy(new int[]{1, 1, 1, 1, 1, 1});
    System.out.println(result);

    result = isOddHeavy(new int[]{2, 4, 6, 8, 11});
    System.out.println(result);

    result = isOddHeavy(new int[]{-2, -4, -6, -8, -11});
    System.out.println(result);
  }

  static int isOddHeavy(int[] a) {
    boolean isOddHeavy = false;

    int smallestOdd = Integer.MAX_VALUE;
    int largestEven = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        isOddHeavy = true;

        if (a[i] < smallestOdd) {
          smallestOdd = a[i];
        }
      } else {
        if (a[i] > largestEvent) {
          largestEvent = a[i];
        }
      }
    }

    if (isOddHeavy && smallestOdd > largestEvent) {
      return 1;
    }

    return 0;
  }
}
