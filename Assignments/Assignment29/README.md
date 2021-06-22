# Assignment29

Define an array to be sum-safe if none of its elements is equal to the sum of its elements.

The array `a = {5, -5, 0}` is not sum-safe because the sum of its elements is `0` and `a[2] == 0`.

However, the array `a = {5, -2, 1}` is sum-safe because the sum of its elements is `4` and none of its elements equal `4`.

Write a function named `isSumSafe` that:

* returns `1` if its argument is sum-safe
* otherwise it returns `0`

The function signature is `int isSumSafe(int[] a)`

### Examples

* `isSumSafe(new int[ ] {5, -5, 0})` should return `0`
* `isSumSafe(new int[ ]{5, -2, 1})` should return `1`
* return `0` if the array is empty

### Solution

```java
public class Assignment29 {
  public static void main(String[] args) {
    int result = isSumSafe(new int[]{5, -5, 0});
    System.out.println(result);

    result = isSumSafe(new int[]{5, -2, 1});
    System.out.println(result);
 
    result = isSumSafe(new int[]{});
    System.out.println(result);
  }

  static int isSumSafe(int[] a) {
    if (a.length == 0)
      return 0;

    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == sum) {
        return 0;
      }
    }

    return 1;
  }
}
```
