def fizzbuzz(num):
    divisible_by_3 = num % 3 == 0
    divisible_by_5 = num % 5 == 0

    if divisible_by_3 and divisible_by_5:
        return "FizzBuzz"

    elif divisible_by_3:
        return "Fizz"
    elif divisible_by_5:
        return "Buzz"
    else:
        return f"{num}"

    # if num % 3 == 0 and num % 5 == 0:
    #     return "FizzBuzz"
    # if num % 3 == 0:
    #     return "Fizz"
    # if num % 5 == 0:
    #     return "Buzz"
    # # else:
    # # if num % 5 != 0 and if num % 3 != 0:
    # return f"{num}" 
    