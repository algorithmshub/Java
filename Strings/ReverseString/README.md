# Reverse

**Example**

Write a function to reverse string.

**Expected**

* `reverse("abc123")` equals to `"321cba"`
* `reverse("321cba")` equals to `"abc123"`

**Java**

```js
public class Reverse {
  public static void main(String[] args) {
    System.out.println(reverse("abc123").equals("321cba"));
    System.out.println(reverse("321cba").equals("abc123"));
  }

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
