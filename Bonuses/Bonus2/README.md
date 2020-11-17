# Bonus2.java

Write a function that:
* takes an array of integers as an argument
* returns a value based on the sums of the even and odd numbers in the array
* let X = the sum of the odd numbers in the array
* let Y = the sum of the even numbers
* the function should return X - Y

The signature of the function is `int f(int[] a)`:

| Input array | Return |
|:-------------|:-------------|
| {1} | 1 |
| {1, 2} | -1 |
| {1, 2, 3} | 2 |
| {1, 2, 3, 4} | -2 |
| {3, 3, 4, 4} | -2 |
| {3, 2, 3, 4} | 0 |
| {4, 1, 2, 3} | -2 |
| {1, 1} | 2 |
| {} | 0 |

### Solution

```java
public class Bonus2 {

  public static void main(String[] args) {
    System.out.println(f(new int[]{1}) == 1);
    System.out.println(f(new int[]{1, 2}) == -1);
    System.out.println(f(new int[]{1, 2, 3}) == 2);
    System.out.println(f(new int[]{1, 2, 3, 4}) == -2);
    System.out.println(f(new int[]{3, 3, 4, 4}) == -2);
    System.out.println(f(new int[]{3, 2, 3, 4}) == 0);
    System.out.println(f(new int[]{4, 1, 2, 3}) == -2);
    System.out.println(f(new int[]{1, 1}) == 2);
    System.out.println(f(new int[]{}) == 0);
  }

  public static int f(int[] a) {
    int X = 0; // X is sum of the odd
    int Y = 0; // Y is sum of the even

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        Y += a[i];
      } else {
        X += a[i];
      }
    }

    return X - Y;
  }  
}
```
