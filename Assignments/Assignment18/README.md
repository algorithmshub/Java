# Assignment18

A twin prime is a prime number that differs from another prime number by `2`.

Write a function named `isTwinPrime` with an integer parameter that:

* returns `1` if the parameter is a twin prime
* otherwise it returns `0`

Recall that a prime number is a number with no factors other than `1` and itself.

The function signature is `int isTwinPrime(int n)`

| number | is twin prime? |
|:-------------|:-------------|
| 5 | 5 is prime; 5+2 is prime |
| 7 | 7 is prime; 7-2 is prime |
| 53 | 53 is prime; but neither 53-2 nor 53+2 is prime |
| 9 | 9 is not prime |

```java
public class Assignment18 {
  public static void main(String[] args) {
    int result = isTwinPrime(5);
    System.out.println(result);

    result = isTwinPrime(7);
    System.out.println(result);

    result = isTwinPrime(53);
    System.out.println(result);

    result = isTwinPrime(9);
    System.out.println(result);
    
  }

  static int isTwinPrime(int n) {
    if (isPrime(n)) {
      if (isPrime(n - 2) || isPrime(n + 2)) {
        return 1;
      }
    }

    return 0;
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }

    return n < 0 ? false : true;
  }
}
```
