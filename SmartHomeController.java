public class SmartHomeController {
    // Static instance of the Singleton class
    private static SmartHomeController instance = null;

    // State variables
    private boolean lightsOn;
    private int currentTemperature;
    private boolean securityArmed;

    // Private constructor to prevent instantiation
    private SmartHomeController() {
        // Default states
        lightsOn = false;
        currentTemperature = 22; // Default temperature
        securityArmed = false;
    }

    // Public method to return the Singleton instance
    public static SmartHomeController getInstance() {
        if (instance == null) {
            synchronized (SmartHomeController.class) {
                if (instance == null) {
                    instance = new SmartHomeController();
                }
            }
        }
        return instance;
    }

    // Method to turn on the lights
    public void turnOnLights() {
        lightsOn = true;
        System.out.println("Lights turned on.");
    }

    // Method to turn off the lights
    public void turnOffLights() {
        lightsOn = false;
        System.out.println("Lights turned off.");
    }

    // Method to set the thermostat temperature
    public void setTemperature(int temperature) {
        currentTemperature = temperature;
        System.out.println("Thermostat set to " + currentTemperature + " degrees.");
    }

    // Method to arm the security system
    public void armSecurity() {
        securityArmed = true;
        System.out.println("Security system armed.");
    }

    // Method to disarm the security system
    public void disarmSecurity() {
        securityArmed = false;
        System.out.println("Security system disarmed.");
    }

    // Optional: Display the current state of the SmartHomeController
    public void displayStatus() {
        System.out.println("Lights are " + (lightsOn ? "on" : "off"));
        System.out.println("Current temperature: " + currentTemperature + " degrees");
        System.out.println("Security system is " + (securityArmed ? "armed" : "disarmed"));
    }
}

