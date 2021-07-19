# Assignment91

An array is defined to be a `235` array if the number of elements divisible by `2` plus the number of elements divisible by `3` plus the number of elements divisible by `5` plus the number of elements not divisible by `2`, `3`, or `5` is equal to the number of elements of the array.

Write a method named `is123Array` that:

* returns `1` if its array argument is a `235` array
* otherwise it returns `0`

The function signature is `int is235Array(int[] a)`

Note: remember that a number can be divisible by more than one number.

In the following: `<a, b, c, d>` means that the array has a elements that are divisible by `2`, `b` elements that are divisible by `3`, `c` elements that are divisible by `5` and `d` elements that are not divisible by `2`, `3`, or `5`.

| if a is | return | reason |
|:-------------|:-------------|:-------------|
| {2, 3, 5, 7, 11} | 1 | because one element is divisible by 2 (a[0]); one is divisible by 3 (a[1]); one is divisible by 5 (a[2]) and two are not divisible by 2, 3, or 5 (a[3] and a[4]). So we have <1, 1, 1, 2> and 1+1+1+2 == the number of elements in the array |
| {2, 3, 6, 7, 11} | 0 | because two elements are divisible by 2 (a[0] and a[2]); two are divisible by 3 (a[1] and a[2]); none are divisible by 5 and two are not divisible by 2, 3, or 5 (a[3] and a[4]). So we have <2, 2, 0, 2> and 2 + 2 + 0 + 2 == 6 != the number of elements in the array |
| {2, 3, 4, 5, 6, 7, 8, 9, 10} | 0 | because <5, 3, 2, 1> and 5 + 3 + 2 + 1 == 11 != the number of elements in the array |
| {2, 4, 8, 16, 32} | 1 | because <5, 0, 0, 0> and 5 + 0 + 0 + 0 == 5 == the number of elements in the array |
| {3, 9, 27, 7, 1, 1, 1, 1, 1} | 1 | because <0, 3, 0, 6> and 0 + 3 + 0 + 6 == 9 == the number of elements in the array |
| {7, 11, 77, 49} | 1 | because <0, 0, 0, 4> and 0 + 0 + 0 + 4 == 4 == the number of elements in the array |
| {2} | 1 | because <1, 0, 0, 0> and 1 + 0 + 0 + 0 == 1 == the number of elements in the array |
| {} | 1 | because <0, 0, 0, 0> and 0 + 0 + 0 + 0 == 0 == the number of elements in the array |
| {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7} | 1 | because <4, 1, 0, 6> and 4 + 1 + 0 + 6 == 11 == the number of elements in the array |

### Solution

```java
public class Assignment91 {
  public static void main(String args[]) {
    int result = is235Array(new int[]{2, 3, 5, 7, 11});
    System.out.println(result);

    result = is235Array(new int[]{2, 3, 6, 7, 11});
    System.out.println(result);

    result = is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});
    System.out.println(result);

    result = is235Array(new int[]{2, 4, 8, 16, 32});
    System.out.println(result);

    result = is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1});
    System.out.println(result);

    result = is235Array(new int[]{7, 11, 77, 49});
    System.out.println(result);

    result = is235Array(new int[]{2});
    System.out.println(result);

    result = is235Array(new int[]{});
    System.out.println(result);

    result = is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7});
    System.out.println(result);
  }

  static int is235Array(int[] a) {
    int divisibleBy2 = 0;
    int divisibleBy3 = 0;
    int divisibleBy5 = 0;
    int notDivisible = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 == 0) {
        if (a[i] % 2 == 0) divisibleBy2++;
        if (a[i] % 3 == 0) divisibleBy3++;
        if (a[i] % 5 == 0) divisibleBy5++;
      } else {
        notDivisible++;
      }
    }

    if (divisibleBy2 + divisibleBy3 + divisibleBy5 + notDivisible == a.length) return 1;
    return 0;
  }
}
```
