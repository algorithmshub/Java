# Assignment68

An onion array is an array that satisfies the following condition for all values of `j` and `k`: if `j>=0` and `k>=0` and `j+k=length` of array and `j!=k` then `a[j]+a[k] <= 10`.

Write a function named `isOnionArray` that:

* returns `1` if its array argument is an onion array
* returns `0` if it is not

Your solution must not use a nested loop (i.e. a loop executed from inside another loop). Furthermore, once you determine that the array is not an onion array your function must return `0`; no wasted loops cycles please.

The function signature is `int isOnionArray(int[] a)`

| a is | the function return | reason |
|:-------------|:-------------|:-------------|
| {1, 2, 19, 4, 5} | 1 | because 1+5 <= 10, 2+4 <=10 |
| {1, 2, 3, 4, 15} | 0 | because 1+15 > 10 |
| {1, 3, 9, 8} | 0 | because 3+9 > 10 |
| {2} | 1 | because there is no j, k where a[j]+a[k] > 10 and j+k=length of array and j!=k |
| {} | 1 | because there is no j, k where a[j]+a[k] > 10 and j+k=length of array and j!=k |
| {-2, 5, 0, 5, 12} | 1 | because -2+12 <= 10 and 5+5 <= 10 |


### Solution

```java
public class Assignment68 {
  public static void main(String[] args) {
    int result = isOnionArray(new int[]{1, 2, 19, 4, 5});
    System.out.println(result);

    result = isOnionArray(new int[]{1, 2, 3, 4, 15});
    System.out.println(result);

    result = isOnionArray(new int[]{1, 3, 9, 8});
    System.out.println(result);

    result = isOnionArray(new int[]{2});
    System.out.println(result);

    result = isOnionArray(new int[]{});
    System.out.println(result);

    result = isOnionArray(new int[]{-2, 5, 0, 5, 12});
    System.out.println(result);
  }

  static int isOnionArray(int[] a) {
    if (a.length == 0 || a.length == 1) {
      return 1;
    }

    for (int i = 0, j = a.length - 1; i < j; i++, j--) {
      if (i + j != a.length) {
        if (a[i] + a[j] > 10) {
          return 0;
        }
      }
    }

    return 1;
  }
}
```
