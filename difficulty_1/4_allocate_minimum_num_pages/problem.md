# Problem 2

### Problem Statement

Given number of pages in `n` different books and `m` students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

### Input

The first line of each test case contains number of books `n`. Then in second line it shows array of `n` books where `ith` index represents number of pages in a book. The third line shows number of students `m`.

### Output

The output for each test case will return minimum number of pages (an integer value).

### Example 1

**Input:**

4

12 34 67 90

2

**Output:**
113

**Explanation:**

There are 2 number of students. Books can be distributed
in following fashion :

1. [12] and [34, 67, 90]
   Max number of pages is allocated to student
   2 with 34 + 67 + 90 = 191 pages
2. [12, 34] and [67, 90]
   Max number of pages is allocated to student
   2 with 67 + 90 = 157 pages
3. [12, 34, 67] and [90]
   Max number of pages is allocated to student
   1 with 12 + 34 + 67 = 113 pages

Of the 3 cases, Option 3 has the minimum pages = 113.

### User Task

Your task is to complete the function **findMinimumPages()** which takes 2 Integers n, and m and an array as input and returns the expected answer.
