# create empty lists
empty_1 = []
empty_2 = list()

# create a list with some items
fruits = ['apple', 'banana', 'orange']

#access by index (start at 1)
fruits[0]

# reassign value at index

fruits[1] = 'plum'
print(fruits)

# get the number of items
num_of_fruits = len(fruits)
print(num_of_fruits)

#remove last element
removed_fruit = fruits.pop()
print(f'I removed {removed_fruit}')

#add a fruit
fruits.append('pear')
print(fruits)