# Assignment37

Write a function named `countOnes` that returns the number of ones in the binary representation of its argument.

For example, `countOnes(9)` returns `2` because the binary representation of `9` is `1001`.

### Examples

* `countOnes(5)` returns `2` because binary `101` equals `5`
* `countOnes(15)` returns `4` because binary `1111` equals `15`

You may assume that the argument is greater than `0`.

The function prototype is `int countOnes(int n)`

Hint use modulo and integer arithmetic to count the number of ones.

### Solution

```java
public class Assignment37 {
  public static void main(String[] args) {
    int result = countOnes(9);
    System.out.println(result);

    result = countOnes(5);
    System.out.println(result);

    result = countOnes(15);
    System.out.println(result);
  }

  static int countOnes(int n) {
    int countOnes = 0;

    while (n > 0) {
      int digit = n % 2;

      if (digit == 1) {
        countOnes++;
      }

      n /= 2;
    }

    return countOnes;
  }
}
```
