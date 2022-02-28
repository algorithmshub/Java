# MEX

Given a set of n integers, perform minimum number of operations (you can insert/delete elements into/from the set) to make the MEX of the set equal to x (that is given). 
Note:- The MEX of a set of integers is the minimum non-negative integer that doesn’t exist in it. For example, the MEX of the set {0, 2, 4} is 1 and the MEX of the set {1, 2, 3} is 0. 
Examples : 

```
Input : n = 5, x = 3
        0 4 5 6 7
Output : 2
The MEX of the set {0, 4, 5, 6, 7} is 1 which is 
not equal to 3. So, we should add 1 and 2 to the
set. After adding 1 and 2, the set becomes 
{0, 1, 2, 4, 5, 6, 7} and 3 is the minimum
non-negative integer that doesn't exist in it.
So, the MEX of this set is 3 which is equal to
x i.e. 3. So, the output of this example is 2 
as we inserted 1 and 2 in the set.

Input : n = 1, x = 0
        1
Output : 0
In this example, the MEX of the given set {1}
is already 0. So, we do not need to perform 
any operation. So, the output is 0.
```

```
Approach: 
The approach is to see that in the final set all the elements less than x should exist, x shouldn’t exist and any element greater than x doesn’t matter. So, we will count the number of elements less than x that don’t exist in the initial set and add this to the answer. If x exists we will add 1 to the answer because x should be removed.
Below is the implementation of above approach:
```

<!-- https://leetcode.com/discuss/interview-question/1799446/Mercari-Inc-Software-Engineer-(New-Graduate-Position)-Hiring-Test-2022 -->

<!-- https://leetcode.com/discuss/interview-question/514021/Mercari-or-OA-2020-or-New-Grad -->
