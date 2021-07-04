# Assignment9

Write a function named `isDivisible` that:

* takes an integer array and a divisor
* returns `1` if all its elements are divided by the divisor with no remainder
* otherwise it returns `0`

The function signature is `int isDivisible(int [] a, int divisor)`

| if a is | and divisor is | return | because |
|:-------------|:-------------|:-------------|:-------------|
| {3, 3, 6, 36} | 3 | 1 | all elements of a are divisible by 3 with no remainder. |
| {4} | 2 | 1 | all elements of a are even |
| {3, 4, 3, 6, 36} | 3 | 0 | because when a[1] is divided by 3, it leaves a remainder of 1 |
| {6, 12, 24, 36} | 12 | 0 | because when a[0] is divided by 12, it leaves a remainder of 6. |
| {} | anything | 1 | because no element fails the division test. |

### Solution

```java
public class Assignment9 {
  public static void main(String[] args) {
    int result = isDivisible(new int[]{3, 3, 6, 36}, 3);
    System.out.println(result);

    result = isDivisible(new int[]{4}, 2);
    System.out.println(result);

    result = isDivisible(new int[]{3, 4, 3, 6, 36}, 3);
    System.out.println(result);

    result = isDivisible(new int[]{6, 12, 24, 36}, 12);
    System.out.println(result);

    result = isDivisible(new int[]{}, 1);
    System.out.println(result);
  }

  static int isDivisible(int [] a, int divisor) {
    int isDivisible = 1;
    
    for (int i = 0; i < a.length; i++) {
      if (a[i] % divisor != 0) {
        isDivisible = 0;
        break;
      }
    }

    return isDivisible;
  }
}
```
