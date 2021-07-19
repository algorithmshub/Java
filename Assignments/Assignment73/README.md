# Assignment75

A Meera array is defined to be an array such that for all values n in the array, the value `2 * n` is not in the array.

### Examples

* `{3, 5, ­2}` is a Meera array because `3 * 2, 5 * 2` and `­2 * 2` are not in the array
* `{8, 3, 4}` is not a Meera array because for `n = 4`, `2 * n = 8` is in the array.

Write a function named `isMeera` that:

* returns `1` if its array argument is a Meera array
* otherwise it returns `0`

The function signature is `int isMeera(int[] a)`

### Solution

```java
public class Assignment75 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{3, 5, -2});
    System.out.println(result);

    result = isMeera(new int[]{8, 3, 4});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if ((a[i] * 2) == a[j]) {
          return 0;
        }
      }
    }

    return 1;
  }
}
```
