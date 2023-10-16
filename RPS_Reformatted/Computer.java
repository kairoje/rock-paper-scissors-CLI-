package RPS_Reformatted;

public class Computer extends Player{

    /**
     * Selection method randomly selection and option within the String array for the computer player using Math.random()
     * @parameter
     * @returns computer's choice
     */
    @Override
    String selection() {

        int randomChoice = (int) ((Math.random() * options.length));
        System.out.println("Computer chose: " + options[randomChoice]);
        return options[randomChoice];

    }

    /**
     * Winner method display computer as winner when invoked and increments the points by 1
     * @parameter
     * @returns computer winning declaration
     */
    @Override
    String winner() {
        points++;
        return "Computer Wins!";
    }

}
