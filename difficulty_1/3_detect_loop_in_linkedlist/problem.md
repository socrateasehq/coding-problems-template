# Stop Infinite Loop In a Linked List

You are given three classes `Class A, Class B & Class C`. Two classes can be linked by extending parent like `Class B extends Class A`, `Class C extends Class B`. If someone write `Class A extends Class C` and try to execute code then it will create a loop which a compiler should detect.

So, write a program to detect such loop if you are given a linked list containing N nodes having information about classes and connection between two nodes represents link between such classes which is creates using `extends` keyword.

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
