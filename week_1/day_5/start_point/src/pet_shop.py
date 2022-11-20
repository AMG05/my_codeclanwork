# WRITE YOUR FUNCTIONS HERE
def get_pet_shop_name(pet_shop):
    name = pet_shop["name"]
     

def get_total_cash(pet_shop):
    return pet_shop["admin"]["total_cash"]

def add_or_remove_cash(pet_shop, num):
    pet_shop["admin"]["total_cash"] += num

def add_or_remove_cash(pet_shop, num):
    pet_shop["admin"]["total_cash"] += num

def get_pets_sold(pet_shop):
    return pet_shop["admin"]["pets_sold"]

def increase_pets_sold(pet_shop, num):
    pet_shop["admin"]["pets_sold"] += num

def get_stock_count(pet_shop):
   return len(pet_shop["pets"])

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
    pet_to_delete = find_pet_by_name(pet_shop, name)
    pet_shop["pets"].remove(pet_to_delete)

def add_pet_to_stock(name):
    return["pets"].append(name)

def add_pet_to_customer(customer, pet);
    customer["pets"].append(pet)


    
def customer_can_afford_pet(customer, pet):
    return customer["cash"] >= pet["price"]

def sell_pet_to_customer(pet_shop, pet, customer):
    if pet and customer_can_afford_pet(customer, pet):




# def get_customer_cash(customer):
#     return customers['cash']
















