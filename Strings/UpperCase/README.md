# UpperCase.java

Given a string, write a function to convert the characters of the string into upper case.

### Solution

```java
/**
 * Expect
 *
 * toUpperCase("ABC") equals to "ABC".toUpperCase()
 * toUpperCase("ABC123") equals to "ABC123".toUpperCase()
 * toUpperCase("abcABC") equals to "abcABC".toUpperCase()
 * toUpperCase("abc123ABC") equals to "abc123ABC".toUpperCase()
 */
public class UpperCase {

  public static void main(String[] args) {
    System.out.println(toUpperCase("ABC").equals("ABC".toUpperCase()));
    System.out.println(toUpperCase("ABC123").equals("ABC123".toUpperCase()));
    System.out.println(toUpperCase("abcABC").equals("abcABC".toUpperCase()));
    System.out.println(toUpperCase("abc123ABC").equals("abc123ABC".toUpperCase()));
  }

  /**
   * Convert the characters of the string into upper case
   *
   * @param str the string to convert
   * @return the string converted to uppercase
   */
  public static String toUpperCase(String str) {
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; ++i) {
      if (Character.isLetter(chars[i]) && Character.isLowerCase(chars[i])) {
        chars[i] = Character.toUpperCase(chars[i]);
      }
    }

    return new String(chars);
  }
}
```
