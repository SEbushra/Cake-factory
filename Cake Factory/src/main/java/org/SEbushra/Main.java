package org.SEbushra;

public class Main {
    static void main() {
        Cake cake1 = CakeFactory.createCake("chocolate");
        Cake cake2 = CakeFactory.createCake("vanilla");
        Cake cake3 = CakeFactory.createCake("strawberry");

        cake1.bake();
        cake2.bake();
        cake3.bake();
        }
    }

