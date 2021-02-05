numbers = list(input("Enter numbers you wish to add separated by comma: ").split(", "))
result = 0
for number in numbers:
  result += int(number)
print(result)