ages = [5, 15, 64, 27, 84, 26]
odd_numbers = [number for number in ages if number % 2 != 0]
print(odd_numbers)

chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"]
chicken_name = [name for name in chicken_names if len(name) >= 10]
print(chicken_name)

chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"]
chicken_name = [name for name in chicken_names if name[0].startswith("H") ]
print(chicken_name)

words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]
lower_letters = [letter[0].lower() for letter in words]
print(lower_letters)