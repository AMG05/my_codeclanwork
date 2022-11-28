from models.pizza import Pizza

pizza_1 = Pizza(10, 'pepperoni', False, 'L')
pizza_2 = Pizza(12, 'seafood', True, 'L')
pizza_3 = Pizza(8, 'cheese', False, 'S')

pizzas=[pizza_1, pizza_2, pizza_3]

def get_order(order_index):
    return pizzas[order_index]

def add_order(order):
    pizzas.append(order)

