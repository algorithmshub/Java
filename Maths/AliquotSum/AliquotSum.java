/**
 * What is Aliquot sum?
 * 
 * In number theory, the aliquot sum s(n) of a positive integer n 
 * is the sum of all proper divisors of n, that is, 
 * all divisors of n other than n itself.
 *
 * Examples
 *
 * Input : 12
 * Output : 16
 * Explanation :
 *  Proper divisors of 12 is 1, 2, 3, 4, 6 
 *  and sum is 1 + 2 + 3 + 4 + 6 = 16
 */
public class AliquotSum {

  public static void main(String[] args) {
    System.out.println(aliquotSum1(12) == 16);
    System.out.println(aliquotSum1(15) == 9);

    System.out.println(aliquotSum2(12) == 16);
    System.out.println(aliquotSum2(15) == 9);
  }

  /**
   * Find the aliquot sum of an integer number
   *
   * @param n a positive integer
   * @return aliquot sum of given {@code n}
   */
  public static int aliquotSum1(int n) {
    int sum = 0; 

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    return sum;
  }

  /**
   * Find the aliquot sum of an integer number
   *
   * @param n a positive integer
   * @return aliquot sum of given {@code n}
   */
  public static int aliquotSum2(int n) {
    int sum = 0;

    for (int i = 1, limit = n / 2; i <= limit; ++i) {
      if (n % i == 0) {
        sum += i;
      }
    }

    return sum;
  }
}
