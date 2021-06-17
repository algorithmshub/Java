public class Assignment4 {
  public static void main(String[] args) {
    int result = f(new int[]{1, 2, 3, 4, 5});
    System.out.println(result);

    result = f(new int[]{3, 2, 1, 4, 5});
    System.out.println(result);

    result = f(new int[]{3, 2, 1, 4, 1});
    System.out.println(result);

    result = f(new int[]{1, 2, 3, 4});
    System.out.println(result);

    result = f(new int[]{});
    System.out.println(result);

    result = f(new int[]{10});
    System.out.println(result);
  }

  static int f(int[] a) {
    if (a == null || (a.length % 2 == 0)) {
      return 0;
    }

    int middleIndex = a.length / 2;
    int middleItem = a[middleIndex];

    for (int i = 0; i < a.length; i++) {
      if (middleItem >= a[i] && middleIndex != i) {
        return 0;
      }
    }

    return 1;
  }
}
