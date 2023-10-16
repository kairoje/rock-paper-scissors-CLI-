package Rock_Paper_Scissors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static Rock_Paper_Scissors.ContinueGame.continueGameUser;


public class PlayGameUser {

    public static void playGameUser() throws IOException {

        //HistoryLog loggedInfo = new HistoryLog();


        User user = new User();
        String userChoice = String.valueOf(user.choose());


        User2 user2 = new User2();
        String user2Choice = String.valueOf(user2.choose());


        if(Objects.equals(userChoice, user2Choice)){
            System.out.println("Both players choose " + user2Choice + ": Draw");
        }
        else if(userChoice.equals("rock") && user2Choice.equals("scissors") ||
                userChoice.equals("scissors") && user2Choice.equals("paper") ||
                userChoice.equals("paper") && user2Choice.equals("rock")){
            System.out.println(user.isWinner());

        } else {
            System.out.println(user2.isWinner());
        }

        continueGameUser();
    }

}
