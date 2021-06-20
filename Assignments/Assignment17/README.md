# Assignment17

Write a function named `isDigitSum` that:

* returns `1` if sum of all digits of the first argument is less than the second argument
* `0` otherwise.

For example, `isDigitSum(32121, 10)` would return `1` because `3+2+1+2+1 = 9 < 10`.

### Examples

* `isDigitSum(32121, 9)` returns `0`
* `isDigitSum(13, 6)` returns `1`
* `isDigitSum(3, 3)` returns `0`

Note the function should return ­`1` if either argument is negative, so `isDigitSum(-­543, 3)` returns `­-1`.

The function signature is `int isDigitSum(int n, int m)`

### Solution


```java
public class Assignment17 {
  public static void main(String[] args) {
    int result = isDigitSum(32121, 10);
    System.out.println(result);

    result = isDigitSum(32121, 9);
    System.out.println(result);

    result = isDigitSum(13, 6);
    System.out.println(result);

    result = isDigitSum(3, 3);
    System.out.println(result);

    result = isDigitSum(-543, 3);
    System.out.println(result);
  }

  static int isDigitSum(int n, int m) {
    if (n < 0 || m < 0) {
      return -1;
    }

    int sum = 0;

    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      n /= 10;
    }

    if (sum < m) return 1;

    return 0;
  }
}
```
