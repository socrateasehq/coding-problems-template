# Problem 1

## Problem Statement

Given a linked list of `N` nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

### Input

The first line of each test case contains number of elements in a linked list. Then in second line it shows space separated nodes of linked list and third line shows the index in the linked list to which last node is connected.

**Note**: Third line will be used only for test cases. It should be passed as an argument in the function.

### Output

The output for each test case will be Boolean value [1 or 0].

### Example 1

**Input**

4

2 5 -4 3

1

**Output:**
1

**Explanation:**
Here, the last node 3 points to a node with index number 1 which creates a cycle.

### Example 2

**Input**

2

1 2

0

**Output:**
1

**Explanation:** Here, the last node 2 points to a node with index number 0 which creates a cycle again.

### Example 3

**Input**

2

5

-1

**Output:**
0

**Explanation:** Here, the last Node 5 points to a node with index number -1 which doesn't exist so it doesn't create a cycle.

### User Task

The task is to complete the function **detectLoop**() which should return if linked list is forming any loop or not internally. Please note that you just have to pass the linked list containing N heads and function should return `1` or `0`.
