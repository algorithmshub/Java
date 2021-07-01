# Assignment77

A Meera array is an array that contains the value `0` if and only if it contains a prime number.

Meera array:

* `{7, 6, 0, 10, 1}` is a Meera array because it contains a prime number `7` and also contains a `0`.
* `{6, 10, 1}` is a Meera array because it contains no prime number and also contains no `0`.

Not Meera array:

* `{7, 6, 10}` is not a Meera array because it contains a prime number `7` but does not contain a `0`.
* `{6, 10, 0}` is not a Meera array because it contains a `0` but does not contain a prime number.

It is okay if a Meera array contains more than one value `0` and more than one prime so the array `{3, 7, 0, 8, 0, 5}` is a Meera array (`3`, `5` and `7` are the primes and there are two zeros).

Write a function named `isMeera` that:

* returns `1` if its array argument is a Meera array
* returns `0` otherwise

You may assume the existence of a function named isPrime that:

* returns `1` if its argument is a prime
* returns `0` otherwise

The function signature is `int isMeera(int[] a)`

### Solution

```java
public class Assignment77 {
  public static void main(String[] args) {
    int result = isMeera(new int[]{7, 6, 0, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 1});
    System.out.println(result);

    result = isMeera(new int[]{7, 6, 10});
    System.out.println(result);

    result = isMeera(new int[]{6, 10, 0});
    System.out.println(result);

    result = isMeera(new int[]{3, 7, 0, 8, 0, 5});
    System.out.println(result);
  }

  static int isMeera(int[] a) {
    boolean zero = false;
    boolean prime = false;

    for (int i = 0 ; i < a.length; i++) {
      if (isPrime(a[i]) == 1) {
        prime = true;
      }

      if (a[i] == 0) {
        zero = true;
      }
    }

    if ((zero && prime) || (!zero && !prime)) {
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
