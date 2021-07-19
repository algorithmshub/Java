# Assignment74

Define a Meera array to be an array where `a[n]` is less than `n` for `n=0` to `a.length­ - 1`.

### Examples

`{-­4, 0, 1, 0, 2}` is a Meera array because:

* `a[0] < 0`
* `a[1] < 1`
* `a[2] < 2`
* `a[3] <3`
* `a[4] < 4` 

`{-­1, 0, 0, 8, 0}` is not a Meera array because `a[3]` is `8` which is not less than `3`.

Write a function named `isMeera` that:

* returns `1` if its array argument is a Meera array
* otherwise it returns `0`

The function signature is `int isMeera(int[] a)`

### Solution

```java
public class Assignment74 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{-4, 0, 1, 0, 2});
    System.out.println(result);

    result = isMeera(new int[]{-1, 0, 0, 8, 0});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= i) {
        return 0;
      }
    }

    return 1;
  }
}
```
