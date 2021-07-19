public class Assignment39 {
  public static void main(String[] args) {
    int result = secondLargest(new int[]{12, 35, 1, 10, 34, 1});
    System.out.println(result);
  }

  static int secondLargest(int[] a) {
    int max = -1;
    int secondMax = -1;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        secondMax = max;
        max = a[i];
      }

      if (a[i] > secondMax && a[i] != max)
        secondMax = a[i]; 
    }

    return secondMax;
  }
}
