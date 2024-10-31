public class Player {
    // Instance variables
    private String name;
    private int points;

    // Default constructor
    public Player() {
        this.name = "";
        this.points = 0;
    }

    // Constructor with inputName parameter
    public Player(String inputName) {
        this.name = inputName;
        this.points = 0;
        System.out.println("Welcome, " + name + ", to the game!");
    }

    // Accessor methods (getters)
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    // Mutator method to add points
    public void addPoints(int points) {
        this.points += points;
    }
}
