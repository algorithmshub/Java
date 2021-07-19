# Assignment38

Define a stacked number to be a number that is the sum of the first `n` positive integers for some `n`.

The first `5` stacked numbers are:

* `1 = 1`
* `3 = 1 + 2`
* `6 = 1 + 2 + 3`
* `10 = 1 + 2 + 3+ 4`
* `15 = 1 + 2 + 3 + 4 + 5`

Note that from the above we can deduce that `7, 8,` and `9` are not stacked numbers because they cannot be the sum of any sequence of positive integers that start at `1`.

Write a function named `isStacked` that:

* returns `1` if its argument is stacked.
* otherwise it returns `0`.

### Examples

* `isStacked(10)` should return `1` 
* `isStacked(7)` should return `0`

Its signature is `int isStacked(int n)`

### Solution

```java
public class Assignment38 {
  public static void main(String[] args) {
    int result = isStacked(1);
    System.out.println(result);

    result = isStacked(3);
    System.out.println(result);

    result = isStacked(6);
    System.out.println(result);

    result = isStacked(10);
    System.out.println(result);

    result = isStacked(15);
    System.out.println(result);

    result = isStacked(7);
    System.out.println(result);

    result = isStacked(8);
    System.out.println(result);

    result = isStacked(9);
    System.out.println(result);
  }

  static int isStacked(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
      if (sum == n)
        return 1;
    }

    return 0;
  }
}
```
