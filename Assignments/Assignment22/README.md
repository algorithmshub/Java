# Assignment24

A positive, non-zero number `n` is a factorial prime if it is equal to `factorial(n) + 1` for some `n` and it is prime.

Recall that `factorial(n)` is equal to `1 * 2 * ... * n-1 * n`.

The recursive definition is:

* `factorial(1) = 1`
* `factorial(n) = n * factorial(n-1)`

### Example

* `factorial(5) = 1 * 2 * 3 * 4 * 5 = 120`

Recall that a prime number is a natural number which has exactly two distinct natural number divisors `1` and itself.

Write a method named `isFactorialPrime` that:

* returns `1` if its argument is a factorial prime number
* otherwise it returns `0`

The signature of the method is `int isFactorialPrime(int n)`

| if n is | then function returns | reason |
|:-------------|:-------------|:-------------|
| 2 | 1 | because 2 is prime and is equal to factorial(1) + 1 |
| 3 | 1 | because 3 is prime and is equal to factorial(2) + 1 |
| 7 | 1 | because 7 prime and is equal to factorial(3) + 1 |
| 8 | 0 | because 8 is not prime |
| 11 | 0 | because 11 does not equal factorial(n) + 1 for any n (factorial(3)=6, factorial(4)=24) |
| 721 | 0 | because 721 is not prime (its factors are 7 and 103) |

### Solution

```java
public class Assignment24 {
  public static void main(String[] args) {
    int result = isFactorialPrime(2);
    System.out.println(result);

    result = isFactorialPrime(3);
    System.out.println(result);

    result = isFactorialPrime(7);
    System.out.println(result);

    result = isFactorialPrime(8);
    System.out.println(result);

    result = isFactorialPrime(11);
    System.out.println(result);

    result = isFactorialPrime(721);
    System.out.println(result);
  }

  static int isFactorialPrime(int n) {
    if (isPrime(n)) {
      int sum = 0;

      for (int i = 1; i < n && sum < n; i++) {
        sum = factorial(i) + 1;
      }

      if (sum == n)
        return 1;

      return 0;
    }

    return 0;
  }

  static int factorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * factorial(n -1);
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
