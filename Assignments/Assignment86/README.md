# Assignment86

Two integers are defined to be factor equal if they have the same number of factors.

### Example

integers `10` and `33` are factor equal because:

* `10` has four factors: `1, 2, 5, 10`
* `33` has four factors: `1, 2, 5, 10`

integers `9` and `10` are not factor equal because:

* `9` has only three factors: `1, 3, 9`
* `10` has four factors: `1, 2, 5, 10`

Write a function named `factorEqual(int n, int m)` that:

* returns `1` if `n` and `m` are factor equal
* `0` otherwise

The signature of the function is `int factorEqual(int n, int m)`

```java
public class Assignment86 {
  public static void main(String args[]) {
    int result = factorEqual(10, 33);
    System.out.println(result);

    result = factorEqual(9, 10);
    System.out.println(result);
  }

  static int factorEqual(int n, int m) {
    if (n < 0 || m < 0) return 0;

    int countN = 0;
    int countM = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        countN++;
      }
    }

    for (int j = 1; j <= m; j++) {
      if (m % j == 0) countM++;
    }

    if (countN == countM) return 1;
    return 0;
  }
}
```
