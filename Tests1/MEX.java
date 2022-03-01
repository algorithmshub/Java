public class MEX {
  public static void main(String[] args) {
    // int arr[] = { 0, 4, 5, 6, 7 };
    // int n = arr.length;
    // int x = 3;

    // System.out.println(min(arr, n, x)); // 2

    int arr1[] = { 0, 1, 2, 1, 3 };
    int n1 = arr1.length;
    int x1 = 3;

    System.out.println(max(arr1, n1, x1)); // 5
  }

  static int min(int arr[], int n, int x) {
    int k = x, i = 0;
    n--;

    while (n > -1) {
      // if the element is less than x.
      if (arr[n] < x)
        k--;

      // if the element equals to x.
      if (arr[n] == x)
        k++;

      n--;
    }

    return k;
  }

  static int max(int arr[], int n, int x) {
    int k = x, i = 0;
    n--;

    while (n > -1) {
      // if the element is less than x.
      if (arr[n] < x)
        k--;

      // if the element equals to x.
      if (arr[n] == x)
        k++;

      n--;
    }

    return k;
  }
}
