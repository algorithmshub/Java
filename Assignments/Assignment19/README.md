# Assignment19

Define an array to be n-primeable if for a given `n`, all elements of the array when incremented by `n` are prime.

Recall that a prime number is a number that has no factors except `1` and itself.

Write a method named `isNPrimeable` that has an array parameter and an integer parameter that defines `n`;

* the method returns `1` if its array parameter is n-primeable
* otherwise it returns `0`

The function signature is `int isNPrimeable(int[ ] a, int n)`

| If a is | and n is | then function returns | reason |
|:-------------|:-------------|:-------------|:-------------|
| {5, 15, 27} | 2 | 1 | 5+2=7 is prime, and 15+2=17 is prime, and 27+2=29 is prime |
| {5, 15, 27} | 3 | 0 | 5+3=8 is not prime |
| {5, 15, 26} | 2 | 0 | 26+2=28 is not prime |
| {1, 1, 1, 1, 1, 1, 1} | 4 | 1 | 1+4=5 is prime. This obviously holds for all elements in the array |
| {} | 2 | 1 | Since there are no elements in the array, there cannot exist one that is non-prime when 2 is added to it. |

### Solution

```java
public class Assignment19 {
  public static void main(String[] args) {
    int result = isNPrimeable(new int[]{5, 15, 27}, 2);
    System.out.println(result);

    result = isNPrimeable(new int[]{5, 15, 27}, 3);
    System.out.println(result);

    result = isNPrimeable(new int[]{5, 15, 26}, 2);
    System.out.println(result);

    result = isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4);
    System.out.println(result);

    result = isNPrimeable(new int[]{}, 2);
    System.out.println(result);
  }

  static int isNPrimeable(int[] a, int n) {
    for (int i = 0; i < a.length; i++) {
      if (!isPrime(a[i] + n)) {
        return 0;
      }
    }

    return 1;
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }

    return n < 0 ? false : true;
  }
}
```
