public class Assignment60 {
  public static void main(String[] args) {
    int result = isBunker(11);
    System.out.println(result);

    result = isBunker(22);
    System.out.println(result);

    result = isBunker(8);
    System.out.println(result);
  }

  static int isBunker(int n) {
    int prevElement = 1;
    int index = 0;
    int element = 0;

    while (element < n) {
      element = prevElement + index;
      prevElement = element;
      index++;
    }

    if (element == n) {
      return 1;
    }

    return 0;
  }
}
