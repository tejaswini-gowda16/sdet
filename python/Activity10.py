numbers = tuple(input("Enter numbersseparated by comma: ").split(", "))
print("Input numbers are: ", numbers)

print ("Of which numbers that are divisible by 5 are: ")
for n in numbers:
    x = int(n)
    if (x % 5 == 0):
        print(n)
