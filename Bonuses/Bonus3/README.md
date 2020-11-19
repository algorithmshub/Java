# Bonus3.java

Write a function that:
* accepts a character array, a zero-based start position, and a length
* it should return a character array containing length characters starting with the start character of the input array
* the function should do error checking on the start position and the length and return null if the either value is not legal

The function signature is `char[] f(char[] a, int start, int len)`

| Input params | Return |
|:-------------|:-------------|
| {'a', 'b', 'c'}, 0, 4 | null |
| {'a', 'b', 'c'}, 0, 3 | {'a', 'b', 'c'} |
| {'a', 'b', 'c'}, 0, 2 | {'a', 'b'} |
| {'a', 'b', 'c'}, 0, 1 | {'a'} |
| {'a', 'b', 'c'}, 1, 3 | null |
| {'a', 'b', 'c'}, 1, 2 | {'b', 'c'} |
| {'a', 'b', 'c'}, 1, 1 | {'b'} |
| {'a', 'b', 'c'}, 2, 2 | null |
| {'a', 'b', 'c'}, 2, 1 | {'c'} |
| {'a', 'b', 'c'}, 3, 1 | null |
| {'a', 'b', 'c'}, 1, 0 | {} |
| {'a', 'b', 'c'}, -1, 2 | null |
| {'a', 'b', 'c'}, -1, -2 | null |
| {}, 0, 1 | null |

### Solution

```java

```
