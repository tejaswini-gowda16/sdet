
def sum(numbers):
	res = 0
	for number in numbers:
		res += int (number)
	return res

input_num = list(input("Enter numbers you wish to add separated by comma: ").split(", "))

result = sum(input_num)

print("The sum of all the elements is: " + str(result))