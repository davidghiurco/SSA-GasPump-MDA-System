package Main;

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
                    System.out.println(
                            "GasPump-1 " +
                                    "\nMENU of Operations: " +
                                    "\n-------------------------" +
                                    "\n(0) Activate(float a, float b) " +
                                    "\n(1) Start " +
                                    "\n(2) PayCredit " +
                                    "\n(3) Approve " +
                                    "\n(4) Reject" +
                                    "\n(5) SelectRegularGas " +
                                    "\n(6) SelectSuperGas " +
                                    "\n(7) Cancel " +
                                    "\n(8) StartPump " +
                                    "\n(9) PumpGallon " +
                                    "\n(x) StopPump" +
                                    "\n{q} Quit the program" +
                                    "\n-------------------------"
                    );
                    while (!input.equals("q")) {
                        gp1.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0": {
                                System.out.println(">Activate<");
                                float a, b;
                                System.out.println("Enter the price parameter a: ");
                                try {
                                    a = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price parameter b: ");
                                    b = Float.parseFloat(scan.readLine());
                                    gp1.Activate(a, b);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a floating point number (float).");
                                }
                                break;
                            }
                            case "1": {
                                System.out.println(">Start<");
                                gp1.Start();
                                break;
                            }
                            case "2": {
                                System.out.println(">PayCredit");
                                gp1.PayCredit();
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
                                System.out.println(">SelectRegularGas<");
                                gp1.Regular();
                                break;
                            }
                            case "6": {
                                System.out.println(">SelectSuperGas<");
                                gp1.Super();
                                break;
                            }
                            case "7": {
                                System.out.println(">Cancel<");
                                gp1.Cancel();
                                break;
                            }
                            case "8": {
                                System.out.println(">StartPump<");
                                gp1.StartPump();
                                break;
                            }
                            case "9": {
                                System.out.println(">PumpGallon<");
                                gp1.PumpGallon();
                                break;
                            }
                            case "x": {
                                System.out.println(">StopPump<");
                                gp1.StopPump();
                                break;
                            }
                            case "q": {
                                break;
                            }
                            default: {
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please select a valid operation");
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
                    System.out.println(
                            "GasPump-2 " +
                                    "\n-------------------------" +
                                    "\nMENU of Operations: " +
                                    "\n(0) Activate (int a, int b, int c)" +
                                    "\n(1) Start" +
                                    "\n(2) PayCash" +
                                    "\n(3) SelectRegularGas " +
                                    "\n(4) SelectSuperGas " +
                                    "\n(5) SelectPremiumGas " +
                                    "\n(6) Cancel" +
                                    "\n(7) StartPump" +
                                    "\n(8) PumpLiter" +
                                    "\n(9) Stop " +
                                    "\n(p) PrintReceipt" +
                                    "\n(n) NoReceipt" +
                                    "\n(q) Quit the program" +
                                    "\n-------------------------"
                    );
                    while (!input.equals("q")) {
                        gp2.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0": {
                                System.out.println(">Activate<");
                                int a, b, c;
                                System.out.println("Enter the price parameter a: ");
                                try {
                                    a = Integer.parseInt(scan.readLine());
                                    System.out.println("Enter the price parameter b: ");
                                    b = Integer.parseInt(scan.readLine());
                                    System.out.println("Enter the price parameter c: ");
                                    c = Integer.parseInt(scan.readLine());
                                    gp2.Activate(a, b, c);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be an integer.");
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
                                System.out.println("Insert cash (enter $ amount): ");
                                try {
                                    float cash = Float.parseFloat(scan.readLine());
                                    gp2.PayCash(cash);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Dollar amount must be a floating point decimal number");
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