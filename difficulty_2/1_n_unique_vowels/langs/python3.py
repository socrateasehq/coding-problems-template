def n_unique_vowels(list_str, n):

    # Write the logic here
    # return an integer containing the number of strings which have n unique vowels
    num_strings = 0
    vowels = ['a', 'e', 'i', 'o', 'u']
    for string in list_str:
        vowel_count = 0
        seen_vowels = {}
        for char in string:
            if char in vowels and char not in seen_vowels:
                vowel_count += 1
                seen_vowels[char] = True

        if vowel_count == n:
            num_strings += 1

    return num_strings


# Compiler Boilerplate
inp_list_str = input().split(' ')
num = int(inp_list_str.pop())
print(n_unique_vowels(inp_list_str, num))
