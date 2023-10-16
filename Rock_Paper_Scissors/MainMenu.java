package Rock_Paper_Scissors;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import static Rock_Paper_Scissors.PlayGameComp.playGameComp;
import static Rock_Paper_Scissors.PlayGameUser.playGameUser;

public class MainMenu {

    public static void mainMenu() throws IOException {

        System.out.println("✌\uFE0F✋\uD83D\uDC4AMAIN MENU\uD83D\uDC4A✋✌\uFE0F");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type '1p' to play against computer or '2p' to play against a friend!");
        String input = scanner.nextLine();

        if (input.equals("1p")) {
            playGameComp();
        } else if (input.equals("2p")){
            playGameUser();
        } else {
            System.out.println("Invalid input. Please type play.");

        }
    }
}
