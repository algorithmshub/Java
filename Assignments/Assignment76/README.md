# Assignment78

A Meera array is an array that contains the value `1` if and only if it contains `9`.

Meera array:

* `{7, 9, 0, 10, 1}` is a Meera array because it contains `1` and `9`
* `{6, 10, 8}` is a Meera array because it contains `1` and also contains `9`

Not Meera array:

* `{7, 6, 1}` is not a Meera array because it contains `1` but does not contain a `9`
* `{9, 10, 0}` is not a Meera array because it contains a `9` but does not contain 1`

It is okay if a Meera array contains more than one value `1` and more than one `9` so the array `{1, 1, 0, 8, 0, 9, 9, 1}` is a Meera array.

Write a function named `isMeera` that:

* returns `1` if its array argument is a Meera array
* returns `0` otherwise

The function signature is `int isMeera(int[] a)`

### Solution

```java
public class Assignment78 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{7, 9, 0, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 8});
    System.out.println(result);

    result = isMeera(new int[]{7, 6, 1});
    System.out.println(result);

    result = isMeera(new int[]{9, 10, 0});
    System.out.println(result);

    result = isMeera(new int[]{1, 1, 0, 8, 0, 9, 9, 1});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    boolean no1 = false;
    boolean no9 = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        no1 = true;
      }

      if (a[i] == 9) {
        no9 = true;
      }
    }

    if ((no1 && no9) || (!no1 && !no9)) {
      return 1;
    }

    return 0;
  }
}
```
