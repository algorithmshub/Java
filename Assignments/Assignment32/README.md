# Assignment34

An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element.

Note that only arrays with an odd number of elements have a middle element.

Write a function named `isCentered` that:

* accepts an integer array
* returns `1` if it is a centered array
* otherwise it returns `0`

### Examples

* `{1, 2, 3, 4, 5}` is not a centered array (the middle element `3` is not strictly less than all other elements)
* `{3, 2, 1, 4, 5}` is centered (the middle element `1` is strictly less than all other elements)
* `{3, 2, 1, 4, 1}` is not centered (the middle element `1` is not strictly less than all other elements)
* `{3, 2, 1, 1, 4, 6}` is not centered (no middle element since array has even number of elements)
* `{}` is not centered (no middle element)
* `{1}` is centered (satisfies the condition vacuously)

The function signature is `int isCentered(int[] a)`

### Solution

```java
public class Assignment34 {
  public static void main(String[] args) {
    int result = isCentered(new int[]{1, 2, 3, 4, 5});
    System.out.println(result);

    result = isCentered(new int[]{5, 3, 3, 4, 5});
    System.out.println(result);

    result = isCentered(new int[]{3, 2, 1, 4, 5});
    System.out.println(result);

    result = isCentered(new int[]{3, 2, 1, 4, 1});
    System.out.println(result);

    result = isCentered(new int[]{3, 2, 1, 1, 4, 6});
    System.out.println(result);

    result = isCentered(new int[]{});
    System.out.println(result);

    result = isCentered(new int[]{1});
    System.out.println(result);
  }

  static int isCentered(int[] a) {
    if (a.length == 0 && a.length % 2 == 0) {
      return 0;
    }

    int centerIndex = (a.length - 1) / 2;
    int centerValue = a[centerIndex];

    for (int i = 0; i < a.length; i++) {
      if (i != centerIndex && a[i] <= centerValue) {
        return 0;
      }
    }

    return 1;
  }
}
```
