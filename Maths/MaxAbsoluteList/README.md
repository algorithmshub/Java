# MaxAbsoluteList

**Example**

Find the maximum absolute value of an array.

**Expected**

* `findMaxAbsolute([0, -5, -1, 11]) === 11`
* `findMaxAbsolute([7 , -17, -9]) === -17`

**Java**

```js
public class MaxAbsoluteList {
  public static void main(String[] args) {
    System.out.println(findMaxAbsolute(new int[]{ 0, -5, -1, 11 }) == 11);
    System.out.println(findMaxAbsolute(new int[]{ 7 , -17, -9 }) == -17);
  }

  public static int findMaxAbsolute(int[] a) {
    int maxAbsValue = a[0];

    for (int i = 1, length = a.length; i < length; ++i) {
      if (absVal(a[i]) > absVal(maxAbsValue)) {
        maxAbsValue = a[i];
      }
    }

    return maxAbsValue;
  }

  public static int absVal(int value) {
    return value < 0 ? -value : value;
  }
}
```
