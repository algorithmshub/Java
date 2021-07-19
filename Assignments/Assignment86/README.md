# Assignment88

A Daphne array is defined to be an array that contains at least one odd number and begins and ends with the same number of even numbers.

### Examples

* `{4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}` is a Daphne array because it begins with three even numbers and ends with three even numbers and it contains at least one odd number
* `{2, 4, 6, 8, 6}` is not a Daphne array because it does not contain an odd number.
* `{2, 8, 7, 10, ­4, 6}` is not a Daphne array because it begins with two even numbers but ends with three even numbers.

Write a function named `isDaphne` that:

* returns `1` if its array argument is a Daphne array
* otherwise it returns `0`

The function signature is `int isDaphne(int[] a)`

### Solution

```java
public class Assignment88 {
  public static void main(String args[]) {
    int result = isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6});
    System.out.println(result);

    result = isDaphne1(new int[]{2, 4, 6, 8, 6});
    System.out.println(result);

    result = isDaphne1(new int[]{2, 8, 7, 10, 4, 6});
    System.out.println(result);
  }

  static int isDaphne(int[] a) {
    int headCountEven = 0;
    int tailCountEven = 0;
    boolean isOdd = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        headCountEven++;
      } else {
        isOdd = true;
        break;
      }
    }

    for (int i = a.length - 1; i >= 0 ; i--) {
      if (a[i] % 2 == 0) {
        tailCountEven++;
      } else {
        break;
      }
    }

    if (headCountEven == tailCountEven && isOdd) return 1;
    return 0;
  }
}
```
