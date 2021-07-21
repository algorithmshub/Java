# Assignment24

Write a function named `largestPrimeFactor` that will return the largest prime factor of a number.

If the number is `<=1` it should return `0`.

Recall that a prime number is `a number > 1` that is divisible only by `1` and itself.

### Examples

* `13` is prime
* `14` is not not prime

The signature of the function is `int largestPrimeFactor(int n)`

| if n is | return | reason |
|:-------------|:-------------|:-------------|
| 10 | 5 | because the prime factors of 10 are 2 and 5 and 5 is the largest one |
| 6936 | 17 | because the distinct prime factors of 6936 are 2, 3 and 17 and 17 is the largest |
| 1 | 0 | because n must be greater than 1 |

### Solution

```java
public class Assignment24 {
  public static void main(String[] args) {
    int result = largestPrimeFactor(10);
    System.out.println(result);

    result = largestPrimeFactor(6936);
    System.out.println(result);

    result = largestPrimeFactor(1);
    System.out.println(result);

    result = largestPrimeFactor(11);
    System.out.println(result);
  }

  static int largestPrimeFactor(int n) {
    if (n <= 1) 
      return 0;

    int largestPrimeFactor = 2;

    for (int i = 2; i < n; i++) {
      if (n % i == 0 && isPrime(i)) {
        largestPrimeFactor = i;
      }
    }

    return largestPrimeFactor;
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return n > 0;
  }
}
```
