public class AverageList {
  public static void main(String[] args) {
    System.out.println(isArmStrong(370));
  }

  private static boolean isArmStrong(int n) {
    int temp = n;
    int rem = 0;
    int sum = 0;
    System.out.println(temp);

    while (n != 0) {
      rem = n % 10;
      sum += rem * rem * rem;
      n = n / 10;
    }

    return sum == temp;
  }
}
