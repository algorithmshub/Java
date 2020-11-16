
# Factorial.java

What is Factorial?

The factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n:

n! = n * (n - 1) * (n - 2) * (n - 3) ... 3 * 2 * 1.

For examples:

The factorial of 0! is 1
The factorial of 5! is 5 * 4 * 3 * 2 * 1 = 120.

Problem: Write a function to calculate factorial of n using iteration.

### Solution

```java
public class Factorial {

  /* Driver Code */
  public static void main(String[] args) {
    System.out.println(factorial(0) == 1);
    System.out.println(factorial(1) == 1);
    System.out.println(factorial(2) == 2);
    System.out.println(factorial(3) == 6);
  }

  /**
   * calculate factorial of n using iteration
   *
   * @param n the number
   * @return the factorial of {@code n}
   */
  public static long factorial(int n) {
    long fact = 1;

    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    
    return fact;
  }
}
```
