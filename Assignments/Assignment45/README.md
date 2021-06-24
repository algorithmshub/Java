# Assignment45

An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements sum to the same value.

Write a function named `isDual` that:

* accepts an array of integers
* returns `1` if the array is dual
* otherwise it returns `0`

### Examples

* `{1, 2, 3, 0}` is a dual array (because 1+2 = 3+0 = 3)
* `{1, 2, 2, 1, 3, 0}` is a dual array (because 1+2 = 2+1 = 3+0 = 3)
* `{1, 1, 2, 2}` is not a dual array (because 1+1 is not equal to 2+2)
* `{1, 2, 1}` is not a dual array (because array does not have an even number of elements)
* `{}` is a dual array

The function signature is `int isDual(int[] a)`

### Solution

```java
public class Assignment45 {
  public static void main(String[] args) {
    int result = isDual(new int[]{1, 2, 3, 0});
    System.out.println(result);

    result = isDual(new int[]{1, 2, 2, 1, 3, 0});
    System.out.println(result);

    result = isDual(new int[]{1, 1, 2, 2});
    System.out.println(result);

    result = isDual(new int[]{1, 2, 1});
    System.out.println(result);
  }

  static int isDual(int[] a) {
    if (a.length % 2 != 0) {
      return 0;
    }

    int sum = a[0] + a[1];

    for (int i = 0; i < a.length - 1; i += 2) {
      if (sum != a[i] + a[i + 1]) {
        return 0;
      }
    }

    return 1;
  }
}
```
