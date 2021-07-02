public class Assignment80 {
  public static void main(String[] args) {
    int result = isLayered(new int[]{1, 1, 2, 2, 2, 3, 3});
    System.out.println(result);

    result = isLayered(new int[]{3, 3, 3, 3, 3, 3, 3});
    System.out.println(result);

    result = isLayered(new int[]{1, 2, 2, 2, 3, 3});
    System.out.println(result);

    result = isLayered(new int[]{2, 2, 2, 3, 3, 1, 1});
    System.out.println(result);

    result = isLayered(new int[]{2});
    System.out.println(result);

    result = isLayered(new int[]{});
    System.out.println(result);
  }

  static int isLayered(int[] a) {
    if (a.length <= 1) {
      return 0;
    }

    int count = 1;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]){
        return 0;
      }

      if (a[i] == a[i + 1]) {
        count++;
      }

      if (a[i] != a[i + 1]) {
        if (count < 2) {
          return 0;
        }

        count = 1;
      }
    }

    return 1;
  }
}
