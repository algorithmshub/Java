# Assignment57

A Bean array is defined to be an array where for every value `n` in the array, there is also an element `n­1` or `n+1` in the array.

### Example

`{2, 10, 9, 3}` is a Bean array because:

* `2 = 3-­1`
* `10 = 9+1`
* `3 = 2+1`
* `9 = 10-­1`

Other Bean arrays include `{2, 2, 3, 3, 3}`, `{1, 1, 1, 2, 1, 1}` and `{0, ­1, 1}`.

The array `{3, 4, 5, 7}` is not a Bean array because of the value `7` which requires that the array contains either the value `6` `(7­-1)` or `8` `(7+1)` but neither of these values are in the A Bunker array is defined to be an array in which at least one odd number is immediately followed by a prime number.

So `{4, 9, 6, 7, 3}` is a Bunker array because the odd number `7` is immediately followed by the prime number `3`.

But `{4, 9, 6, 15, 21}` is not a Bunker array because none of the odd numbers are immediately followed by a prime number array.

Write a function named `isBean` that:

* returns `1` if its array argument is a Bean array
* otherwise it returns a `0`

The function signature is `int isBean(int[] a)`

### Solution

```java
public class Assignment57 {
  public static void main(String[] args) {
    int result = isBean(new int[]{2, 10, 9, 3});
    System.out.println(result);

    result = isBean(new int[]{2, 2, 3, 3, 3});
    System.out.println(result);

    result = isBean(new int[]{1, 1, 1, 2, 1, 1});
    System.out.println(result);

    result = isBean(new int[]{0, -1, 1});
    System.out.println(result);

    result = isBean(new int[]{3, 4, 5, 7});
    System.out.println(result);
  }

  static int isBean(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isBean1 = false;

      for (int j = 0; j < a.length; j++) {
        if ((a[i] == (a[j] - 1)) || (a[i] == (a[j] + 1))) {
          isBean1 = true;
          break;
        }
      }

      if (!isBean1) {
        return 0;
      }
    }

    return 1;
  }
}
```
