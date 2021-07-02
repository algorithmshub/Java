# Assignment80

An array is called layered if its elements are in ascending order and each element appears two or more times.

For example `{1, 1, 2, 2, 2, 3, 3}` is layered but `{1, 2, 2, 2, 3, 3}` and `{3, 3, 1, 1, 1, 2, 2}` are not.

Write a method named `isLayered` that:

* accepts an integer array
* returns `1` if the array is layered
* otherwise it returns `0`

The function signature is `int isLayered(int[] a)`

| If the input array is | return |
|:-------------|:-------------|
| {1, 1, 2, 2, 2, 3, 3} | 1 |
| {3, 3, 3, 3, 3, 3, 3} | 1 |
| {1, 2, 2, 2, 3, 3} | 0 (because there is only one occurence of the value 1) |
| {2, 2, 2, 3, 3, 1, 1} | 0 (because values are not in ascending order) |
| {2} | 0 |
| {} | 0 |

### Solution

```java
public class Assignment80 {
  public static void main(String[] args) {
    int result = isLayered(new int[]{1, 1, 2, 2, 2, 3, 3});
    System.out.println(result);

    result = isLayered(new int[]{3, 3, 3, 3, 3, 3, 3});
    System.out.println(result);

    result = isLayered(new int[]{1, 2, 2, 2, 3, 3});
    System.out.println(result);

    result = isLayered(new int[]{2, 2, 2, 3, 3, 1, 1});
    System.out.println(result);

    result = isLayered(new int[]{2});
    System.out.println(result);

    result = isLayered(new int[]{});
    System.out.println(result);
  }

  static int isLayered(int[] a) {
    if (a.length <= 1) {
      return 0;
    }

    int count = 1;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]){
        return 0;
      }

      if (a[i] == a[i + 1]) {
        count++;
      }

      if (a[i] != a[i + 1]) {
        if (count < 2) {
          return 0;
        }

        count = 1;
      }
    }

    return 1;
  }
}
```
