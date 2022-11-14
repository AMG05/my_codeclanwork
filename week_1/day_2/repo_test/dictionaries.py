meals = ('yoghurt', 'roll', 'steak')
print(meals[0])

my_first_empty_dictionary ={}
my_second_empty_dictionary = dict()

meals ={"breakfast":"yogurt", "lunch":"roll", "dinner":"steak"}
print(meals)

things = {1 : "2", "steve": False}
print(things)

# print(meals["breakfast"])
# print(meals["dinner"])

print("breakfast" in meals)

#add an element
meals["supper"] = "pancakes"
print(meals)

#remove an element
del(meals["breakfast"])

print(meals.keys())
print(list(meals))
print(meals.values())

countries = {
    "uk": {"capital": "London","population": 1000},
    "germany":{"capital":"Berlin", "population": 5000}
}

print(countries["germany"]["population"])

avengers = {
    "Iron Man":{
        "name":"Tony Stark",
        "moves":{
            "punch":10,
            "kick":100
            }
    },
    "hulk":{
        "name":"Bruce Banner",
        "moves":{
            "smash":1000,
            "roll": 500
        }
    }}
 
print(avengers["hulk"]["moves"]["smash"])

