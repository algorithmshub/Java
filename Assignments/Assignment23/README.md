# Assignment23

A fancy number is a number in the sequence `1, 1, 5, 17, 61, ...`.

First two fancy numbers are `1` and any fancy number other than the first two is sum of the three times previous one and two times the one before that.

### Examples

* `1`
* `1`
* `3 * 1 + 2 * 1 = 5`
* `3 * 5 + 2 * 1 = 17`
* `3 * 17 + 2 * 5 = 61`

Write a function named `isFancy` that:

* returns `1` if its integer argument is a Fancy number
* otherwise it returns `0`

The signature of the function is `int isFancy(int n)`

### Solution

```java
public class Assignment23 {
  public static void main(String[] args) {
    int result = isFancy(1);
    System.out.println(result);

    result = isFancy(5);
    System.out.println(result);

    result = isFancy(17);
    System.out.println(result);

    result = isFancy(61);
    System.out.println(result);

    result = isFancy(62);
    System.out.println(result);
  }

  static int isFancy(int n) {
    if (n == 1)
      return 1;

    int sum = 1;
    int n1 = 1;
    int n2 = 1;

    for (int i = 1; i < n; i++) {
      sum = 2 * n1 + 3 * n2;
      
      if (sum == n)
        return 1;

      n1 = n2;
      n2 = sum;
    }

    return 0;
  }
}
```
