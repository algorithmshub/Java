# Assignment52

A balanced array is defined to be an array where for every value `n` in the array, `n` also is in the array.

### Examples

* `{­-2, 3, 2, -­3}` is a balanced array
* `{­-2, 2, 2, 2}` is a balanced array
* `{-­5, 2, -2}` is not because `5` is not in the array

Write a function named `isBalanced` that:

* returns `1` if its array argument is a balanced array
* otherwise it returns `0`

The function signature is `int isBalanced (int[] a)`

### Solution

```java
public class Assignment52 {
  public static void main(String[] args) {
    int result = isBalanced(new int[]{-2, 3, 2, -3});
    System.out.println(result);

    result = isBalanced(new int[]{-2, 2, 2, 2});
    System.out.println(result);

    result = isBalanced(new int[]{-5, 2, -2});
    System.out.println(result);
  }

  static int isBalanced(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isBalanced = false;

      for (int j = 0; j < a.length; j++) {
        if (a[i] == -a[j]) {
          isBalanced = true;
          break;
        }
      }

      if(!isBalanced) {
        return 0;
      }
    }

    return 1;
  }  
}
```
