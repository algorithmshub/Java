# MaxList.java

Find the maximum number of an array.

### Solution

```java
/**
  * Author
  *
  * Bunlong @AlgorithmsHub 
  */
public class MaxList {

  /** Driver Code */
  public static void main(String[] args) {
    int result = findMax(new int[]{ 12, 35, 7, 10, 34, 2 });
    System.out.println(result);
  }

  /**
   * find the maximum number of an array
   *
   * @param a the array contains element
   * @return max value of given array
   */
  public static int findMax(int[] a) {
    int maxValue = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] > maxValue) {
        maxValue = a[i];
      }
    }

    return maxValue;
  }
}
```
