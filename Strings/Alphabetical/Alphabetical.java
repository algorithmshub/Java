class Alphabetical {
  public static void main(String[] args) {
    System.out.println(!isAlphabetical("123abc"));
    System.out.println(isAlphabetical("aBC"));
    System.out.println(isAlphabetical("abc"));
    System.out.println(!isAlphabetical("xyzabc"));
    System.out.println(isAlphabetical("abcxyz"));
  }

  public static boolean isAlphabetical(String s) {
    s = s.toLowerCase();

    for (int i = 0; i < s.length() - 1; ++i) {
      if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
        return false;
      }
    }

    return true;
  }
}