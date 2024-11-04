// Player.java
/**
 * Represents a player in the PhraseSolverGame.
 *
 * Edited Lines:
 * None (No new accessor methods needed for Player class)
 */
public class Player {
    private String name;
    private int points;

    /**
     * Constructs a new Player with the specified name and an initial score of zero.
     *
     * @param inputName the name of the player
     */
    public Player(String inputName) {
        this.name = inputName;
        this.points = 0;
        System.out.println("Welcome " + name + " to the game!"); // Welcome message for the player
    }

    /**
     * Returns the name of the player.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the current score of the player.
     *
     * @return the player's points
     */
    public int getPoints() {
        return points;
    }
}
