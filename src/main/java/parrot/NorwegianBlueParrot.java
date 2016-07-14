package parrot;

public class NorwegianBlueParrot extends Parrot {
    private final double voltage;

    public NorwegianBlueParrot(double voltage) {
        this.voltage = voltage;
    }

    public double getSpeed() {
        return Math.min(24.0, voltage * BASE_SPEED);
    }
}
