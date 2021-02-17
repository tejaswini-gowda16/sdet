fruitsdict = {
    "apple": 10,
    "grape": 15,
    "orange": 20,
    "melon": 25
}

fruits = input("Which fruit are you looking for? ")

fruit = fruits.lower()

if(fruit in fruitsdict):
    print(fruits + " is available")
else:
    print(fruits + " is not available")