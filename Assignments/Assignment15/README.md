# Assignment15

The Fibonacci sequence of numbers is `1, 1, 2, 3, 5, 8, 13, 21, 34, ...`.

The first and second numbers are `1` and after that `ni = ni-2 + ni-1` ( e.g. `34 = 13 + 21` ). A number in the sequence is called a Fibonacci number.

Write a method with signature `int closestFibonacci(int n)` which returns the largest Fibonacci number that is less than or equal to its argument.

### Examples

*`closestFibonacci(12)` returns `8` because `8` is the largest Fibonacci number less than `12` 
*`closestFibonacci(33)` returns `21` because `21` is the largest Fibonacci number that `is <= 33`. closestFibonacci(34) should return `34`

If the argument is less than `1` return `0`.

Your solution must not use recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes the same Fibonacci number many times.

### Solution

```java
public class Assignment15 {
  public static void main(String[] args) {
    int result = closestFibonacci(12);
    System.out.println(result);

    result = closestFibonacci(33);
    System.out.println(result);

    result = closestFibonacci(34);
    System.out.println(result);
  }

  static int closestFibonacci(int n) {
    if (n < 1) {
      return 0;
    }

    int next = 0;
    int n1 = 0;
    int n2 = 1;

    for (int i = 1; i <= n; i++) {
      if (i <= 1)
         next = i;
      else {
        next = n1 + n2;
        
        if (next > n) {
          next = n2;
          break;
        }

        n1 = n2;
        n2 = next;
      }
    }

    return next;
  }
}
```
