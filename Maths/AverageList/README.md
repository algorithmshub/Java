# AverageList

**What is Average?**

Average is the sum of the numbers divided by how many numbers are being averaged.

**Example**

Write a function to calculate average of a list of numbers.

**Java**

```js
public class AverageList {
  public static void main(String[] args) {
    System.out.println(average(new int[] {2, 4, 10}) == 5);
  }

  public static int average(int[] a) {
    long sum = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    return (int) (sum / a.length);
  }
}
```
