// Board.java
/**
 * Represents the game board for PhraseSolverGame.
 *
 * Edited Lines:
 * - Added accessor methods: getPhrase(), getSolvedPhrase(), getCurrentLetterValue() (Lines 41-66)
 */
public class Board {
    private String phrase;
    private String solvedPhrase;
    private int currentLetterValue;

    /**
     * Constructs a new Board object and initializes its attributes.
     * Uses the loadPhrase method to set the initial phrase and initializes other attributes.
     */
    public Board() {
        this.solvedPhrase = ""; // solvedPhrase stays as empty initially
        loadPhrase(); // Initialize the phrase attribute with a random phrase
        setLetterValue(); // Set a random value for the current letter
        System.out.println("Phrase: " + phrase); // Temporary test code
    }

    /**
     * Loads a phrase to be used in the game.
     * This method initializes the phrase attribute with a specific value.
     */
    private void loadPhrase() {
        // Placeholder code for loading a phrase
        this.phrase = "Hello World"; // Example phrase
    }

    /**
     * Sets a random value for the current letter.
     * This is used to assign points to a correctly guessed letter.
     */
    private void setLetterValue() {
        // Placeholder for setting the letter value
        this.currentLetterValue = 10; // Example value
    }

    /**
     * Returns the current phrase being solved.
     *
     * @return the current phrase
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Returns the partially solved phrase.
     *
     * @return the partially solved phrase
     */
    public String getSolvedPhrase() {
        return solvedPhrase;
    }

    /**
     * Returns the current letter value.
     *
     * @return the current letter value
     */
    public int getCurrentLetterValue() {
        return currentLetterValue;
    }
}
