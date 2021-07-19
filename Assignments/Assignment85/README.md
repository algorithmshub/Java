# Assignment87

A Daphne array is an array that contains either all odd numbers or all even numbers.

### Examples

* `{2, 4, 2}` is Daphne array (only even numbers)
* `{1, 3, 17, ­-5}` is Daphne array (only odd numbers)
* `{3, 2, 5}` is not Daphne array because it contains both odd and even numbers.

Write a function named `isDaphne` that:

* returns `1` if its array argument is a Daphne array
* otherwise it returns `0`

The function prototype is `int isDaphne(int[] a)`

### Solution

```java
public class Assignment87 {
  public static void main(String args[]) {
    int result = isDaphne(new int[]{2, 4, 2});
    System.out.println(result);

    result = isDaphne(new int[]{1, 3, 17, -5});
    System.out.println(result);

    result = isDaphne(new int[]{3, 2, 5});
    System.out.println(result);
  }

  static int isDaphne(int[] a) {
    boolean isOdd = false;
    boolean isEven = false;

    for (int item : a) {
      if (item % 2 == 0) {
        isEven = true;
      } else {
        isOdd = true;
      }

      if (isEven && isOdd) return 0;
    }

    return 1;
  }
}
```
