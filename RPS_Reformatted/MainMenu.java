package RPS_Reformatted;

import java.util.Scanner;

import static RPS_Reformatted.VsComputer.playGameComputer;
import static RPS_Reformatted.VsComputer.playerName;
import static RPS_Reformatted.VsHuman.playGameHuman;
import static RPS_Reformatted.VsHuman.playerNames;

/**
 * Main menu class display the main menu of the game where players can choose either to play against the computer or a friend.
 * @parameter
 * @returns the main menu
 */
public class MainMenu {
    public  static void mainMenu(){
        System.out.println("✌\uFE0F✋\uD83D\uDC4AMAIN MENU\uD83D\uDC4A✋✌\uFE0F");

        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Type '1p' to play against computer or '2p' to play against a friend");
            String input = scanner.nextLine().toLowerCase();

                if (input.equals("1p")){
                    playerName();
                    playGameComputer();

                }
                else if (input.equals("2p")){
                    playerNames();
                    playGameHuman();

                }
                else {
                    System.out.println("Invalid input.");
                }
        }
    }
}
