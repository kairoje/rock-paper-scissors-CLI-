package Rock_Paper_Scissors;

public class Computer extends Player{


    @Override
    String choose() {

        int randomChoice = (int) ((Math.random() * options.length));
        System.out.println("Computer chose: " + options[randomChoice]);

        return options[randomChoice];
    }

    @Override
    String isWinner() {
        points++;
        return "Computer Wins!";
    }

}
