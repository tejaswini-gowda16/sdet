username = input("Enter your name:")
age = input("Enter your age:")
year = ((100-int(age))+2021)
result = " will turn 100 in the year {}"
print(username + result.format(year))