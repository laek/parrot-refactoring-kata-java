package parrot;

public abstract class Parrot {

    protected static final double BASE_SPEED = 12.0;
    protected static final double MINIMUM_SPEED = 0.0;

    public static Parrot create(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(voltage);
    }

    abstract public double getSpeed();

    public static Parrot european() {
        return new EuropeanParrot();
    }

    public static Parrot african(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    public static Parrot nailed() {
        return new NailedParrot();
    }
}
