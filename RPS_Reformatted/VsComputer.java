package RPS_Reformatted;

import java.util.Objects;
import java.util.Scanner;

public class VsComputer {

    /**
     * Instance of the Human class objects created
     * @parameter
     * @returns human player
     */
    private static Human player;

    /**
     * PlayerName method allows for name entry of the human player
     * @parameter
     * @returns human player
     */
    public static void playerName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name: ");
        String name = scanner.next();
        player = new Human(name);

    }

    /**
     * PlayGameHuman method is the game logic when a user plays against a friend (other human)
     * Player can enter an option from the String array, computer's choice is randomly generated using Math.random(), a winner is declared after the round and 1 point is added to player or computer
     * The human player can then decide to play another round by typing yes or no at round's end
     * @parameter
     * @returns human player and computer results
     */
    public static void playGameComputer(){

        Computer computer = new Computer();

        String playerChoice = String.valueOf(player.selection());
        String computerChoice = String.valueOf(computer.selection());

        if (Objects.equals(playerChoice, computerChoice)){
            System.out.println("Both player and computer chose " + computerChoice + ": Draw");
        }
        else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                playerChoice.equals("paper") && computerChoice.equals("rock")){

            System.out.println(player.winner());
            System.out.println(player.name + " now has " + player.points + " point(s)");
        }
        else {
            System.out.println(computer.winner());
            System.out.println("Computer now has " + computer.points + " point(s)");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Play another round? Type: 'yes' or 'no'");
        String answer = scanner.nextLine();
        if (Objects.equals(answer, "yes")){
            playGameComputer();
        }
        else if (Objects.equals(answer, "no")){
            System.out.println("Thanks for playing!");
        }

    }
}
