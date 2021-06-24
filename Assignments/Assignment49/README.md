# Assignment49

An array is defined to be odd­valent if it meets the following two conditions:

* it contains a value that occurs more than once
* it contains an odd number

# Examples

* `{9, 3, 4, 9, 1}` is odd­valent because `9` appears more than once and 3 is odd
* other odd­ valent arrays are `{3, 3, 3, 3}` and `{8, 8, 8, 4, 4, 7, 2}`

The following arrays are not odd­valent:

* `{1, 2, 3, 4, 5}` ­ no value appears more than once
* `{2, 2, 2, 4, 4}` ­ there are duplicate values but there is no odd value

Write a function name `isOddValent` that:

* returns `1` if its array argument is odd­valent
* otherwise it returns `0`

The function prototype is `int isOddValent (int[] a)`

### Solution

```java
public class Assignment49 {
  public static void main(String[] args) {
    int result = isOddValent(new int[]{9, 3, 4, 9, 1});
    System.out.println(result);

    result = isOddValent(new int[]{3, 3, 3, 3});
    System.out.println(result);

    result = isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2});
    System.out.println(result);

    result = isOddValent(new int[]{1, 2, 3, 4, 5});
    System.out.println(result);

    result = isOddValent(new int[]{2, 2, 2, 4, 4});
    System.out.println(result);
  }

  static int isOddValent(int[] a) {
    boolean occurrence = false;
    boolean odd = false;
    
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        odd = true;
      }

      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          occurrence = true;
          break;
        }
      }

      if (odd && occurrence)
        return 1;
    }

    return 0;
  }
}
```
