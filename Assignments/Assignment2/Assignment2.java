public class Assignment2 {
  public static void main(String[] args) {
    System.out.println(f(new int[]{1}) == 1);
    System.out.println(f(new int[]{1, 2}) == -1);
    System.out.println(f(new int[]{1, 2, 3}) == 2);
    System.out.println(f(new int[]{1, 2, 3, 4}) == -2);
    System.out.println(f(new int[]{3, 3, 4, 4}) == -2);
    System.out.println(f(new int[]{3, 2, 3, 4}) == 0);
    System.out.println(f(new int[]{4, 1, 2, 3}) == -2);
    System.out.println(f(new int[]{1, 1}) == 2);
    System.out.println(f(new int[]{}) == 0);
  }

  public static int f(int[] a) {
    int X = 0; // X is sum of the odd
    int Y = 0; // Y is sum of the even

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        Y += a[i];
      } else {
        X += a[i];
      }
    }

    return X - Y;
  }  
}
