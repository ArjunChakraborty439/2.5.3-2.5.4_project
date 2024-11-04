// PhraseSolver.java
/**
 * Manages the PhraseSolver game, coordinating between players and the board.
 *
 * Edited Lines:
 * - Added displayGameState() method (Lines 41-52)
 * - Added call to displayGameState() in the constructor (Line 36)
 */
public class PhraseSolver {
    private Player player1;
    private Player player2;
    private Board board;
    private boolean isSolved;

    /**
     * Constructs a new PhraseSolver game, initializing players and the game board.
     *
     * @param player1Name the name of the first player
     * @param player2Name the name of the second player
     */
    public PhraseSolver(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        board = new Board();
        isSolved = false; // Initial state of the game is unsolved
        displayGameState();
    }

    /**
     * Displays the current game state including the current guessing player's name,
     * the partially solved phrase, and the point value of the next letter guess.
     */
    public void displayGameState() {
        // Assuming player1 is the current player (this logic can be expanded to alternate turns)
        System.out.println("Current guessing player: " + player1.getName());
        System.out.println("Partially solved phrase: " + board.getSolvedPhrase());
        System.out.println("Point value of the next letter guess: " + board.getCurrentLetterValue());
    }
}
