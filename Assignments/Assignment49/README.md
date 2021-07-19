# Assignment51

An array is defined to be a Magic array if the sum of the primes in the array is equal to the first element of the array.

If there are no primes in the array, the first element must be `0`.

So `{21, 3, 7, 9, 11 4, 6}` is a Magic array because `3, 7, 11` are the primes in the array and they sum to `21` which is the first element of the array.

`{13, 4, 4, 4, 4}` is also a Magic array because the sum of the primes is `13` which is also the first element.

Other Magic arrays are `{10, 5, 5}`, `{0, 6, 8, 20}` and `{3}`.

`{8, 5, -­5, 5, 3}` is not a Magic array because the sum of the primes is `5+5+3 = 13`. Note that `-­5` is not a prime because prime numbers are positive.

Write a function named `isMagicArray` that:

* returns `1` if its integer array argument is a Magic array
* otherwise it returns `0`

The function signature is `int isMagicArray (int[] a)`

### Solution

```java
public class Assignment51 {
  public static void main(String[] args) {
    int result = isMagicArray(new int[]{21, 3, 7, 9, 11 4, 6});
    System.out.println(result);

    result = isMagicArray(new int[]{13, 4, 4, 4, 4});
    System.out.println(result);

    result = isMagicArray(new int[]{10, 5, 5});
    System.out.println(result);

    result = isMagicArray(new int[]{0, 6, 8, 20});
    System.out.println(result);

    result = isMagicArray(new int[]{3});
    System.out.println(result);

    result = isMagicArray(new int[]{8, 5, -­5, 5, 3});
    System.out.println(result);
  }

  static int isMagicArray(int[] a) {
    if (a.length == 0)
      return 0;

    int sumPrime = 0;

    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i] == 1))
        sumPrime += a[i];
    }

    if (a[0] == sumPrime)
      return 1;

    return 0;
  }

  static int isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return 0;
    }

    return n > 0 ? 1 : 0;
  }
}
```
