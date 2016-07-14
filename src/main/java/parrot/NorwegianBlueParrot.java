package parrot;

public class NorwegianBlueParrot extends Parrot {
    private static final double MAXIMUM_SPEED = 24.0;
    private final double voltage;

    public NorwegianBlueParrot(double voltage) {
        this.voltage = voltage;
    }

    public double getSpeed() {
        return Math.min(MAXIMUM_SPEED, voltage * BASE_SPEED);
    }
}
