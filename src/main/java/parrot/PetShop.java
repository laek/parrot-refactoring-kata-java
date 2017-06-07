package parrot;

public class PetShop {
    public static Parrot provideParrot(ParrotTypeEnum parrotType,
                       int numberOfCoconuts, double voltage, boolean isNailed) {
        if (parrotType == ParrotTypeEnum.EUROPEAN) {
            return new EuropeanParrot();
        }

        if (parrotType == ParrotTypeEnum.AFRICAN) {
            return new AfricanParrot(numberOfCoconuts);
        }

        if (parrotType == ParrotTypeEnum.NORWEGIAN_BLUE) {
            return new NorwegianBlueParrot(voltage, isNailed);
        }

        if (parrotType == ParrotTypeEnum.LIGHT) {
            return new LightParrot();
        }
        throw new RuntimeException("Should be unreachable");
    }
}
