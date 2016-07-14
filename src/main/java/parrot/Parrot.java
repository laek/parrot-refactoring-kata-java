package parrot;

public abstract class Parrot {

    protected static final double BASE_SPEED = 12.0;

    public static Parrot create(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if(isNailed) {
            return new NailedParrot();
        }

        if (_type.equals(ParrotTypeEnum.EUROPEAN)) {
            return new EuropeanParrot();
        } else  if (_type.equals(ParrotTypeEnum.AFRICAN)) {
            return new AfricanParrot(numberOfCoconuts);
        } else {
            return new NorwegianBlueParrot(voltage);
        }
    }

    abstract public double getSpeed();
}
