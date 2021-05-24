# MaxList

**Example**

Find the maximum number of an array.

**Java**

```js
public class MaxList {
  public static void main(String[] args) {
    int result = findMax(new int[]{ 12, 35, 7, 10, 34, 2 });
    System.out.println(result);
  }

  public static int findMax(int[] a) {
    int maxValue = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] > maxValue) {
        maxValue = a[i];
      }
    }

    return maxValue;
  }
}
```
