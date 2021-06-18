# Assignment5

Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.

The signature of the function is `int f(int n)`

| if the input integer is | return |
|:-------------|:-------------|
| 1234 | 4321 |
| 12005 | 50021 |
| 1 | 1 |
| 1000 | 1 |
| 0 | 0 |
| -12345 | -54321 |

### Solution

```java
public class Assignment5 {
  public static void main(String[] args) {
    int result = f(1234);
    System.out.println(result);

    result = f(12005);
    System.out.println(result);

    result = f(1);
    System.out.println(result);

    result = f(0);
    System.out.println(result);

    result = f(-12345);
    System.out.println(result);
  }

  static int f(int n) {
    if (n == 0) {
      return 0;
    }
    int reverse = 0;
    while (n != 0) {
      reverse = (reverse * 10) + ( n % 10);
      n /= 10;
    }
    return reverse;
  }
}
```
