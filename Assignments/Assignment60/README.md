# Assignment60

An integer is defined to be a Bunker number if it is an element in the infinite sequence `1, 2, 4, 7, 11, 16, 22, ...`. Note that `2­-1=1`, `4­-2=2`, `7-­4=3`, `11-­7=4`, `16-­11=5` so for `k>1`, the `kth` element of the sequence is equal to the `k-­1th` element + `k­-1`.

For example, for `k=6`, `16` is the `kth` element and is equal to `11` (the `k­-1th` element) + `5` `(k­-1)`.

Write function named `isBunker` that:

* returns `1` if its argument is a Bunker number
* otherwise it returns `0`

So:

* `isBunker(11)` returns `1`
* `isBunker(22)` returns `1`
* `isBunker(8)` returns `0`

The function signature is `int isBunker(int n)`

### Solution

```java
public class Assignment60 {
  public static void main(String[] args) {
    int result = isBunker(11);
    System.out.println(result);

    result = isBunker(22);
    System.out.println(result);

    result = isBunker(8);
    System.out.println(result);
  }

  static int isBunker(int n) {
    int prevElement = 1;
    int index = 0;
    int element = 0;

    while (element < n) {
      element = prevElement + index;
      prevElement = element;
      index++;
    }

    if (element == n) {
      return 1;
    }

    return 0;
  }
}
```
