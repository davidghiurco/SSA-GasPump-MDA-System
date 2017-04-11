package Driver;

import AbstractFactory.*;
import GasPump.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class GasPumpDriver {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");
        System.out.print("> ");

        int pump_type;
        String input = "initial";
        try {
            pump_type = Integer.parseInt(scan.readLine());
            switch (pump_type) {
                case 1: {
                    ConcreteFactory1 cf1 = new ConcreteFactory1();
                    GasPump1 gp1 = new GasPump1(cf1);
                    gp1.printOperations();
                    System.out.println("Enter an operation: (0) Activate");
                    while (!input.equals("q")) {
                        input = scan.readLine();
                        switch (input) {
                            case "0": {
                                System.out.println(">Activate<");
                                // Don't prompt for input if operation is not allowed in the current state
                                if (gp1.getModel().inState(7)) { // Activate() is only allowed in state s = LS[7]
                                    float a, b;
                                    System.out.println("Enter the price of Regular Gas: ");
                                    try {
                                        a = Float.parseFloat(scan.readLine());
                                        System.out.println("Enter the price of Super Gas: ");
                                        b = Float.parseFloat(scan.readLine());
                                        gp1.Activate(a, b);
                                        if (a > 0 && b > 0) {
                                            System.out.println("Enter an operation: (1) Start");
                                        } else {
                                            System.out.println("Enter an operation: (0) Activate");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Type mismatch. Price must be a floating point number (float).");
                                        System.out.println("Enter an operation: (0) Activate");
                                    }
                                } else {
                                    gp1.Activate(null, null); // will produce not allowed message
                                }
                                break;
                            }
                            case "1": {
                                System.out.println(">Start<");
                                gp1.Start();
                                break;
                            }
                            case "2": {
                                System.out.println(">Pay Credit<");
                                if (gp1.getModel().inState(1)) {
                                    System.out.println("Enter credit card information:");
                                    String credit_card = scan.readLine(); // allow spaces in the credit card information string
                                    System.out.println("Credit card info: " + "'" + credit_card + "'");
                                    gp1.PayCredit(credit_card);
                                    System.out.println("Enter an operation: (3) Approve, (4) Reject");

                                } else { // if not in state 1
                                    gp1.PayCredit(null); // will produce not allowed message
                                }
                                break;
                            }
                            case "3": {
                                System.out.println(">Approve<");
                                gp1.Approve();
                                break;
                            }
                            case "4": {
                                System.out.println(">Reject<");
                                gp1.Reject();
                                break;
                            }
                            case "5": {
                                System.out.println(">Select Regular Gas<");
                                gp1.Regular();
                                break;
                            }
                            case "6": {
                                System.out.println(">Select Super Gas<");
                                gp1.Super();
                                break;
                            }
                            case "7": {
                                System.out.println(">Cancel<");
                                gp1.Cancel();
                                break;
                            }
                            case "8": {
                                System.out.println(">Start Pump<");
                                gp1.StartPump();
                                break;
                            }
                            case "9": {
                                System.out.println(">Pump Gallon<");
                                gp1.PumpGallon();
                                break;
                            }
                            case "x": {
                                System.out.println(">Stop Pump<");
                                gp1.StopPump();
                                break;
                            }
                            case "q": {
                                break;
                            }
                            default: {
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please enter a valid operation");
                                break;
                            }
                        }
                    } // End while loop
                    System.out.println("Quitting ...");
                    break;
                } // End pump_type = 1 case
                case 2: {
                    ConcreteFactory2 cf2 = new ConcreteFactory2();
                    GasPump2 gp2 = new GasPump2(cf2);
                    gp2.printOperations();
                    System.out.println("Enter an operation: (0) Activate");
                    while (!input.equals("q")) {
                        input = scan.readLine();
                        switch (input) {
                            case "0": {
                                System.out.println(">Activate<");
                                // Don't prompt for input if operation is now allowed in current state
                                if (gp2.getModel().inState(7)) { // Activate() is only allowed in state s = LS[7]
                                    int a, b, c;
                                    System.out.println("Enter the price of Regular Gas: ");
                                    try {
                                        a = Integer.parseInt(scan.readLine());
                                        System.out.println("Enter the price of Super Gas: ");
                                        b = Integer.parseInt(scan.readLine());
                                        System.out.println("Enter the price of Premium Gas: ");
                                        c = Integer.parseInt(scan.readLine());
                                        gp2.Activate(a, b, c);
                                        if (a > 0 && b > 0 && c > 0) {
                                            System.out.println("Enter an operation: (1) Start");
                                        } else {
                                            System.out.println("Enter an operation: (0) Activate");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Type mismatch. Price must be an integer.");
                                        System.out.println("Enter an operation: (0) Activate");
                                    }
                                } else {
                                    gp2.Activate(null, null, null); // will produce not allowed message
                                }
                                break;
                            }
                            case "1": {
                                System.out.println(">Start<");
                                gp2.Start();
                                break;
                            }
                            case "2": {
                                System.out.println(">Pay Cash<");
                                if (gp2.getModel().inState(1)) {
                                    System.out.println("Insert cash (enter $ amount): ");
                                    try {
                                        float cash = Float.parseFloat(scan.readLine());
                                        gp2.PayCash(cash);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Type mismatch. Dollar amount must be a floating point decimal number");
                                        System.out.println("Enter an action: (2) Pay Cash");
                                    }
                                } else { // if not in state 1
                                    gp2.PayCash(null); // will produce not allowed message
                                }
                                break;
                            }
                            case "3": {
                                System.out.println(">Select Regular Gas<");
                                gp2.Regular();
                                break;
                            }
                            case "4": {
                                System.out.println(">Select Super Gas");
                                gp2.Super();
                                break;
                            }
                            case "5": {
                                System.out.println(">Select Premium Gas");
                                gp2.Premium();
                                break;
                            }
                            case "6": {
                                System.out.println(">Cancel<");
                                gp2.Cancel();
                                break;
                            }
                            case "7": {
                                System.out.println(">Start Pump<");
                                gp2.StartPump();
                                break;
                            }
                            case "8": {
                                System.out.println(">Pump Liter<");
                                gp2.PumpLiter();
                                break;
                            }
                            case "9": {
                                System.out.println(">Stop<");
                                gp2.Stop();
                                break;
                            }
                            case "p": {
                                System.out.println(">Print Receipt<");
                                gp2.Receipt();
                                break;
                            }
                            case "n": {
                                System.out.println(">No Receipt<");
                                gp2.NoReceipt();
                                break;
                            }
                            case "q": {
                                break;
                            }
                            default: {
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please enter a valid operation");
                                break;
                            }
                        }
                    } // End while loop
                    System.out.println("Quitting ...");
                    break;
                } // end pump_type = 2 case
                default: {
                    System.out.println("Unknown GasPump selection. Terminating ...");
                    System.exit(1);
                }

            }
        } catch (IOException ioe) {
            System.out.println("IO Error. Terminating ...");
            System.exit(1);
        }
    }
}