# Assignment11

The sum factor of an array is defined to be the number of times that the sum of the array appears as an element of the array.

Write a function named `sumFactor` that returns the sum factor of its array argument.

### Examples

* the sum factor of `{1, -1, 1, -1, 1, -1, 1}` is `4` because the sum of the elements of the array is `1` and `1` appears four times in the array
* the sum factor of `{1, 2, 3, 4}` is `0` because the sum of the elements of the array is `10` and `10` does not occur as an element of the array
* the sum factor of the empty array `{}` is defined to be `0`

The function signature is `int sumFactor(int[] a)`

| if a is | return | reason |
|:-------------|:-------------|:-------------|
| {3, 0, 2, -5, 0} | 2 | the sum of array is 0 and 0 occurs 2 times |
| {9, -3, -3, -1, -1} | 0 | the sum of the array is 1 and 1 does not occur in array |
| {1} | 1 | the sum of the array is 1 and 1 occurs once in the array |
| {0, 0, 0} | 3 | the sum of the array is 0 and 0 occurs 3 times in the array |

### Solution

```java
public class Assignment11 {
  public static void main(String[] args) {
    int result = sumFactor(new int[]{3, 0, 2, -5, 0});
    System.out.println(result);

    result = sumFactor(new int[]{9, -3, -3, -1, -1});
    System.out.println(result);

    result = sumFactor(new int[]{1});
    System.out.println(result);

    result = sumFactor(new int[]{0, 0, 0});
    System.out.println(result);
  }

  static int sumFactor(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    int sumFactor = 0;
    for (int i = 0; i < a.length; i++) {
      if (sum == a[i]) {
        sumFactor++;
      }
    }

    return sumFactor;
  }
}
```
