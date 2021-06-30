# Assignment76

Define a Meera array to be an array a if it satisfies two conditions:

* `a[i]` is less than `i` for `i = 0` to `a.length­-1`<br/>
* sum of all elements of a is `0`

### Examples

`{­-4, 0, 1, 0, 2, 1}` is a Meera array because:

* `-4 = a[0] < 0`
* `0 = a[1] < 1`
* `1 = a[2] < 2`
* `0 = a[3] < 3`
* `2 = a[4] < 4`
* `1 = a[5] < 5`
* `-4 + 0 + 1 + 0 + 2 + 1 = 0`

`{-8, 0, 0, 8, 0}` is not a Meera array because `a[3]` is `8` which is not less than `3`. Thus condition fails.

`{­-8, 0, 0, 2, 0}` is not a Meera array because `-­8 + 2 = ­6` not equal to zero. Thus condition fails.

Write a function named `isMeera` that:\

* returns `1` if its array argument is a Meera array
* otherwise it returns `0`

The function signature is `int isMeera(int[] a)`

### Solution

```java
public class Assignment76 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{-4, 0, 1, 0, 2, 1});
    System.out.println(result);

    result = isMeera(new int[]{-8, 0, 0, 8, 0});
    System.out.println(result);

    result = isMeera(new int[]{-8, 0, 0, 2, 0});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] >= i) {
        return 0;
      }
      sum += a[i];
    }

    if (sum == 0) {
      return 1;
    }

    return 0;
  }
}
```
