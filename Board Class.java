public class Board {
    // Instance variables
    private String phrase;
    private String solvedPhrase;
    private int currentLetterValue;

    // Constructor
    public Board() {
        this.solvedPhrase = ""; // solvedPhrase stays as an empty string
        this.phrase = loadPhrase(); // Initialize phrase using loadPhrase method
        setLetterValue(10); // Example call to setLetterValue (adjust as needed)
        
        // Temporary test code for debugging purposes
        System.out.println("Phrase: " + phrase); // temp test code
    }

    // Method to load a phrase (example placeholder method)
    private String loadPhrase() {
        // Logic to load a phrase (placeholder for demonstration)
        return "Sample Phrase";
    }

    // Method to set letter value (example placeholder method)
    private void setLetterValue(int value) {
        this.currentLetterValue = value;
    }
}
