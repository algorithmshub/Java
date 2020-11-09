# MaxList.java

Find the maximum number in an array.

### Code

```java
/**
  * Author
  *
  * Bunlong @AlgorithmsHub 
  */
public class MaxList {

  /** Driver Code */
  public static void main(String[] args) {
    int result = max(new int[]{ 12, 35, 7, 10, 34, 2 });
    System.out.println(result);
  }

  /**
    * Returns the bigger of a {@code int} value in a list.
    *
    * @param a an argument.
    * @return the bigger of {@code a}.
    */
  public static int max(int[] a) {
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
