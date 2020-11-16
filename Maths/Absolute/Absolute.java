/**
 * What is Absolute Value?
 *
 * The absolute value is the non-negative value.
 */
public class Absolute {

  /** Driver Code */
  public static void main(String[] args) {
    System.out.println(absVal(-0) == Math.abs(0));
    System.out.println(absVal(1) == Math.abs(1));
    System.out.println(absVal(-2) == Math.abs(2));
  }

  /**
   * if value is less than zero, make value positive
   *
   * @param value a number
   * @return the absolute value of a number
   */
  public static int absVal(int value) {
    return value < 0 ? -value : value;
  }
}
