## Problem Statement

Given two strings, `str_1` and `str_2`, determine if you can construct `str_1` using only characters that are present in `str_2`. Each character from `str_2` can be used only once.

### Input

The input to your function is a single string formed by concatenating `str_1` with `str_2`, with a space in between.

-   Both strings have at least 1 character
-   Neither string contains a space character

### Output

If `str_1` can be constructed from `str_2`, return `"1"`, else return `"0"`

-   Remember that the output is a **string**, not an integer.

## Test Cases

| Input (string) | Expected Output (string) |
| -------------- | ------------------------ |
| aaa abcd       | 0                        |
| bc aebhfc      | 1                        |
| awd acdw       | 1                        |
