# Assignment69

Define an array to be one-balanced if begins with zero or more 1s followed by zero or more non-1s and concludes with zero or more 1s.

Write a function named `isOneBalanced` that:

* returns `1` if its array argument is one-balanced
* otherwise it returns `0`

The function signature is `int isOneBalanced(int[] a)`

| a is | the function return | reason |
|:-------------|:-------------|:-------------|
| {1, 1, 1, 2, 3, -18, 45, 1} | 1 | because it begins with three 1s, followed by four non-1s and ends with one 1 and 3+1 == 4 |
| {1, 1, 1, 2, 3, -18, 45, 1, 0} | 0 | because the 0 starts another sequence of non-1s. There can be only one sequence of non-1s. |
| {1, 1, 2, 3, 1, -18, 26, 1} | 0 | because there are two sequences of non-1s ({2, 3} and {-18, 26} |
| {} | 1 | because 0 (# of beginning 1s) + 0 (# of ending 1s) = 0 (# of non-1s) |
| {3, 4, 1, 1} | 1 | because 0 (# of beginning 1s) + 2 (# of ending 1s) = 2 (# of non-1s) |
| {1, 1, 3, 4} | 1 | because 2 (# of beginning 1s) + 0 (# of ending 1s) = 2 (# of non-1s) |
| {3, 3, 3, 3, 3, 3} | 0 | because 0 (# of beginning 1s) + 0 (# of ending 1s) != 6 (# of non-1s) |
| {1, 1, 1, 1, 1, 1} | 0 | because 6 (# of beginning 1s) + 0 (# of ending 1s) != 0 (# of non-1s) |

### Solution

```java
public class Assignment69 {
  public static void main(String[] args) {
    int result = isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1});
    System.out.println(result);

    result = isOneBalanced(new int[]{});
    System.out.println(result);

    result = isOneBalanced(new int[]{3, 4, 1, 1});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 3, 4});
    System.out.println(result);

    result = isOneBalanced(new int[]{3, 3, 3, 3, 3, 3});
    System.out.println(result);

    result = isOneBalanced(new int[]{1, 1, 1, 1, 1, 1});
    System.out.println(result);
  }

  static int isOneBalanced(int[] a) {
    if (a.length == 0) {
      return 1;
    }

    int total1s = 0;
    int totalNon1s = 0;
    boolean non1Start = false;
    boolean non1End = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        if (non1Start) {
          non1End = true;
        }
        
        total1s++;
      } else {
        if (non1End) {
          return 0;
        }

        non1Start = true;
        totalNon1s++;
      }
    }

    if (total1s != totalNon1s) {
      return 0;
    }

    return 1;
  }
}
```
