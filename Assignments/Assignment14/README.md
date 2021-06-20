# Assignment14

An array is defined to be twin paired if its even-valued elements (if any) are in ascending order and its odd-valued elements (if any) are in ascending order.

The array `{-6, 12, 1, 24, 3, 5}` is twin paired because the even-valued elements `(-6, 12, 24)` are in ascending order and so are the odd-valued elements `(1, 3, 5)`.

However, the array `{3, 2, 1}` is not twin paired because the odd numbers are not in ascending order.

Write a function named `isTwinPaired` that returns `1` if its array argument is twin paired, otherwise it returns `0`.

The function signature is `int isTwinPaired(int[] a)`

Other twin paired arrays include:

* {2, 4, 32}
* {2, 2, 2, 1, 1, 1}
* {1, 19, 23}
* {1, 2}
* {2, 1}
* {8}
* {17}
* { }

### Solution

```java
public class Assignment14 {
  public static void main(String[] args) {
    int result = isTwinPaired(new int[]{-6, 12, 1, 24, 3, 5 });
    System.out.println(result);

    result = isTwinPaired(new int[]{-6, 12, 1, 24, 5, 3 });
    System.out.println(result);
  }

  static int isTwinPaired(int[] a) {
    int even[] = new int[3];
    int odd[] = new int[3];
    int j = 0;
    int k = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        even[j] = a[i];
        j++;
      } else {
        odd[k] = a[i];
        k++;
      }
    }

    if(isSorted(odd) == 1 && isSorted(even) == 1) {
      return 1;
    } else {
      return 0;
    }
  }

  static int isSorted(int data[]) {
    int isSorted = 0;

    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] < data[i + 1]) {
        isSorted = 1;
      } else {
        return 0;
      }
    }

    return isSorted;
  }
}
```
