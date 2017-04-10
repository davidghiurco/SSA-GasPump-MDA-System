import AbstractFactory.*;
import GasPump.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


public class GasPumpDriver {
    public static void main(String [] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");
        System.out.print("> ");

        int pump_type;
        try {
            pump_type = Integer.parseInt(scan.readLine());
            switch (pump_type) {
                case 1: {
                    ConcreteFactory1 cf1 = new ConcreteFactory1();
                    GasPump1         gp1 = new GasPump1(cf1);
                    System.out.println("Enter an operation: (1) Activate");
                    int input;
                    while (true) {
                        try {
                            input = Integer.parseInt(scan.readLine());
                            switch (input) {
                                case 1: {
                                    System.out.println(">Activate<");
                                    if (gp1.getModel().inState(7)) {
                                        float a, b;
                                        System.out.println("Enter the price of Regular Gas: ");
                                        try {
                                            a = Float.parseFloat(scan.readLine());
                                            System.out.println("Enter the price of Super Gas: ");
                                            b = Float.parseFloat(scan.readLine());
                                            gp1.Activate(a, b);
                                            System.out.println("Enter an operation: (2) Start");
                                        } catch (NumberFormatException e) {
                                            System.out.println("Type mismatch. Price must be a floating point number (float).");
                                            System.out.println("Enter an operation: (1) Activate");
                                        }
                                    }
                                    else {
                                        gp1.Activate(null, null); // will produce not allowed message
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println(">Start<");
                                    gp1.Start();
                                    break;
                                }
                                case 3: {
                                    System.out.println(">Pay Credit<");
                                    String credit_card;
                                    if (gp1.getModel().inState(1)) {
                                        System.out.println("Enter credit card information:");
                                        credit_card = scan.readLine(); // allow spaces in the credit card information string
                                        System.out.println("Credit card info: " + "'" + credit_card + "'");
                                        gp1.PayCredit(credit_card);

                                        System.out.println("Verifying credit card information ...");
                                        /*
                                            Sub-routine for verifying credit card information authenticity would go here
                                        */
                                        if (credit_card.equals("valid")) {
                                            gp1.Approved();
                                        } else {
                                            gp1.Rejected();

                                        }
                                    }
                                    else {
                                        gp1.PayCredit(null); // will produce not allowed message
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println(">Select Regular Gas<");
                                    gp1.Regular();
                                    break;
                                }
                                case 5: {
                                    System.out.println(">Select Super Gas<");
                                    gp1.Super();
                                    break;
                                }
                                case 6: {
                                    System.out.println(">Cancel<");
                                    gp1.Cancel();
                                    break;
                                }
                                case 7: {
                                    System.out.println(">Start Pump<");
                                    gp1.StartPump();
                                    break;
                                }
                                case 8: {
                                    System.out.println(">Pump Gallon<");
                                    gp1.PumpGallon();
                                    break;
                                }
                                case 9: {
                                    System.out.println(">Stop Pump<");
                                    gp1.StopPump();
                                    break;
                                }
                                default: {
                                    System.out.println("Unknown operation: '" + input + "'");
                                    System.out.println("Please enter a valid operation");
                                    break;
                                }
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    } // End while loop
                } // End pump_type = 1 case
                case 2: {
                    ConcreteFactory2 cf2 = new ConcreteFactory2();
                    GasPump2         gp2 = new GasPump2(cf2);

                    int i;
                    while (true) {
                    }
                }
                default: {
                    System.out.println("Unknown GasPump selection. Terminating ...");
                    System.exit(1);
                }

            }
        }
        catch (NumberFormatException e) {
            System.out.println("Input type mismatch. Please enter a number.");
            System.out.println("Terminating ...");
            System.exit(1);
        }
        catch (IOException ioe) {
            System.out.println("IO Error. Terminating ...");
            System.exit(1);
        }
    }
}