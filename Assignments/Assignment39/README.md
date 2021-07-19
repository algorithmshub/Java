# Assignment41

An array is called cube-perfect if all its elements are cubes of some integer.

### Examples

`{-1, 1, -8, -27, 8}` is cube-perfect because:

* `-1 = -1 * -1 * -1`
* `1 = 1 * 1 * 1`
* `-8 = -2 * -2 * -2`
* `-27 = -3 * -3 * -3`
* `8 = 2 * 2 * 2`

`{27, 3}` is not cube-perfect because `3` is not the cube of any integer.

Write a function named `isCubePerfect` that:

* returns `1` if its argument is cube-perfect
* otherwise it returns `0`

The function signature is `int isCubePerfect(int[] a)`

| if a is | return | reason |
|:-------------|:-------------|:-------------|
| {1, 1, 1, 1} | 1 | all elements are cubes of 1 |
| {64} | 1 | 64 = 4*4*4 |
| {63} | 0 | 63 is not the cube of any integer |
| {-1, 0, 1} | 1 | -1 = -1 * -1 * -1, 0 = 0 * 0 * 0, 1=1 * 1 * 1 |
| {} | 1 | no elements fail the cube test |
| {3, 7, 21, 36} | 0 | 3 is not the cube of any integer |

### Solution

```java
public class Assignment41 {
  public static void main(String[] args) {
    int result = isCubePerfect(new int[]{-1, 1, -8, -27, 8});
    System.out.println(result);

    result = isCubePerfect(new int[]{1, 1, 1, 1});
    System.out.println(result);

    result = isCubePerfect(new int[]{64});
    System.out.println(result);

    result = isCubePerfect(new int[]{63});
    System.out.println(result);

    result = isCubePerfect(new int[]{-1, 0, 1});
    System.out.println(result);

    result = isCubePerfect(new int[]{});
    System.out.println(result);

    result = isCubePerfect(new int[]{3, 7, 21, 36});
    System.out.println(result);
  }

  static int isCubePerfect(int[] a) {
    if (a.length == 0)
      return 1;

    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] > 0 ? a[i] : -a[i];
      
      int n = 1;
      int cube = 0;
      
      while (cube < a[i]) {
        cube = n * n * n;
        n++;
      }

      if (a[i] != cube) {
        return 0;
      }
    }

    return 1;
  }
}
```
