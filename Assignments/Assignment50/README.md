# Assignment50

An Evens number is an integer whose digits are all even.

For example `2426` is an Evens number but `3224` is not.

Write a function named isEvens that:

* returns `1` if its integer argument is an Evens number
* otherwise it returns `0`

The function signature is `int isEvens (int n)`

### Solution

```java
public class Assignment50 {
  public static void main(String[] args) {
    int result = isEvens(2426);
    System.out.println(result);

    result = isEvens(3224);
    System.out.println(result);
  }

  static int isEvens(int n) {
    while (n > 0) {
      int lastDigit = n % 10;
      
      if (lastDigit % 2 != 0) {
        return 0;
      }

      n /= 10;
    }

    return 1;
  }
}
```
