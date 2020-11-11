# MaxAbsoluteList.java

Find the maximum absolute value of an array.

### Code

```java
/**
 * Author
 *
 * Bunlong @AlgorithmsHub 
 */

/**
 * Expected
 *
 * findMaxAbsolute([0, -5, -1, 11]) === 11, findMaxAbsolute([7 , -17, -9]) === -17
 */
public class MaxAbsoluteList {

  /** Driver Code */
  public static void main(String[] args) {
    System.out.println(findMaxAbsolute(new int[]{ 0, -5, -1, 11 }) == 11);
    System.out.println(findMaxAbsolute(new int[]{ 7 , -17, -9 }) == -17);
  }

  /**
   * get the value, return the absolute max value
   *
   * @param a contains elements
   * @return the absolute max value
   */
  public static int findMaxAbsolute(int[] a) {
    int maxAbsValue = a[0];

    for (int i = 1, length = a.length; i < length; ++i) {
      if (absVal(a[i]) > absVal(maxAbsValue)) {
        maxAbsValue = a[i];
      }
    }

    return maxAbsValue;
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
```
