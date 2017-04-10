package GasPump;

import AbstractFactory.AbstractFactory;

public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {super(af);}

    @Override
    public void printOperations() {
        System.out.println(
                "Enter an operation: " +
                        "\n  1: Activate" +
                        "\n  2: Start" +
                        "\n  3: Pay Cash" +
                        "\n  4: Select Regular Gas" +
                        "\n  5: Select Super Gas" +
                        "\n  6: Select Premium Gas" +
                        "\n  7: Start Pump" +
                        "\n  8: Pump 1 Liter" +
                        "\n  9: Stop Pump" +
                        "\n 10: Print Receipt" +
                        "\n 11: No Receipt" +
                        "\n> "

        );
    }
}
