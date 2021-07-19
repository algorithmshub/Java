# Assignment46

Write a method named computeHMS that computes the number of hours, minutes and seconds in a given number of seconds.

The method signature is `int[] computeHMS(int seconds)`

The returned array has 3 elements:

* `arr[0]` is the hours
* `arr[1]` is the minutes
* `arr[2]` is the seconds contained within the seconds argument

Recall that there are `3600` seconds in an hour and `60` seconds in a minute.

You may assume that the numbers of seconds is non-negative.

| if seconds is | return | reason |
|:-------------|:-------------|:-------------|
| 3735 | {1, 2, 15} | because 3735 = 1*3600 + 2*60 + 15. In other words, 3,735 is the number of seconds in 1 hour 2 minutes and 15 seconds |
| 380 | {0, 6, 20} | because 380 = 0*3600 + 6*60 + 20 |
| 3650 | {1, 0, 50} | because 3650 = 1*3600 + 0*60 + 50 |
| 55 | {0, 0, 55} | because 55 = 0*3600 + 0*60 + 55 |
| 0 | {0, 0, 0} | because 0 = 0*3600 + 0*60 + 0 |

### Solution

```java
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
```
