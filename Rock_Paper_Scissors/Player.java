package Rock_Paper_Scissors;

public abstract class Player{
//player can be either human or computer
//player states: winner
    String[] options = {"rock", "paper", "scissors"};

    int points = 0;

    //player behavior: choose option
    abstract String choose();

    abstract String isWinner();
}
