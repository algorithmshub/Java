# Assignment90

A Suff array is defined to be an array where for every value n in the array there is also an element `n­-1` or `n+1` in the array.

### Example

`{2, 10, 9, 3}` is a Suff array because:

* 2 = 3­-1
* 10 = 9+1
* 9 = 10-­1
* 3 = 2 + 1

`{2, 2, 3, 3, 3}`, `{1, 1, 1, 2, 1, 1}` and `{0, ­1, 1}` are Suff arrays.

`{3, 4, 5, 7}` is not a Suff array because of the value `7` which requires that the array contains either the value `6` (`7­-1`) or `8` (`7+1`) but neither of these values are in the array.

The function signature is `int isSuff(int[] a)`

### Solution

```java
public class Assignment90 {
  public static void main(String args[]) {
    int result = isSuff(new int[]{2, 10, 9, 3});
    System.out.println(result);

    result = isSuff(new int[]{2, 2, 3, 3, 3});
    System.out.println(result);

    result = isSuff(new int[]{1, 1, 1, 2, 1, 1});
    System.out.println(result);

    result = isSuff(new int[]{0, 1, 1});
    System.out.println(result);

    result = isSuff(new int[]{3, 4, 5, 7});
    System.out.println(result);
  }

  static int isSuff(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isSuff = false;

      for (int j = 0; j < a.length; j++) {
        if ((a[i] == (a[j] - 1)) || (a[i] == (a[j] + 1))) {
          isSuff = true;
          break;
        }
      }

      if (!isSuff) return 0;
    }

    return 1;
  }
}
```
