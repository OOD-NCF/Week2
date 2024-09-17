public class ChocolateFactory {
    // Static instance of the Singleton class
    private static ChocolateFactory instance = null;

    // State variables for the chocolate production process
    private boolean empty;
    private boolean boiled;

    // Private constructor to prevent instantiation
    private ChocolateFactory() {
        empty = true;  // Initially the factory is empty
        boiled = false; // The chocolate mixture is not boiled
        System.out.println("Chocolate Factory is ready.");
    }

    // Public method to provide access to the Singleton instance
    public static ChocolateFactory getInstance() {
        if (instance == null) {
            synchronized (ChocolateFactory.class) {
                if (instance == null) {
                    instance = new ChocolateFactory();
                }
            }
        }
        return instance;
    }

    // Method to fill the chocolate mixture into the boiler
    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with the chocolate mixture...");
        } else {
            System.out.println("Boiler is already filled!");
        }
    }

    // Method to boil the chocolate mixture
    public void boil() {
        if (!empty && !boiled) {
            boiled = true;
            System.out.println("Boiling the chocolate mixture...");
        } else if (empty) {
            System.out.println("Cannot boil, the boiler is empty!");
        } else if (boiled) {
            System.out.println("The mixture has already been boiled!");
        }
    }

    // Method to drain the boiled chocolate mixture
    public void drain() {
        if (!empty && boiled) {
            empty = true;
            System.out.println("Draining the boiled chocolate mixture...");
        } else if (empty) {
            System.out.println("Cannot drain, the boiler is already empty!");
        } else if (!boiled) {
            System.out.println("Cannot drain, the mixture is not boiled yet!");
        }
    }

    // Optional: Display the current state of the chocolate factory
    public void displayStatus() {
        System.out.println("Boiler is " + (empty ? "empty" : "filled"));
        System.out.println("Mixture is " + (boiled ? "boiled" : "not boiled"));
    }
}
