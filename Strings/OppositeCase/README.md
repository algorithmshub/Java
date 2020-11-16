# OppositeCase.java

Given a string, write a function to convert the characters of the string into opposite case.

### Solution

```java
/**
 * Expect
 *
 * toOppositeCase("algoRithmsHub") equals to "ALGOrITHMShUB"
 * toOppositeCase("hello every one") equals to "HELLO EVERY ONE"
 */
public class OppositeCase {

  public static void main(String[] args) {
    System.out.println(toOppositeCase("algoRithmsHub").equals("ALGOrITHMShUB"));
    System.out.println(toOppositeCase("hello every one").equals("HELLO EVERY ONE"));
  }

  /**
   * Convert the characters of the string into opposite case
   *
   * @param str the string to convert
   * @return the string converted to oppositecase
   */
  public static String toOppositeCase(String str) {
    char[] chars = str.toCharArray();
    StringBuffer strBuffer = new StringBuffer(str);

    for (int i = 0; i < chars.length; ++i) {
      if (Character.isLowerCase(chars[i])) {
        strBuffer.replace(i, i + 1, Character.toUpperCase(chars[i]) + "");
      } else {
        strBuffer.replace(i, i + 1, Character.toLowerCase(chars[i]) + "");
      }
    }

    return new String(strBuffer);
  }
}
```
