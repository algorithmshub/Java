# Assignment89

A Pascal number is a number that is the sum of the integers from `1` to `j` for some `j`.

### Examples

* `6` is a Pascal number because `6 = 1 + 2 + 3` ( j is 3 )
* `15` is a Pascal number because `15 = 1 + 2 + 3 + 4 + 5`
* `7` is not a Pascal number because it falls between the Pascal numbers `6` and `10`

Write a function named `isPascal` that:

* returns `1` if its integer argument is a Pascal number
* otherwise it returns `0`

The signature of the function is `int isPascal(int n)`

### Solution

```java
public class Assignment89 {
  public static void main(String args[]) {
    int result = isPascal(6);
    System.out.println(result);

    result = isPascal(15);
    System.out.println(result);

    result = isPascal(7);
    System.out.println(result);
  }

  static int isPascal(int n) {
    int sum = 0;
    int isPascal = 0;

    for (int i = 1; i < n; i++) {
      sum += i;
      if (sum == n) isPascal = 1;
    }

    return isPascal;
  }
}
```
