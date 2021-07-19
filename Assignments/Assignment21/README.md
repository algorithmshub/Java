# Assignment21

A twin prime is a prime number that differs from another prime number by `2`.

A Fine array is defined to be an array in which every prime in the array has its twin in the array.

So `{4, 7, 9, 6, 5}` is a Fine array because `7` and `5` occurs.

Note that `{4, 9, 6, 33}` is a Fine array since there are no primes.

On the other hand, `{3, 8, 15}` is not a Fine array since `3` appear in the array but its twin `5` is not in the array.

Write a function named `isFineArray` that:

* returns `1` if its array argument is a Fine array
* otherwise it returns `0`

The function signature is `int isFineArray (int[] a)`

You may assume that there exists a function isPrime that returns `1` if it argument is a prime, otherwise it returns `0`. You do not have to write this function.
