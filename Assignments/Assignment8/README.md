# Assignment8

Write a function named `isSquare` that:

* returns `1` if its integer argument is a square of some integer
* otherwise it returns `0`

Your function must not use any function or method (e.g. sqrt) that comes with a runtime library or class library.

The signature of the function is `int isSquare(int n)`

| if n is | return | reason |
|:-------------|:-------------|:-------------|
| 4 | 1 | because 4 = 2 * 2 |
| 25 | 1 | because 25 = 5 * 5 |
| -4 | 0 | because there is no integer that when squared equals -4. (note that -2 squared is 4 not -4) |
| 8 | 0 | because the square root of 8 is not an integer |
| 0 | 1 | because 0 = 0 * 0 |

### Solution

```java
public class Assignment8 {
  public static void main(String[] args) {
    int result = isSquare(4);
    System.out.println(result);

    result = isSquare(25);
    System.out.println(result);

    result = isSquare(-4);
    System.out.println(result);

    result = isSquare(8);
    System.out.println(result);

    result = isSquare(0);
    System.out.println(result);
  }

  static int isSquare(int n) {
    for (int i = 0 ; i <= n; i++) {
      if ((i * i) == n) {
        return 1;
      }
    }

    return 0;
  }
}
```
