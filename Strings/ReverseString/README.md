# ReverseString.java

Write a function to reverse string.

### Solution

```java
/**
 * Expected
 *
 * reverse("abc123") equals to "321cba"
 * reverse("321cba") equals to "abc123"
 */
public class ReverseString {

  /** Driver Code */
  public static void main(String[] args) {
    System.out.println(reverse("abc123").equals("321cba"));
    System.out.println(reverse("321cba").equals("abc123"));
  }

  /**
   * reverses the string
   *
   * @param str string to be reversed
   * @return reversed string
   */
  public static String reverse(String str) {
    if (str == null || str.isEmpty()) {
      return str;
    }

    char[] reverseStr = str.toCharArray();

    for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
      char temp = reverseStr[i];
      reverseStr[i] = reverseStr[j];
      reverseStr[j] = temp;
    }

    return new String(reverseStr);
  }
}
```
