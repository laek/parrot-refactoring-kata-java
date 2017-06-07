package parrot;

public class NorwegianBlueParrot extends Parrot {

    private static final double MAXIMUM_SPEED = 24.0;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {

        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    private  double getBaseSpeed(double voltage) {
        return Math.min(MAXIMUM_SPEED, voltage * getBaseSpeed());
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

}
