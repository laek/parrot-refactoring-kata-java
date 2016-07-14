package parrot;

public class Parrot {

    public static Parrot create(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if (_type.equals(ParrotTypeEnum.EUROPEAN)) {
            return new EuropeanParrot();
        } else  if (_type.equals(ParrotTypeEnum.AFRICAN)) {
            return new AfricanParrot(numberOfCoconuts);
        } else {
            return new NorwegianBlueParrot(voltage, isNailed);
        }
    }

    public double getSpeed() {
        throw new RuntimeException("Should be unreachable");
    }

    protected double getBaseSpeed() {
        return 12.0;
    }
}
