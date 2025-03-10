class Switch {
    private SwitchableDevice device;

    // Now Switch depends on the abstraction (SwitchableDevice) instead of the concrete class (LightBulb)
    public Switch(SwitchableDevice device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}