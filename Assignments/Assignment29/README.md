# Assignment31

Define a Triple array to be an array where every value occurs exactly three times.

For example, `{3, 1, 2, 1, 3, 1, 3, 2, 2}` is a Triple array.

The following arrays are not Triple arrays:

* `{2, 5, 2, 5, 5, 2, 5}` (5 occurs four times instead of three times)
* `{3, 1, 1, 1}` (3 occurs once instead of three times)

Write a function named `isTriple` that:

* returns `1` if its array argument is a Triple array
* otherwise it returns `0`

The function signature is `int isTriple (int[] a)`

### Solution

```java
public class Assignment31 {
  public static void main(String[] args) {
    int result = isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2});
    System.out.println(result);

    result = isTriple(new int[]{2, 5, 2, 5, 5, 2, 5});
    System.out.println(result);

    result = isTriple(new int[]{3, 1, 1, 1});
    System.out.println(result);
  }

  static int isTriple(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int count = 0;
      
      for (int j = 0; j < a.length; j++) {
        if (a[i] == a[j]) {
          count ++;
        }
      }

      if (count != 3) {
        return 0;
      }
    }

    return 1;
  }
}
```
