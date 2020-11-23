/**
 * What is in a Pangram?
 *
 * A pangram or holoalphabetic sentence is a sentence 
 * using every letter of a given alphabet at least once.
 */
public class Pangram {

  public static void main(String[] args) {
    System.out.println(isPangram("abcdefghijklmnopqrstuvwxyz"));
    /* Not exists z character */
    System.out.println(isPangram("abcdefghijklmnopqrstuvwxy"));
  }

  /**
   * Check if a string is a pangram string or not
   *
   * @param str string to check
   * @return true if given string is pangram otherwise false
   */
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
