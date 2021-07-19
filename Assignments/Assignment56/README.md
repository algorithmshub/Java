# Assignment58

A Bean array is defined to be an integer array where for every value n in the array, there is also an element 2n, 2n+1 or n/2 in the array.

### Example

Bean array:

* `{4, 9, 8}` is a Bean array because for `4`, `8` is present; for `9`, `4` is present; for `8`, `4` is present.
* `{2, 2, 5, 11, 23}`, `{7, 7, 3, 6}` and `{0}` are a Bean array

Not a Bean array:

* `{3, 8, 4}` is not a Bean array because of the value `3` which requires that the array contains either the value `6`, `7` or `1` and none of these values are in the array.

Write a function named `isBean` that:

* returns `1` if its array argument is a Bean array
* otherwise it returns a `0`

The function signature is `int isBean(int[] a)`

### Solution

```java
public class Assignment58 {
  public static void main(String[] args) {
    int result = isBean(new int[]{4, 9, 8});
    System.out.println(result);

    result = isBean(new int[]{2, 2, 5, 11, 23});
    System.out.println(result);

    result = isBean(new int[]{7, 7, 3, 6});
    System.out.println(result);

    result = isBean(new int[]{0});
    System.out.println(result);

    result = isBean(new int[]{3, 8, 4});
    System.out.println(result);
  }

  static int isBean(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isBean = false;

      for (int j = 0; j < a.length; j++) {
        if ((a[i] == (a[j] * 2)) || (a[i] == (a[j] * 2 +1)) || (a[i] == (a[j] / 2))) {
          isBean = true;
        }
      }

      if (!isBean) {
        return 0;
      }
    }

    return 1;
  }
}
```
