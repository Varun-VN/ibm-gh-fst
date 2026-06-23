print("Choices: rock, paper, scissors\n")

player1 = input("Player 1, enter your choice: ").lower()
player2 = input("Player 2, enter your choice: ").lower()

choices = ["rock", "paper", "scissors"]

if player1 not in choices or player2 not in choices:
    print("Invalid choice! Please choose rock, paper, or scissors.")
else:
    if player1 == player2:
        print("It's a tie!")
    elif (
        (player1 == "rock" and player2 == "scissors") or
        (player1 == "paper" and player2 == "rock") or
        (player1 == "scissors" and player2 == "paper")
    ):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")