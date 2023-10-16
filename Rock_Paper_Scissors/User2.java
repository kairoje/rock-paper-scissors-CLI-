package Rock_Paper_Scissors;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class User2 extends User{

    String choose() {

        Scanner choice = new Scanner(System.in);
        String input;


        while(true){
            System.out.println("Player2 type one: " + Arrays.toString(options));
            input = choice.nextLine();


            for (String option : options){
                if (Objects.equals(input, option)){
                    return input;
                }
            }
            System.out.println("Invalid input");
        }
    }

}
