package RPS_Reformatted;

/**
 * Player abstract class holds the attributes of the players - humans and computer
 * Includes the attributes: points, the winner method, a selection method, and the array of options the players can choose from
 * @parameter
 * @returns
 */
abstract public class Player {
    int points;
    abstract String winner();
    abstract String selection();
    public String[] options = {"rock", "paper", "scissors"};


}
