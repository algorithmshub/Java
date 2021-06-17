# Armstrong

**What is Armstrong?**

An armstrong number is a number which equal to the sum of the cubes of its individual digits.

**Explanation**

`370` is an Armstrong number because `3*3*3 + 7*7*7 + 0*0*0 = 370`.

**Example**

Write a function to checks whether a given number is an armstrong number or not.

**Java**

```js
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
```
