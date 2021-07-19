# Assignment79

A Meera array is an array that contains the value `1` if and only if it contains a prime number.

Meera array:

* {7, 6, 10, 1} is a Meera array because it contains a prime number `7` and also contains a `1`

Not Meera array:

* `{7, 6, 10}` is not a Meera array because it contains a prime number `7` but does not contain a `1`
* `{6, 10, 1}` is not a Meera array because it contains a `1` but does not contain a prime number

It is okay if a Meera array contains more than one value `1` and more than one prime so the array `{3, 7, 1, 8, 1}` is a Meera array (`3` and `7` are the primes).

Write a function named `isMeera` that:

* returns `1` if its array argument is a Meera array
* returns `0` otherwise

You may assume the existence of a function named `isPrime` that:

* returns `1` if its argument is a prime
* returns `0` otherwise

You do not have to write isPrime you can just call it.

The function signature is `int isMeera(int[] a)`

### Solution

```java
public class Assignment79 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{7, 6, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{7, 6, 10});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{3, 7, 1, 8, 1});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    boolean prime = false;
    boolean one = false;

    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i]) == 1) {
        prime = true;
      }

      if (a[i] == 1) {
        one = true;
      }
    }

    if ((prime && one) || (!prime && !one)) {
      return 1;
    }

    return 0;
  }

  static int isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return 0;
      }
    }

    return n > 1 ? 1 : 0;
  }
}
```
