# User Boilerplate
def main(str):
    
    # Write the logic here
    # return 0 or 1
    str_1, str_2 = str.split(' ')
    str_2_dict = {}
    for char in str_2:
        str_2_dict[char] = str_2_dict.get(char, 0) + 1

    for char in str_1:
        if char in str_2_dict:
            if str_2_dict[char] > 0:
                str_2_dict[char] -= 1
            else:
                return 0
        else:
            return 0
    return 1

# Compiler Boilerplate
inp_str = input()
print(main(inp_str))