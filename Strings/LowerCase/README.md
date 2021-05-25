# LowerCase

**Example**

Write a function to convert the characters of the string into lower case.

**Expected**

* `toLowerCase("ABC")` equals to `"ABC".toLowerCase()`
* `toLowerCase("ABC123")` equals to `"ABC123".toLowerCase()`
* `toLowerCase("abcABC")` equals to `"abcABC".toLowerCase()`
* `toLowerCase("abc123ABC")` equals to `"abc123ABC".toLowerCase()`

**Java**

```js
public class LowerCase {
  public static void main(String[] args) {
    System.out.println(toLowerCase("ABC").equals("ABC".toLowerCase()));
    System.out.println(toLowerCase("ABC123").equals("ABC123".toLowerCase()));
    System.out.println(toLowerCase("abcABC").equals("abcABC".toLowerCase()));
    System.out.println(toLowerCase("abc123ABC").equals("abc123ABC".toLowerCase()));
  }

  public static String toLowerCase(String str) {
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; ++i) {
      if (Character.isLetter(chars[i]) && Character.isUpperCase(chars[i])) {
        chars[i] = Character.toLowerCase(chars[i]);
      }
    }

    return new String(chars);
  }
}
```
