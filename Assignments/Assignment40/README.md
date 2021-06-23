# Assignment40

An array `a` is called zero-limited if the following two conditions hold:

* `a[3 * n + 1]` is `0` for `n >= 0` where `3 * n + 1` is less than the number of elements in the array
* if `i != 3 * n + 1` for some `n`, then `a[i]` does not equal `0`

For example, `{1, 0, 5, -1, 0, 2, 3, 0, 8}` is zero-limited because `a[3 * 0 + 1] = 0`, `a[3 * 1 + 1] = 0` and `a[3 * 2 + 1] = 0` and all other elements are non-zero.

Write a function named `isZeroLimited` that:

* returns `1` if its array argument is zero-limited
* else it returns `0`

The function signature is `int isZeroLimited(int[] a)`

| if a is | return | reason |
|:-------------|:-------------|:-------------|
| {0, 0, 0, 0, 0} | 0 | Only a[1] and a[4] can be 0 |
| {1, 0} | 1 | a[1] is 0, all other elements are non-zero |
| {0, 1} | 0 | a[1] must be 0 (and a[0] cannot be 0) |
| {5} | 1 | Note, because the length of the array is 1, there can be no zero values, since the first one would occur at a[1] |
| {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0} | 1 | Elements a[1], a[4], a[7] and a[10] are 0 and all others are non zero |
| {} | 1 | Since there are no elements, none can fail the condition. |

The best answer will make only one pass through the array. i.e will have only one loop.

### Solution

```java
public class Assignment40 {
  public static void main(String[] args) {
    int result = isZeroLimited(new int[]{1, 0, 5, -1, 0, 2, 3, 0, 8});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{0, 0, 0, 0, 0});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{1, 0});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{0, 1});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{5});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0});
    System.out.println(result);
    
    result = isZeroLimited(new int[]{});
    System.out.println(result);
  }

  static int isZeroLimited(int[] a) {
    for (int i = 1; i < a.length; i += 3) {
      for (int j = 0; j < a.length; j++) {
        if (i == j) {
          if (a[i] != 0) {
            return 0;
          }
          break;
        }

        if (a[j] == 0) {
          return 0;
        }
        break;
      }
    }

    return 1;
  }
}
```
