# Assignment25

Write a function named `largestAdjacentSum` that iterates through an array computing the sum of adjacent elements and returning the largest such sum.

You may assume that the array has at least `2` elements.

The function signature is `int largestAdjacentSum(int[] a)`

| if input parameters are | return |
|:-------------|:-------------|
| {1, 2, 3, 4} | 7 because 3 + 4 is larger than either 1 + 2 or 2 + 3 |
| {18, -12, 9, -10} | 6 because 18 - 12 is larger than -12 + 9 or 9 - 10 |
| {1,1,1,1,1,1,1,1,1} | 2 because all adjacent pairs sum to 2 |
| {1,1,1,1,1,2,1,1,1} | 3 because 1 + 2 or 2 + 1 is the max sum of adjacent pairs |

### Solution

```java
public class Assignment25 {
  public static void main(String[] args) {
    int result = largestAdjacentSum(new int[]{1, 2, 3, 4});
    System.out.println(result);

    result = largestAdjacentSum(new int[]{18, -12, 9, -10});
    System.out.println(result);

    result = largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1});
    System.out.println(result);

    result = largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1});
    System.out.println(result);
  }

  static int largestAdjacentSum(int[] a) {
    int sum = 0;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] + a[i + 1] > sum) {
        sum = a[i] + a[i + 1];
      }
    }

    return sum;
  }
}
```
