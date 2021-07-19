# Assignment36

Write a function named `countDigit` that returns the number of times that a given digit appears in a positive number.

For example `countDigit(32121, 1)` would return `2` because there are two `1s` in `32121`.

### Examples

* `countDigit(33331, 3)` returns `4`
* `countDigit(33331, 6)` returns `0`
* `countDigit(3, 3)` returns `1`

The function should return `­1` if either argument is `negative`, so `countDigit(­543, 3)` returns ­`1`.

The function signature is `int countDigit(int n, int digit)`

Hint: Use modulo base 10 and integer arithmetic to isolate the digits of the number.

### Solution

```java
public class Assignment36 {
  public static void main(String[] args) {
    int result = countDigit(33331, 3);
    System.out.println(result);

    result = countDigit(33331, 6);
    System.out.println(result);

    result = countDigit(3, 3);
    System.out.println(result);
  }

  static int countDigit(int n, int digit) {
    if (n < 0 || digit < 0)
      return 0;

    int countDigit = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      
      if (lastDigit == digit) {
        countDigit++;
      }

      n /= 10;
    }

    return countDigit;
  }
}
```
