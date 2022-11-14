car = ('Ford', 'Escort', 1300, 'Red')


#define an empty tuple
empty_tuple = ()
empty_tuple_2 =tuple()

#access value by index
model = car[1]
colour = [car[-1]]
print(f'Model: {model} colour: {colour}')

#cant modify though!
car[1] = 'Focus'

#count tuple elements
count = len(car)
print(count)

fruits = ('apple', 'apple', 'banana')
print(fruits.count('banana'))
print(car.count(1300))

# tuple of a singe element
single_tuple = ('ben')
print(type(single_tuple))

# to find index of something, put in bracket the thing you want index of
index = my_task.index(False)
print(index)