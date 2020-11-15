# AllCharactersSame.java

Write a function to check if all the characters of a string are same.

### Solution

```java
public class AllCharactersSame {

  /** Driver Code */
  public static void main(String[] args) {
    System.out.println(isAllCharactersSame(""));
    System.out.println(!isAllCharactersSame("aab"));
    System.out.println(isAllCharactersSame("bbb"));
    System.out.println(isAllCharactersSame("111"));
  }

  /**
   * check if all the characters of a string are same
   *
   * @param str the string to check
   * @return true if all characters of a string are same, otherwise false
   */
  public static boolean isAllCharactersSame(String str) {
    for (int i = 1, length = str.length(); i < length; ++i) {
      if (str.charAt(i) != str.charAt(0)) {
        return false;
      }
    }

    return true;
  }
}
```
