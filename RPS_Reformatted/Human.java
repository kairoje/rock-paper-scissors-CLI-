package RPS_Reformatted;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Human extends Player{
    /**
     * String name will represent each instance of players' name
     * @parameter
     * @returns name
     */
    String name;

    /**
     * Human method allows entry of a name or sets a default name is no entry is made
     * @parameter takes a default name
     * @returns name
     */
    public Human(String defaultName){
        if (!defaultName.isEmpty()){
            this.name = defaultName;
        }
        else {
            this.name = "Player";
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
    }

    /**
     * Selection method takes an input that represents the player's array option choice
     * @parameter
     * @returns the input
     */
    @Override
    String selection() {
        Scanner select = new Scanner(System.in);
        String input;

        while (true){
            System.out.println(name + " enter one: " + Arrays.toString(options));
            input = select.nextLine().toLowerCase();

            for (String option : options){
                if (Objects.equals(input, option)){
                    return input;
                }
            }
            System.out.println("Invalid input!");
        }
    }

    /**
     * When a winner can be declared this winner method will display the winner and increment the points
     * @parameter
     * @returns name of play who is declared winner
     */
    @Override
    String winner() {
        points++;
        return name + " Wins!";
    }
}
