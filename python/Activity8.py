numbers = list(input("Enter numbersseparated by comma: ").split(", "))
firstnum = numbers[0]
lastnum = numbers[-1]

if (firstnum == lastnum):
    print(True)
else:
    print(False)