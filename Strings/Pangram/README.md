# Pangram

**What is Pangram?**

Pangram is a sentence  using every letter of a given alphabet at least once.

**Example**

Write a function to check if a string is a pangram string or not.

**Java**

```js
public class Pangram {
  public static void main(String[] args) {
    System.out.println(isPangram("abcdefghijklmnopqrstuvwxyz"));
    /* Not exists z character */
    System.out.println(isPangram("abcdefghijklmnopqrstuvwxy"));
  }

  public static boolean isPangram(String str) {
    /* All letters don't exists by default */
    boolean[] marked = new boolean[26];
    char[] values = str.toCharArray();

    for (char value : values) {
      if (Character.isLetter(value)) {
        int index = Character.isUpperCase(value) ? value - 'A' : value - 'a';
        /* Mark current character exists */
        marked[index] = true;
      }
    }

    for (boolean b : marked) {
      if (!b) {
        return false;
      }
    }

    return true;
  }
}
```
