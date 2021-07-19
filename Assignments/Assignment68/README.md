# Assignment70

An array is defined to be odd-heavy if it contains at least one odd element and every odd element is greater than every even element.

So `{11, 4, 9, 2, 8}` is odd-heavy because the two odd elements (`11` and `9`) are greater than all the even elements.

And `{11, 4, 9, 2, 3, 10}` is not odd-heavy because the even element `10` is greater than the odd element `9`.

Write a function called `isOddHeavy` that:

* accepts an integer array
* returns `1` if the array is odd-heavy
* otherwise it returns `0`

### Examples

* `{1}` is odd-heavy
* `{2}` is not odd-heavy
* `{1, 1, 1, 1}` is odd-heavy
* `{2, 4, 6, 8, 11}` is odd-heavy
* `{-2, -4, -6, -8, -11}` is not odd-heavy

The function signature is `int isOddHeavy(int[] a)`

### Solution

```java
public class Assignment70 {
  public static void main(String[] args) {
    int result = isOddHeavy(new int[]{11, 4, 9, 2, 8});
    System.out.println(result);

    result = isOddHeavy(new int[]{11, 4, 9, 2, 3, 10});
    System.out.println(result);

    result = isOddHeavy(new int[]{1});
    System.out.println(result);

    result = isOddHeavy(new int[]{2});
    System.out.println(result);

    result = isOddHeavy(new int[]{1, 1, 1, 1, 1, 1});
    System.out.println(result);

    result = isOddHeavy(new int[]{2, 4, 6, 8, 11});
    System.out.println(result);

    result = isOddHeavy(new int[]{-2, -4, -6, -8, -11});
    System.out.println(result);
  }

  static int isOddHeavy(int[] a) {
    boolean isOddHeavy = false;

    int smallestOdd = Integer.MAX_VALUE;
    int largestEven = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        isOddHeavy = true;

        if (a[i] < smallestOdd) {
          smallestOdd = a[i];
        }
      } else {
        if (a[i] > largestEvent) {
          largestEvent = a[i];
        }
      }
    }

    if (isOddHeavy && smallestOdd > largestEvent) {
      return 1;
    }

    return 0;
  }
}
```
