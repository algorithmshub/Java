# Assignment61

A Bunker array is an array that contains the value `1` if and only if it contains a prime number.

Bunker array:

* `{7, 6, 10, 1}` is a Bunker array because it contains a prime number `7` and also contains a `1`

Not a Bunker array:

* `{7, 6, 10}` is not a Bunker array because it contains a prime number `7` but does not contain a `1`
* `{6, 10, 1}` is not a Bunker array because it contains a `1` but does not contain a prime number


It is okay if a Bunker array contains more than one value `1` and more than one prime so `{3, 7, 1, 8, 1}` is a Bunker array (`3` and `7` are the primes).

Write a function named `isBunker` that:

* returns `1` if its array argument is a Bunker array
* returns `0` otherwise

You may assume the existence of a function named `isPrime` that:

* returns `1` if its argument is a prime
* returns `0` otherwise

You do not have to write isPrime, you can just call it.

The function signature is `int isBunker(int[] a)`

### Solution

```java
public class Assignment61 {
  public static void main(String[] args) {
    int result = isBunker(new int[]{7, 6, 10, 1});
    System.out.println(result);

    result = isBunker(new int[]{7, 6, 10});
    System.out.println(result);

    result = isBunker(new int[]{6, 10, 1});
    System.out.println(result);

    result = isBunker(new int[]{3, 7, 1, 8, 1});
    System.out.println(result);
  }

  static int isBunker(int[] a) {
    boolean one = false;
    boolean prime = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        one = true;
      }

      if (isPrime(a[i]) == 1) {
        prime = true;
      }
    }

    if (one && prime) {
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
