public class Assignment16 {
  public static void main(String[] args) {
    int result = isstepped(new int[]{1, 1, 1, 5, 5, 5, 5, 8, 8, 8});
    System.out.println(result);

    result = isstepped(new int[]{1, 1, 5, 5, 5, 5, 8, 8, 8});
    System.out.println(result);

    result = isstepped(new int[]{5, 5, 5, 15});
    System.out.println(result);

    result = isstepped(new int[]{3, 3, 3, 2, 2, 2, 5, 5, 5});
    System.out.println(result);

    result = isstepped(new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1});
    System.out.println(result);

    result = isstepped(new int[]{1, 1, 1});
    System.out.println(result);

    result = isstepped(new int[]{1, 1, 1, 1, 1, 1, 1});
    System.out.println(result);
  }

  static int isStepped(int[] a) {
    int isstepped = 1;
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      count = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[i] == a[j]) {
          count++;
        }
      }

      if (count < 3) {
        isstepped = 0;
        break;
      }
    }

    for (int i = 0; i < a.length -1 ; i++) {
      if (a[i] > a[i + 1]) {
        isstepped = 0;
        break;
      }
    }

    return isstepped;
  }
}
