# FactorialRecursion

**What is Factorial?**

The factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.

`n! = n * (n - 1) * (n - 2) * (n - 3) ... 3 * 2 * 1`

**Example**

The factorial of 0! is 1 The factorial of 5! is 5 * 4 * 3 * 2 * 1 = 120.

Write a function to calculate factorial of n using iteration.

**Java**

```js
public class FactorialRecursion {
  public static void main(String[] args) {
    System.out.println(factorial(0) == 1);
    System.out.println(factorial(1) == 1);
    System.out.println(factorial(2) == 2);
    System.out.println(factorial(3) == 6);
  }

  /**
   * Calculate factorial of n using recursion
   *
   * @param n the number
   * @return the factorial of {@code n}
   */
  public static long factorial(int n) {
    return n == 0 || n == 1 ? 1 : n * factorial(n - 1);
  }
}
```
