# Assignment32

A number `n` is triangular if `n == 1 + 2 + ... + j` for some `j`.

Write a function `int isTriangular(int n)` that:

* returns `1` if `n` is a triangular number
* otherwise it returns `0`

The first `4` triangular numbers are:

* `1` (j=1)
* `3` (j=2)
* `6` (j=3)
* `10` (j=4)

### Solution

```java
public class Assignment32 {
  public static void main(String[] args) {
    int result = isTriangular(1);
    System.out.println(result);

    result = isTriangular(3);
    System.out.println(result);

    result = isTriangular(4);
    System.out.println(result);

    result = isTriangular(6);
    System.out.println(result);

    result = isTriangular(10);
    System.out.println(result);

    result = isTriangular(11);
    System.out.println(result);

    result = isTriangular(12);
    System.out.println(result);

    result = isTriangular(13);
    System.out.println(result);

    result = isTriangular(14);
    System.out.println(result);

    result = isTriangular(15);
    System.out.println(result);
  }

  static int isTriangular(int n) {
    int sum = 0;

    for (int i = 0; sum < n; i++) {
      sum += i;
    }

    if (sum == n) return 1;
    return 0;
  }
}
```
