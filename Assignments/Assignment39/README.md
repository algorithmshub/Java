# Assignment39

Given an array of integers.

Our task is to write a program that efficiently finds the second largest element present in the array.

### Examples

* Input: `arr[] = {12, 35, 1, 10, 34, 1}` Output: The second largest element is `34`
* Input: `arr[] = {10, 5, 10}` Output: The second largest element is `5`
* Input: `arr[] = {10, 10, 10}` Output: The second largest does not exist

The function prototype is `int secondLargest(int[] a)`

### Solution

```java
public class Assignment39 {
  public static void main(String[] args) {
    int result = secondLargest(new int[]{12, 35, 1, 10, 34, 1});
    System.out.println(result);
  }

  static int secondLargest(int[] a) {
    int max = -1;
    int secondMax = -1;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        secondMax = max;
        max = a[i];
      }

      if (a[i] > secondMax && a[i] != max)
        secondMax = a[i]; 
    }

    return secondMax;
  }
}
```
