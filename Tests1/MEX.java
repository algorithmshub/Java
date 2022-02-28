public class MEX {
  public static void main(String[] args) {
    int arr[] = { 0, 4, 5, 6, 7 };
    int n = arr.length;
    int x = 3;

    // output: 2
    System.out.println(minOpeartions(arr, n, x));
  }

  static int minOpeartions(int arr[], int n, int x) {
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
