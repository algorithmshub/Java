# Assignment64

A wave array is defined to an array which does not contain two even numbers or two odd numbers in adjacent locations.

Wave arrays:

* `{7, 2, 9, 10, 5}`, `{4, 11, 12, 1, 6}`, `{1, 0, 5}` and `{2}` are all wave arrays.

Not a wave array:

* `{2, 6, 3, 4}` is not a wave array because the even numbers `2` and `6` are adjacent to each other.

Write a function named `isWave` that:

* returns `1` if its array argument is a Wave array
* otherwise it returns `0`

The function signature is `int isWave (int[] a)`

### Solution

```java
public class Assignment64 {
  public static void main(String[] args) {
    int result = isWave(new int[]{7, 2, 9, 10, 5});
    System.out.println(result);

    result = isWave(new int[]{4, 11, 12, 1, 6});
    System.out.println(result);

    result = isWave(new int[]{1, 0, 5});
    System.out.println(result);

    result = isWave(new int[]{2});
    System.out.println(result);

    result = isWave(new int[]{2, 6, 3, 4});
    System.out.println(result);
  }

  static int isWave(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 == 1 && a[i + 1] % 2 == 1)) {
        return 0;
      }
    }

    return 1;
  }
}
```
