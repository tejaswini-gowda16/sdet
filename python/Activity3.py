player1 = input("Enter your choice - ROCK/PAPER/SCISSORS: ").upper()
player2 = input("Enter your choice - ROCK/PAPER/SCISSORS: ").upper()

if player1 == player2:
    print ("It's a tie, both player chose the same option!")
elif(player1=='ROCK'):
    if(player2=='PAPER'):
        print ("Player2 wins! PAPER covers ROCK!")
    elif(player2=='SCISSORS'):
        print ("Player1 wins! ROCK crushes SCISSORS!")
    else:
        print("Invalid input! Enter only ROCK/PAPER/SCISSORS. Try again.")
elif(player1=='PAPER'):
    if(player2=='SCISSORS'):
        print ("Player2 wins! SCISSORS cut PAPER!")
    elif(player2=='ROCK'):
        print ("Player1 wins! PAPER covers ROCK!")
    else:
        print("Invalid input! Enter only ROCK/PAPER/SCISSORS. Try again.")
elif(player1=='SCISSORS'):
    if(player2=='ROCK'):
        print ("Player2 wins! ROCK crushes SCISSORS!")
    elif(player2=='PAPER'):
        print ("Player1 wins! SCISSORS cut PAPER!")
    else:
        print("Invalid input! Enter only ROCK/PAPER/SCISSORS. Try again.")
else:	
    print("Invalid input! Enter only ROCK/PAPER/SCISSORS. Try again.")