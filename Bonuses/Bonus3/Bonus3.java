public class Bonus3 {

  public static void main(String[] args) {
    System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 4));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 3));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 2));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 1));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 3));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 2));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 1));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 2, 2));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 2, 1));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 3, 1));
    System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 0));
    System.out.println(f(new char[]{'a', 'b', 'c'}, -1, 2));
    System.out.println(f(new char[]{'a', 'b', 'c'}, -1, -2));
  }

  public static char[] f(char[] a, int start, int length) {
    if (start < 0 || length < 0 || (start + length - 1 >= a.length)) {
      return null;
    }

    char[] chars = new char[length];

    for (int i = start, j = 0; i < length; i++, j++) {
      chars[j] = a[i];
    }

    return chars;
  }
}
