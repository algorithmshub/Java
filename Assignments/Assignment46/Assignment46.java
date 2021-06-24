import java.util.Arrays;

public class Assignment46 {
  public static void main(String[] args) {
    int[] result = computeHMS(3735);
    System.out.println(Arrays.toString(result));

    result = computeHMS(380);
    System.out.println(Arrays.toString(result));

    result = computeHMS(3650);
    System.out.println(Arrays.toString(result));

    result = computeHMS(55);
    System.out.println(Arrays.toString(result));

    result = computeHMS(0);
    System.out.println(Arrays.toString(result));
  }

  static int[] computeHMS(int seconds) {
    int[] hms = new int[3];

    int hour = 0;
    int minute = 0;
    int second = 0;

    hour = seconds / 3600;
    seconds %= 3600;
    hms[0] = hour;

    minute = seconds / 60;
    seconds %= 60;
    hms[1] = minute;

    second = seconds;
    hms[2] = second;

    return hms;
  }
}
