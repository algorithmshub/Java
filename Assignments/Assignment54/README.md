# Assignment56

An array is defined to be a Bean array if it meets the following conditions:

* if it contains a `9` then it also contains a `13`
* if it contains a `7` then it does not contain a `16`

So:

The following arrays are Bean arrays:

* `{1, 2, 3, 9, 6, 13}` and `{3, 4, 6, 7, 13, 15}`
* `{1, 2, 3, 4, 10, 11, 12`} and `{3, 6, 9, 5, 7, 13, 6, 17}`

The following arrays are not Bean arrays:

* `{ 9, 6, 18}` (contains a `9` but no `13`)
* `{4, 7, 16}` (contains both a `7` and a `16`)

Write a function named `isBean` that:

* returns `1` if its array argument is a Bean array
* otherwise it returns `0`

The function signature is `int isBean(int[] a)`

### Solution

```java
public class Assignment56 {
  public static void main(String[] args) {
    int result = isBean(new int[]{1, 2, 3, 9, 6, 13});
    System.out.println(result);

    result = isBean(new int[]{3, 4, 6, 7, 13, 15});
    System.out.println(result);

    result = isBean(new int[]{1, 2, 3, 4, 10, 11, 12});
    System.out.println(result);

    result = isBean(new int[]{3, 6, 9, 5, 7, 13, 6, 17});
    System.out.println(result);

    result = isBean(new int[]{9, 6, 18});
    System.out.println(result);

    result = isBean(new int[]{4, 7, 16});
    System.out.println(result);
  }

  static int isBean(int[] a) {
    boolean a9 = false;
    boolean a13 = false;
    boolean a7 = false;
    boolean a16 = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 9) {
        a9 = true;
      } else if (a[i] == 13) {
        a13 = true;
      } else if (a[i] == 7) {
        a7 = true;
      } else if (a[i] == 16) {
        a16 = true;
      }
    }

    if ((a9 && a13) || (a7 && !a16) || (!a9 && !a7)) {
      return 1;
    }

    return 0;
  }
}
```
