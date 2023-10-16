# Rock Paper Scissors Java Project

## Technologies Used:

Java

## User Stories:

- As a user I should be able to choose between 1 player and 2 players.
- As a user I should be able to type in my name at the start of the game and my name remains for the entirety of the game(s).
- As a user if I play against another human player, I should be able to enter my option as well as my competitor.
- As a user if I play against a computer player, I should be able to enter my option as well as get an option from the computer player.
- As a user, I should be able to see a winner be declared after each round of the game.

## Foundational Notes:

![IMG_4176.png](IMG_4176.png)

## Planning & Execution: 

I started this projects by writing notes on what ideas I had for the classes and methods needed. I started with an abstract player class, and created two extended classes: one for human players and one for computer players.

I then created the game logic for playing against a computer and then the logic for playing against another human. From there I created the classes that handled the main menu, and a class to handle the continuation of rounds.

I attempted several ways of implementing a history log of the games played, and that was my biggest struggle for this project. I tried with buffered and file writers, but had trouble connecting the classes in order to have the console's output be "copied" & "pasted" to a separate file.

I decided to them reformat my entire project to get a cleaner and more concise code. I was able to add the ability for users to enter a name.

## Sample Output

```
✌️✋👊MAIN MENU👊✋✌️
Type '1p' to play against computer or '2p' to play against a friend
1p
Enter player name: 
Kairo
Kairo enter one: [rock, paper, scissors]
rock
Computer chose: scissors
Kairo Wins!
Kairo now has 1 point(s)
Play another round? Type: 'yes' or 'no'
yes
Kairo enter one: [rock, paper, scissors]
scissors
Computer chose: rock
Computer Wins!
Computer now has 1 point(s)
Play another round? Type: 'yes' or 'no'
no
Thanks for playing!
```
