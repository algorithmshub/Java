# Assignment30

Write a function named `sumDigits` that sums the digits of its integer argument.

### Examples

* `sumDigits(3114)` returns `9`
* `sumDigits(-­6543)` returns `18`
* `sumDigits(0)` returns `0`

The signature of the function is `int sumDigits (int n)`

### Solution

```java
public class Assignment30 {
  public static void main(String[] args) {
    int result = sumDigits(3114);
    System.out.println(result);

    result = sumDigits(-6543);
    System.out.println(result);
  }

  static int sumDigits(int n) {
    if (n < 0)
      n = -n;

    int sum = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      sum += lastDigit;
      n /= 10;
    }

    return sum;
  }
}
```
