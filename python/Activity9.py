list1 = [2, 4, 5, 7, 9]
list2 = [3, 5, 6, 9, 3]
	
print("First List ", list1)
print("Second List ", list2)

newList = []

for x in list1:
    if (x%2 != 0):
        newList.append(x)
for x in list2:
    if (x%2 == 0):
        newList.append(x)

print("Resulting list:")
print(newList)
