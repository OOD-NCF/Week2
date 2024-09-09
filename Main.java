public class Main {
    public static void main(String[] args) {
        // Create a LightBulb object (which is a SwitchableDevice)
        SwitchableDevice bulb = new LightBulb();

        // Create a Switch object and pass the LightBulb (which implements SwitchableDevice)
        Switch lightSwitch = new Switch(bulb);

        // Operate the switch to turn the light on and off
        System.out.println("Turning the light ON:");
        lightSwitch.operate(true);  // Turn on the light

        System.out.println("Turning the light OFF:");
        lightSwitch.operate(false); // Turn off the light
    }
}