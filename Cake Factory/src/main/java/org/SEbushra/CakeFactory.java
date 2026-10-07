package org.SEbushra;

public class CakeFactory {

    public static Cake createCake(String type) {

        if (type.equals("chocolate")) {
            return new ChocolateCake();
        }

        if (type.equals("vanilla")) {
            return new VanillaCake();
        }

        if (type.equals("strawberry")) {
            return new StrawberryCake();
        }

        return null;
    }
}