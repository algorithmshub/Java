public class Assignment69 {
  public static void main(String[] args) {
    int result = isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1});
    System.out.println(result);

    result = isOneBalanced(new int[]{});
    System.out.println(result);

    result = isOneBalanced(new int[]{3, 4, 1, 1});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 3, 4});
    System.out.println(result);

    result = isOneBalanced(new int[]{3, 3, 3, 3, 3, 3});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 1, 1, 1, 1});
    System.out.println(result);
  }

  static int isOneBalanced(int[] a) {
    if (a.length == 0) {
      return 1;
    }

    int total1s = 0;
    int totalNon1s = 0;
    boolean non1Start = false;
    boolean non1End = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        if (non1Start) {
          non1End = true;
        }
        
        total1s++;
      } else {
        if (non1End) {
          return 0;
        }

        non1Start = true;
        totalNon1s++;
      }
    }

    if (total1s != totalNon1s) {
      return 0;
    }

    return 1;
  }
}
