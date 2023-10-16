package Rock_Paper_Scissors;

import java.io.IOException;
import java.util.Scanner;

import static Rock_Paper_Scissors.PlayGameComp.playGameComp;
import static Rock_Paper_Scissors.PlayGameUser.playGameUser;

public class ContinueGame {

    public static void continueGameComp() throws IOException {

        //HistoryLog historyLog = new HistoryLog();

        Scanner scanner = new Scanner(System.in);

        System.out.println("To play again type 1");
        System.out.println("For game history type 2");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            playGameComp();
        }
        else if(input.equals("2")) {

        }
        else {
            System.out.println("Invalid input. Please type 1 or 2.");
        }

    }
        public static void continueGameUser() throws IOException {
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("To play again type 1");
            System.out.println("For game history type 2");
            String input2 = scanner2.nextLine();

            if (input2.equals("1")) {
                playGameUser();
            } else if (input2.equals("2")) {

                System.out.println("history");
            } else {
                System.out.println("Invalid input. Please type 1 or 2.");
            }
        }
}
