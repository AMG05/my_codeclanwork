# WRITE YOUR FUNCTIONS HERE
def get_pet_shop_name(pet_shop):
    name = pet_shop["name"]
    return name 

def get_total_cash(pet_shop):
    return pet_shop["admin"]["total_cash"]

def add_or_remove_cash(pet_shop, num):
    pet_shop["admin"]["total_cash"] += num

def add_or_remove_cash(pet_shop, num):
    pet_shop["admin"]["total_cash"] -= num

def get_pets_sold(pet_shop):
    return pet_shop["admin"]["pets_sold"]

def increase_pets_sold(pet_shop, num):
    pet_shop["admin"]["pets_sold"] += num

def get_stock_count(pet_shop):
    stock = 0
    for pet in pet_shop ["pets"]:
        stock += 1
    return stock

def get_pets_by_breed (pet_shop, breed_kind):
    total_breeds = []
    for pet in pet_shop["pets"]:
        if pet["breeds"] == breed_kind:
            total_breeds.append(breed_kind)
        return total_breeds

def find_pet_by_name (pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            return pet

def find_pet_by_name (pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            return pet
        else:
             return None

def remove_pet_by_name(pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
             return pet.remove(name)

def add_pet_to_stock(name):
    return["new_pet"+ name]
    

# def get_customer_cash(customer):
#     return customers['cash']
















