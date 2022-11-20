
# numbers = range[1, 11]
# print(numbers)

# evens_squared = []

# for number in numbers:
#     if number % 2 == 0:
#         evens_squared.append(number * number)

# print(evens_squared)

# evens_squared = [expression for item in list if condition]

numbers = range[1, 11]
evens_squared = [number * number for number in numbers if number % 2 == 0]

# numner * number is what we are doing on each itteration, number is the name of the itteration and the last bit is the condition on which the first bit is dependant. if this doesnt work the first part doesnt work
print(evens_squared)