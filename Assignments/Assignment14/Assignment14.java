public class Assignment14 {
  public static void main(String[] args) {
    int result = isTwinPaired(new int[]{-6, 12, 1, 24, 3, 5 });
    System.out.println(result);

    result = isTwinPaired(new int[]{-6, 12, 1, 24, 5, 3 });
    System.out.println(result);
  }

  static int isTwinPaired(int[] a) {
    int even[] = new int[3];
    int odd[] = new int[3];
    int j = 0;
    int k = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        even[j] = a[i];
        j++;
      } else {
        odd[k] = a[i];
        k++;
      }
    }

    if(isSorted(odd) == 1 && isSorted(even) == 1) {
      return 1;
    } else {
      return 0;
    }
  }

  static int isSorted(int data[]) {
    int isSorted = 0;

    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] < data[i + 1]) {
        isSorted = 1;
      } else {
        return 0;
      }
    }

    return isSorted;
  }
}
