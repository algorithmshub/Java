# Assignment82

Write a function named `largestDifferenceOfEvens` which returns the largest difference between even valued elements of its array argument.

### Example

`largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9})` should:

* return `6 = (4 - (-2))`
* return `-1` if there are fewer than `2` even numbers in the array

The function signature is `int largestDifferenceOfEvens(int[] a)`

| a is | return | reason |
|:-------------|:-------------|:-------------|
| {1, 3, 5, 9} | -1 | because there are no even numbers |
| {1, 18, 5, 7, 33} | -1 | because there is only one even number 18 |
| {2, 2, 2, 2} | 0 | because 2-2 == 0 |
| {1, 2, 1, 2, 1, 4, 1, 6, 4} | 4 | because 6 - 2 == 4 |

### Solution

```java
public class Assignment82 {
  public static void main(String[] args) {
    int result = largestDifferenceOfEvens(new int[]{-2, 3, 4, 9});
    System.out.println(result);

    result = largestDifferenceOfEvens(new int[]{1, 3, 5, 9});
    System.out.println(result);

    result = largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33});
    System.out.println(result);

    result = largestDifferenceOfEvens(new int[]{2, 2, 2, 2});
    System.out.println(result);

    result = largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4});
    System.out.println(result);
  }

  static int largestDifferenceOfEvens(int[] a) {
    boolean even = false;
    int largestDiff = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        for (int j = i + 1; j < a.length; j++) {
          if (a[j] % 2 == 0) {
            even = true;
            int diff = a[i] > a[j] ? a[i] - a[j] : a[j] - a[i];
            largestDiff = diff > largestDiff ? diff : largestDiff;
          }
        }
      }

      if (!even && i == a.length -1) {
        return -1;
      }
    }

    return largestDiff;
  }
}
```
