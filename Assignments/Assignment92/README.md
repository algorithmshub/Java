# Assignment93

Write a function that:

* will return `1` if all its elements are non-zero
* otherwise it returns `0`

The function signature is `int arrayHasNoZeroes(int[] a)`

| if a is | return | reason |
|:-------------|:-------------|:-------------|
| {1, 2, 3} | 1 | all elements are none-zero |
| {1, 0, 4, 0} | 0 | at least one element has the value zero |
| {1, 2, 3, 0} | 0 | at least one element has the value zero |
| {0, 0, 0, 0} | 0 | at least one element has the value zero |
| {} | 1 | since there are no elements; there are no elements whose value is 0 |

### Solution

```java
public class Assignment93 {
  public static void main(String[] args) {
    int result = arrayHasNoZeroes(new int[]{1, 2, 3});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{1, 0, 4, 0});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{1, 2, 3, 0});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{0, 0, 0, 0});
    System.out.println(result);

    result = arrayHasNoZeroes(new int[]{});
    System.out.println(result);
  }

  static int arrayHasNoZeroes(int[] a) {
    for (int anA : a) {
      if (anA == 0) return 0;
    }
    return 1;
  }
}
```
