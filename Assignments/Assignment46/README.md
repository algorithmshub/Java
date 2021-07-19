# Assignment48

A normal number is defined to be one that has no odd factors, except for `1` and possibly itself.

Write a method named `isNormal` that:

* returns `1` if its integer argument is normal
* otherwise it returns `0`

# Examples:

* `1, 2, 3, 4, 5, 7, 8` are normal numbers
* `6` and `9` are not normal numbers since 3 is an odd factor
* `10` is not a normal number since `5` is an odd factor

The function signature is `int isNormal(int n)`

### Solution

```java
public class Assignment48 {
  public static void main(String[] args) {
    int result = isNormal(1);
    System.out.println(result);

    result = isNormal(2);
    System.out.println(result);

    result = isNormal(3);
    System.out.println(result);

    result = isNormal(4);
    System.out.println(result);

    result = isNormal(5);
    System.out.println(result);

    result = isNormal(6);
    System.out.println(result);

    result = isNormal(7);
    System.out.println(result);

    result = isNormal(8);
    System.out.println(result);

    result = isNormal(9);
    System.out.println(result);
  }

  static int isNormal(int n) {
    for (int i = 2; i < n; i++) {
      int factor = 0;
      if (n % i ==0)
        factor = i;

      if (factor % 2 != 0)
        return 0;
    }

    return 1;
  }
}
```
