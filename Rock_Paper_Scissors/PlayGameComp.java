package Rock_Paper_Scissors;

import java.io.IOException;
import java.util.Objects;

import static Rock_Paper_Scissors.ContinueGame.continueGameComp;


public class PlayGameComp{

    public static void playGameComp() throws IOException {

        User user = new User();
        String userChoice = String.valueOf(user.choose());
        int userPoints = user.points;

        Computer computer = new Computer();
        String computerChoice = String.valueOf(computer.choose());
        int computerPoints = computer.points;

        if(Objects.equals(userChoice, computerChoice)){
            System.out.println("Draw");

        } else if(userChoice.equals("rock") && computerChoice.equals("scissors") ||
                userChoice.equals("scissors") && computerChoice.equals("paper") ||
                userChoice.equals("paper") && computerChoice.equals("rock")){
            user.points++;
            System.out.println(user.isWinner());
            System.out.println("user has " + userPoints + " point(s)");
        } else {
            computer.points++;
            System.out.println(computer.isWinner());
            System.out.println("computer has " + computerPoints + " point(s)");
        }

        continueGameComp();
    }
}
