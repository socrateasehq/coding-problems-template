## Problem Statement

You are given a linked list of `N` nodes. The task is to check if the linked list has a loop.

### Input

The first line of each test case contains the number of elements in a linked list. The second line shows space-separated nodes of the linked list. The third line shows the index in the linked list to which the last node is connected.

**Note**: Third line will be used only for test cases. It should not be passed as an argument in the function.

### Output

The output for each test case should be a Boolean value [1 or 0].

### Example 1

**Input**

4

2 5 -4 3

1

**Output:**
1

**Explanation:**
Here, the last node (3) points to a node with index number 1 which creates a loop.

### Example 2

**Input**

2

1 2

0

**Output:**
1

**Explanation:** Here, the last node (2) points to a node with index number 0 which creates a loop.

### Example 3

**Input**

2

5

-1

**Output:**
0

**Explanation:** Here, the last node (5) points to a node with index number -1 which doesn't exist. So, it doesn't create a loop.

### User Task

The task is to complete the function **detectLoop**(). The function should return whether the linked list is forming any loop. If it is forming a loop, return `true` else return `false`.
