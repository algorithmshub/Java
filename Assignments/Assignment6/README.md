# Assignment6

A non-empty array **a** of length **n** is called an array of all possiblities if **it contains all numbers between 0 and (a.length - 1)** inclusive.

Write a method that:

* accepts an integer array
* returns 1 if the array is an array of all possiblities
* otherwise it returns 0

The function signature is `int isAllPossibilities(int[] a)`

| If the input array is | return |
|:-------------|:-------------|
| {1, 2, 0, 3} | 1 |
| {3, 2, 1, 0} | 1 |
| {1, 2, 4, 3} | 0 (because 0 not included and 4 is too big) |
| {0, 2, 3} | 0 (because 1 is not included) |
| {0} | 1 |
| {} | 0 |

### Solution

```java
public class isAllPossibilities {
  public static void main(String[] args) {
    int result = isAllPossibilities(new int[]{1, 2, 0, 3});
    System.out.println(result);

    result = isAllPossibilities(new int[]{3, 2, 1, 0});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{1, 2, 4, 3});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{0, 2, 3});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{0});
    System.out.println(result);
    
    result = isAllPossibilities(new int[]{});
    System.out.println(result);
  }

  static int isAllPossibilities(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean f = false;
      for (int j = 0; j < a.length; j++) {
        if (i == a[j]) f = true;
      }
      if (!f) return 0;
    }
    return 1;
  }
}
```
