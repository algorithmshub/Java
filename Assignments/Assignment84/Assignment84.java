import java.util.Arrays;

public class Assignment84 {
  public static void main(String[] args) {
    int result[] = fill(new int[]{1, 2, 3, 5, 9, 12, -2, -1}, 3, 10);
    System.out.println(Arrays.toString(result));

    result = fill(new int[]{4, 2, -3, 12}, 1, 5);
    System.out.println(Arrays.toString(result));

    result = fill(new int[]{2, 6, 9, 0, -3}, 0, 4);
    System.out.println(Arrays.toString(result));
  }

  static int[] fill(int[] arr, int k, int n) {
    if (k <= 0 || n <= 0)
      return null;

    int[] arr2 = new int[n];

    for (int i = 0; i < n; ) {
      for (int j = 0; j < k && i < n; j++) {
        arr2[i] = arr[j];
        i++;
      }
    }

    return arr2;
  }
}
