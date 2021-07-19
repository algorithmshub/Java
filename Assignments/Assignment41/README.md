# Assignment43

A number is called digit-increasing if it is equal to `n + nn + nnn + ...` for some digit n between `1` and `9`.

For example `24` is digit-increasing because it equals `2 + 22` (here `n = 2`).

Write a function called `isDigitIncreasing` that:

* returns `1` if its argument is digit-increasing
* otherwise it returns `0`

The signature of the method is `int isDigitIncreasing(int n)`

| if n is | then function returns | reason |
|:-------------|:-------------|:-------------|
| 7 | 1 | because 7 = 7 (here n is 7) |
| 36 | 1 | because 36 = 3 + 33 |
| 984 | 1 | because 984 = 8 + 88 + 888 |
| 7404 | 1 | because 7404 = 6 + 66 + 666 + 6666 |

### Solution

```java
public class Assignment43 {
  public static void main(String[] args) {
    int result = isDigitIncreasing(7);
    System.out.println(result);

    result = isDigitIncreasing(36);
    System.out.println(result);

    result = isDigitIncreasing(984);
    System.out.println(result);

    result = isDigitIncreasing(7404);
    System.out.println(result);
  }

  static int isDigitIncreasing(int n) {
    for (int i = 1; i <= 9; i++) {
      int sum = 0;
      int product = 0;

      while (sum < n) {
        product = (product * 10) + i;
        sum += product;
        System.out.println(sum);
      }

      if (n == sum) {
        return 1;
      }
    }

    return 0;
  }
}
```
