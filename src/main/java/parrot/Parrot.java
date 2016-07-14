package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    private Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    protected Parrot() {

    }

    public static Parrot create(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if (_type.equals(ParrotTypeEnum.EUROPEAN)) {
            return new EuropeanParrot();
        }
        return new Parrot(_type, numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                throw new RuntimeException("Should be unreachable");
            case AFRICAN:
                return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }


}
