import AbstractFactory.*;
import GasPump.*;

import java.util.Scanner;


public class GasPumpDriver {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");

        int pump_type = (int) Float.parseFloat(scan.nextLine());

        switch (pump_type) {
            case 1: {
                ConcreteFactory1 cf1 = new ConcreteFactory1();
                GasPump1         gp1 = new GasPump1(cf1);

                int i;
                while (true) {
                    System.out.println(
                            "Enter operation: " +
                                    "\n 1: Activate" +
                                    "\n 2: Start" +
                                    "\n 3: Pay Credit" +
                                    "\n 4: Select Regular Gas" +
                                    "\n 5: Select Super Gas" +
                                    "\n 6: Start Pump" +
                                    "\n 7: Pump 1 Gallon" +
                                    "\n 8: Stop Pump"
                    );
                }
            }
            case 2: {
                ConcreteFactory2 cf2 = new ConcreteFactory2();
                GasPump2         gp2 = new GasPump2(cf2);

                int i;
                while (true) {
                    System.out.println(
                            "Enter operation: " +
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
                                    "\n 11: No Receipt"

                    );
                }
            }
            default: {
                System.out.println("Invalid selection. Terminating ...");
                System.exit(1);
            }

        }
    }
}