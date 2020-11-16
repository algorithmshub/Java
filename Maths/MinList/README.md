# MinList.java

Find the minimum number of an array.

### Flowchart

![MinList Flowchart](https://raw.githubusercontent.com/algorithmshub/Java/main/Maths/MinList/minlist-flowchart.png "MinList Flowchart")

### Solution

```java
public class MinList {

  /** Driver Code */
  public static void main(String[] args) {
    int result = findMin(new int[]{ 12, 35, 7, 10, 34, 2 });
    System.out.println(result);
  }

  /**
    * find the minimum number of an array of numbers
    *
    * @param a the array contains element
    * @return min value
    */
  public static int findMin(int[] a) {
    int minValue = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] < minValue) {
        minValue = a[i];
      }
    }

    return minValue;
  }
}
```
