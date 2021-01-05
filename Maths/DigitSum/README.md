
# DigitSum.java

What is Digit Sum?

In mathematics, the digit sum of a natural number in a given number base is the sum of all its digits.

For examples:

The digit sum of the decimal number 9045 would be 9 + 0 + 4 + 5 = 18.

### Solution

```java
public class DigitSum {

  public static void main(String[] args) {
    System.out.println(digitSum(-123) == 6);
    System.out.println(digitSumRecursion(123) == 6);
  }

  /**
   * Calculate the sum of digits of a number
   *
   * @param n the number contains digits
   * @return sum of digits of given {@code n}
   */
  public static int digitSum(int n) {
    n = n < 0 ? -n : n;
    int sum = 0;

    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }

  /**
   * Calculate the sum of digits of a number
   *
   * @param n the number contains digits
   * @return sum of digits of given {@code n}
   */
  public static int digitSumRecursion(int n) {
    n = n < 0 ? -n : n;
    return n < 10 ? n : n % 10 + digitSumRecursion(n / 10);
  }
}
```
