# Assignment85

Write a function named `factorTwoCount` that returns the number of times that `2` divides the argument.

### Example

`factorTwoCount(48)` returns `4` because:

* `48/2 = 24`
* `24/2 = 12`
* `12/2 = 6`
* `6/2 = 3`

`2` does not divide `3` evenly.

`factorTwoCount(27)` returns `0` because `2` does not divide `27`.

The function signature is `int factorTwoCount(int n)`

```java
public class Assignment85 {
  public static void main(String args[]) {
    int result = factorTwoCount(48);
    System.out.println(result);

    result = factorTwoCount(27);
    System.out.println(result);
  }

  static int factorTwoCount(int n) {
    int count = 0;
    
    while (n % 2 == 0) {
      n /= 2;
      count++;
    }

    return count;
  }
}
```
