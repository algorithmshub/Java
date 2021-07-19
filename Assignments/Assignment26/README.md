# Assignment28

Write a function named `allValuesTheSame` that:

* returns `1` if all elements of its argument array have the same value
* otherwise, it returns `0`

The function signature is `int allValuesTheSame(int[ ] a)`

| if a is | return |
|:-------------|:-------------|
| {1, 1, 1, 1} | 1 |
| {83, 83, 83} | 1 |
| {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}} | 1 |
| {1, -2343456, 1, -2343456} | 0 (because there are two different values, 1 and -2343456) |
| {0, 0, 0, 0, -1} | 0 (because there are two different values, 0 and -1) |
| {432123456} | 1 |
| {-432123456}} | 1 |
| {} | 0 |

### Solution

```java
public class Assignment28 {
  public static void main(String[] args) {
    int result = allValuesTheSame(new int[]{1, 1, 1, 1});
    System.out.println(result);

    result = allValuesTheSame(new int[]{83, 83, 83});
    System.out.println(result);

    result = allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    System.out.println(result);

    result = allValuesTheSame(new int[]{1, -2343456, 1, -2343456});
    System.out.println(result);

    result = allValuesTheSame(new int[]{0, 0, 0, 0, -1});
    System.out.println(result);

    result = allValuesTheSame(new int[]{432123456});
    System.out.println(result);

    result = allValuesTheSame(new int[]{-432123456});
    System.out.println(result);

    result = allValuesTheSame(new int[]{});
    System.out.println(result);
  }

  static int allValuesTheSame(int[] a) {
    if (a.length <= 0)
      return 0;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] != a[i + 1])
        return 0;
    }

    return 1;
  }
}
```
