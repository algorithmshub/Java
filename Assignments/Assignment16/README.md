# Assignment16

An array is defined to be stepped if it is in ascending order and there are `3` or more occurrences of each distinct value in the array.

Note that ascending order means `a[n]<=a[n+1]`. It does not mean `a[n]` (this is strictly ascending).

Write a function named `isStepped` that:

* returns `1` if its array argument is stepped
* otherwise return `0`

The signature is `int isStepped(int[] a)`

| If the array is | return | reason |
|:-------------|:-------------|:-------------|
| {1, 1, 1, 5, 5, 5, 5, 8, 8, 8} | 1 | it is in ascending order. the distinct values of the array are 1, 5, 8 and there are three or more occurrences of each of these values |
| {1, 1, 5, 5, 5, 5, 8, 8, 8} | 0 | even though it is in ascending order there are only two occurrences of the value 1 |
| {5, 5, 5, 15} | 0 | even though it is in ascending order there is only one occurrence of the value 15 |
| {3, 3, 3, 2, 2, 2, 5, 5, 5} | 0 | it is not in ascending order |
| {3, 3, 3, 2, 2, 2, 1, 1, 1} | 0 | it is not in ascending order |
| {1, 1, 1} | 1 | it is in ascending order and there are three or more occurrences of each distinct value. in this case there is only one distinct value |
| {1, 1, 1, 1, 1, 1, 1} | 1 | it is in ascending order and there are three or more occurrences of each distinct value. in this case there is only one distinct value |

### Solution

```java
public class Assignment16 {
  public static void main(String[] args) {
    int result = isstepped(new int[]{1, 1, 1, 5, 5, 5, 5, 8, 8, 8});
    System.out.println(result);

    result = isstepped(new int[]{1, 1, 5, 5, 5, 5, 8, 8, 8});
    System.out.println(result);

    result = isstepped(new int[]{5, 5, 5, 15});
    System.out.println(result);

    result = isstepped(new int[]{3, 3, 3, 2, 2, 2, 5, 5, 5});
    System.out.println(result);

    result = isstepped(new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1});
    System.out.println(result);

    result = isstepped(new int[]{1, 1, 1});
    System.out.println(result);

    result = isstepped(new int[]{1, 1, 1, 1, 1, 1, 1});
    System.out.println(result);
  }

  static int isStepped(int[] a) {
    int isstepped = 1;
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      count = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[i] == a[j]) {
          count++;
        }
      }

      if (count < 3) {
        isstepped = 0;
        break;
      }
    }

    for (int i = 0; i < a.length -1 ; i++) {
      if (a[i] > a[i + 1]) {
        isstepped = 0;
        break;
      }
    }

    return isstepped;
  }
}
```
