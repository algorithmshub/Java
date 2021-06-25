# Assignment54

An integer is defined to be "Continuous factored" if it can be expressed as the product of two or more continuous integers greater than `1`.

### Examples

"Continuous factored" integers are:

* `6 = 2 * 3`
* `60 = 3 * 4 * 5`
* `120 = 4 * 5 * 6`
* `90 = 9 * 10`

### Examples

Integers that are NOT "Continuous factored" are:

* `99 = 9 * 11`
* `121 = 11 * 11`
* `2 = 2`
* `13 = 13`

Write a function named `isContinuousFactored(int n)` that:

* returns `1` if `n` is continuous factored
* `0` otherwise

### Solution

```java
public class Assignment54 {
  public static void main(String[] args) {
    int result = isContinuousFactored(6);
    System.out.println(result);

    result = isContinuousFactored(60);
    System.out.println(result);

    result = isContinuousFactored(120);
    System.out.println(result);

    result = isContinuousFactored(90);
    System.out.println(result);

    result = isContinuousFactored(121);
    System.out.println(result);

    result = isContinuousFactored(2);
    System.out.println(result);

    result = isContinuousFactored(13);
    System.out.println(result);
  }

  static int isContinuousFactored(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0 && n % (i + 1) == 0) {
        return 1;
      }
    }

    return 0;
  }  
}
```
