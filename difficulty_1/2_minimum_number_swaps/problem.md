# Ordering a List of Integers

### Problem Statement

`unique_ints` is an array of Integers. There are no repeating integers in `unique_ints`. A function `f(x,y)` acting on two elements in the list moves `x` to `y`'s position and `y` to `x`'s position. Let `N` be the least number of times you can call `f` so that the resulting array is in ascending order?

### Input

The input is a list of space-separated integers. There will be at least one integer in the input.

### Output

A single integer that corresponds to `N` as defined in the problem statement.

### Example 1

**Input:** 2 8 5 4

**Output:**
1

**Explanation:** Swap 8 with 4.

### Example 2

**Input:** 10 19 6 3 5

**Output:**
2

**Explanation:** Swap 10 with 3 and swap 19 with 5.

### User Task

The task is to complete the function **minSwaps()** which should return the least number of times you can call `f` so that the resulting array is in ascending order.

**Note**: The code has been set up so that you needn't worry about reading the input, converting it to an array, etc. You can directly start coding on Line 10.
