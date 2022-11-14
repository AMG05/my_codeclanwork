# SET is_it_raining = INPUT " Is it raining?"
# IF is_it_raining is "yes"
#   THEN PRINT "You should take the car"
# ELSE 
#   IF distance < 5
#       THEN PRINT "You should walk"
#   ELSE
#       THEN PRINT "You should get the bus"
# END  
 
distance = 6
is_it_raining = input("Is it raining?")

if is_it_raining == "yes":
    print("You should take the car")
elif distance < 5:
    print ("You should walk")
else: 
    print("You should get the bus")


