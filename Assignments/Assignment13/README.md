# Assignment13

A Fibonacci number is a number in the sequence `1, 1, 2, 3, 5, 8, 13, 21, ...`.

Note that first two Fibonacci numbers are `1` and any Fibonacci number other than the first two is the sum of the previous two Fibonacci numbers.

For examples: 

* `2 = 1 + 1`
* `3 = 2 + 1`
* `5 = 3 + 2`
* and so on

Write a function named `isFibonacci` that:

* returns `1` if its integer argument is a Fibonacci number
* otherwise it returns `0`

The signature of the function is `int isFibonacci (int n)`

### Solution

```java
public static int isFibonacci(int a) {
  int sum = 0;
  int n1 = 0;
  int n2 = 1;

  for(int i = 0; i <= a; i++) {
    sum = n1 + n2;
    
    if(sum == a) {
      return 1;
    }

    n1 = n2;
    n2 = sum;
  }

  return 0;
}
```