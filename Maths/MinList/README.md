# MinList

**Example**

Find the minimum number of an array.

**Java**

```js
public class MinList {
  public static void main(String[] args) {
    int result = findMin(new int[]{ 12, 35, 7, 10, 34, 2 });
    System.out.println(result);
  }

  public static int findMin(int[] a) {
    int minValue = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] < minValue) {
        minValue = a[i];
      }
    }

    return minValue;
  }
}
```
