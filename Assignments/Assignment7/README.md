# Assignment7

Write a function `sumIsPower` with signatuare `boolean sumIsPower(int[] arr)` which outputs:

* `0` if the input array `arr` is `null`
* `1` if the sum of the elements in the input array `arr` is a power of `2`
* `0` otherwise

Recall that the powers of `2` are `1, 2, 4, 8, 16,` and so on.

In general a number is a power of `2` if and only if it is of the form `2 to the power of n` for some non-negative integer `n`.

You may assume (without verifying in your code) that all elements in the array are positive integers. 

### Examples

* `sumIsPower({8, 8, 8, 8})` is `1` since `8 + 8 + 8 + 8 = 32 = power(2, 5)`
* `sumIsPower({8, 8, 8})` is `0` since `8 + 8 + 8 = 24` not a power of `2`

### Solution

```java
public class Assignment7 {
  public static void main(String[] args) {
    int result = sumIsPower(new int[]{8, 8, 8, 8});
    System.out.println(result);

    result = sumIsPower(new int[]{8, 8, 8});
    System.out.println(result);
  }

  static int sumIsPower(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    int power = 1;
    for (int i = 1; i < 1000; i++) {
      power *= 2;
      if (sum == power) {
        return 1;
      }
    }

    return 0;
  }
}
```
