package RPS_Reformatted;

import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;

public class VsHuman {

    /**
     * Instances of the Human class objects created
     * @parameter
     * @returns human player 1 and 2
     */
    private static Human player1;
    private static Human player2;

    /**
     * PlayerNames method allows for each player to enter a name
     * @parameter
     * @returns
     */
    public static void playerNames(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for Player 1: ");
        String playerName1 = scanner.nextLine();

        System.out.println("Enter name for Player 2: ");
        String playerName2 = scanner.nextLine();

        player1 = new Human(playerName1);
        player2 = new Human(playerName2);

    }

    /**
     * PlayGameHuman method is the game logic when a user plays against a friend (other human)
     * Players can enter an option from the String array, a winner is declared after the round and 1 point is added to that player
     * A player can then decide to play another round by typing yes or no at round's end
     * @parameter
     * @returns human player 1 and 2
     */
    public static void playGameHuman(){

        String p1Choice = String.valueOf(player1.selection());
        String p2Choice = String.valueOf(player2.selection());

        if (Objects.equals(p1Choice, p2Choice)){
            System.out.println("Both players chose " + p2Choice + ": Draw");
        }
        else if (p1Choice.equals("rock") && p2Choice.equals("scissors") ||
                p1Choice.equals("scissors") && p2Choice.equals("paper") ||
                p1Choice.equals("paper") && p2Choice.equals("rock")){

            System.out.println(player1.winner());
            System.out.println(player1 + " now has " + player1.points + " point(s)");
        }
        else {
            System.out.println(player2.winner());
            System.out.println(player2 + " now has " + player2.points + " point(s)");
        }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Play another round? Type: 'yes' or 'no'");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "yes")){
                playGameHuman();
            }
            else if (Objects.equals(answer, "no")){
                System.out.println("Thanks for playing!");
            }
    }
}
