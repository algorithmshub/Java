/**
 * Expected
 *
 * findMinAbsolute([0, -5, -1, 11]) === 0
 * findMinAbsolute([7 , -17, -9]) === 7
 */
public class MinAbsoluteList {

  public static void main(String[] args) {
    System.out.println(findMinAbsolute(new int[]{ 0, -5, -1, 11 }) == 0);
    System.out.println(findMinAbsolute(new int[]{ 7 , -17, -9 }) == 7);
  }

  /**
   * Get the value, return the absolute min value
   *
   * @param a contains elements
   * @return the absolute min value
   */
  public static int findMinAbsolute(int[] a) {
    int minAbsValue = a[0];

    for (int i = 1, length = a.length; i < length; ++i) {
      if (absVal(a[i]) < absVal(minAbsValue)) {
        minAbsValue = a[i];
      }
    }

    return minAbsValue;
  }

  /**
   * if value is less than zero, make value positive
   *
   * @param value a number
   * @return the absolute value of a number
   */
  public static int absVal(int value) {
    return value < 0 ? -value : value;
  }
}
