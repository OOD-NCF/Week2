public class SmartHomeTest {
    public static void main(String[] args) {
        // Get the Singleton instance of SmartHomeController
        SmartHomeController controller1 = SmartHomeController.getInstance();

        // Interact with the smart home system
        controller1.turnOnLights();
        controller1.setTemperature(24);
        controller1.armSecurity();
        controller1.displayStatus();

        System.out.println("-----");

        // Get the Singleton instance from another place in the program
        SmartHomeController controller2 = SmartHomeController.getInstance();

        // Interact with the same instance
        controller2.turnOffLights();
        controller2.setTemperature(19);
        controller2.disarmSecurity();
        controller2.displayStatus();

        // Verify that both controller1 and controller2 are the same instance
        System.out.println("Are both instances the same? " + (controller1 == controller2));
    }
}