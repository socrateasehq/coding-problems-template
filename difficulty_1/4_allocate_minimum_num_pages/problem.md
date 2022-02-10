# Problem 2

### Problem Statement

There are `n` different books and `m` students. Each book is arranged in an ascending order of its number of pages. Every student must read some consecutive set of books (at least 1 book per student). Let each such distribution of books amongst the students be denoted by a permutation `i`.

For each such permutation `i`, let `p_i` denote the maximum number of pages that a student has to read. The task is to identify the particular permutation that results in the smallest `p_i`. (Read Example 1 below to understand this better.)

### Input

The first line of each test case contains the number of books `n`. The second line shows an array of `n` space-separated integers, where `ith` integer represents the number of pages in the `ith` book. The third line shows the number of students `m`.

### Output

The output for each test case will return the minimum number of pages (an integer value). If a valid distribution of the books isn't possible, return `-1`.

### Example 1

**Input:**

4

12 34 67 90

2

**Output:**
113

**Explanation:**

There are 2 students. We list below all possible permutations of the distribution:

1. [12] and [34, 67, 90]

    Student 1 gets the book with 12 pages, and Student 2 gets the books with 34, 67 and 90 pages.

    Total number of pages for Student 1 = `12`. Total number of pages for Student 2 = 34 + 67 + 90 = `191`

    `p_1` = **max(12, 191)** = 191

2. [12, 34] and [67, 90]

    `p_2` = **max(46, 157)** = 157

3. [12, 34, 67] and [90]

    `p_3` = **max(113, 90)** = 113

Of `p_1`, `p_2` and `p_3`, as `p_3` is the smallest value, we return `p_3`, that is `113`.

### User Task

Your task is to complete the function **findMinimumPages()** which takes 2 Integers `n` and `m` and an array as input and returns the expected answer.
