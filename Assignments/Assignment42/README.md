# Assignment42

A number `n>0` is called cube-powerful if it is equal to the sum of the cubes of its digits.

Write a function named `isCubePowerful` that:

* returns `1` if its argument is cube-powerful
* otherwise it returns `0`

The function prototype is `int isCubePowerful(int n)`

Hint: use modulo 10 arithmetic to get the digits of the number.

| if n is | return | reason |
|:-------------|:-------------|:-------------|
| 153 | 1 | because 153 = 1*1*1 + 5*5*5 + 3*3*3 |
| 370 | 1 | because 370 = 3*3*3 + 7*7*7 + 0*0*0 |
| 371 | 1 | because 371 = 3*3*3 + 7*7*7 + 1*1*1 |
| 407 | 1 | because 407 = 4*4*4 + 0*0*0 + 7*7*7 |
| 87 | 0 | because 87 != 8*8*8 + 7*7*7 |
| 0 | 0 | because n must be greater than 0. |
| -81 | 0 | because n must be greater than 0. |

### Solution

```java
public class Assignment42 {
  public static void main(String[] args) {
    int result = isCubePowerful(153);
    System.out.println(result);

    result = isCubePowerful(370);
    System.out.println(result);

    result = isCubePowerful(371);
    System.out.println(result);

    result = isCubePowerful(407);
    System.out.println(result);

    result = isCubePowerful(87);
    System.out.println(result);

    result = isCubePowerful(0);
    System.out.println(result);

    result = isCubePowerful(-81);
    System.out.println(result);
  }

  static int isCubePowerful(int n) {
    if (n <= 0)
      return 0;

    int sum = 0;
    int copiedN = n;

    while (n > 0) {
      int lastDigit = n % 10;
      sum += lastDigit * lastDigit * lastDigit;
      n /= 10;
    }

    if (sum == copiedN) return 1;

    return 0;
  }
}
```
