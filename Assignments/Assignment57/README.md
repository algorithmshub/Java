# Assignment59

An array is defined to be a Bean array if the sum of the primes in the array is equal to the first element of the array. If there are no primes in the array, the first element must be 0. 

### Examples

Bean array:

* `{21, 3, 7, 9, 11 4, 6}` is a Bean array because `3`, `7`, `11` are the primes in the array and they sum to `21` which is the first element of the array
* `{13, 4, 4,4, 4}` is also a Bean array because the sum of the primes is `13` which is also the first element
* `{10, 5, 5}`, `{0, 6, 8, 20}` and `{3}` are Bean arrays

Not a Bean array:

* `{8, 5, ­5, 5, 3}` is not a Bean array because the sum of the primes is `5+5+3 = 13` but the first element of the array is `8`. Note that `­5` is not a prime because prime numbers are positive

Write a function named `isBeanArray` that:

* returns `1` if its integer array argument is a Bean array
* otherwise it returns `0`

The function signature is `int isBeanArray (int[] a)`

You may assume that a function named `isPrime` exists that:

* returns `1` if its int argument is a prime
* otherwise it returns `0`

You do not have to write this function, you just have to call it.

### Solution

```java
public class Assignment59 {
  public static void main(String[] args) {
    int result = isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6});
    System.out.println(result);

    result = isBeanArray(new int[]{13, 4, 4, 4, 4});
    System.out.println(result);

    result = isBeanArray(new int[]{10, 5, 5});
    System.out.println(result);

    result = isBeanArray(new int[]{0, 6, 8, 20});
    System.out.println(result);

    result = isBeanArray(new int[]{3});
    System.out.println(result);

    result = isBeanArray(new int[]{8, 5, -5, 5, 3});
    System.out.println(result);
  }

  static int isBeanArray(int[] a) {
    int a1 = a[0];
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i])) {
        sum += a[i];
      }
    }

    if (sum == a1) {
      return 1;
    }

    return 0;
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
