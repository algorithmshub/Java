# MinList.java

### Flowchart



### Code

```java
/**
  * Author
  *
  * Bunlong @AlgorithmsHub 
  */
public class MinList {

  /** Driver Code */
  public static void main(String[] args) {
    int result = min(new int[]{ 12, 35, 7, 10, 34, 2 });
    System.out.println(result);
  }

  /**
    * Returns the smaller of a {@code int} value in a list.
    *
    * @param a an argument.
    * @return the smaller of {@code a}.
    */
  public static int min(int[] a) {
    int minValue = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] < minValue) {
        minValue = a[i];
      }
    }

    return minValue;
  }
}

```
