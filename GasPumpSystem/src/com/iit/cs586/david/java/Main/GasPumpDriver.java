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
                                    "\n(5) Regular " +
                                    "\n(6) Super " +
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
                            case "0": { // Activate
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
                            case "1": { // Start
                                System.out.println(">Start<");
                                gp1.Start();
                                break;
                            }
                            case "2": { // PayCredit
                                System.out.println(">PayCredit");
                                gp1.PayCredit();
                                break;
                            }
                            case "3": { // Approve
                                System.out.println(">Approve<");
                                gp1.Approve();
                                break;
                            }
                            case "4": { // Reject
                                System.out.println(">Reject<");
                                gp1.Reject();
                                break;
                            }
                            case "5": { // Regular
                                System.out.println(">Regular<");
                                gp1.Regular();
                                break;
                            }
                            case "6": { // Super
                                System.out.println(">Super<");
                                gp1.Super();
                                break;
                            }
                            case "7": { // Cancel
                                System.out.println(">Cancel<");
                                gp1.Cancel();
                                break;
                            }
                            case "8": { // StartPump
                                System.out.println(">StartPump<");
                                gp1.StartPump();
                                break;
                            }
                            case "9": { // PumpGallon
                                System.out.println(">PumpGallon<");
                                gp1.PumpGallon();
                                break;
                            }
                            case "x": { // StopPump
                                System.out.println(">StopPump<");
                                gp1.StopPump();
                                break;
                            }
                            case "q": { // Quit
                                break;
                            }
                            default: { // Anything else: unknown / unsupported operation
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
                                    "\n(3) Regular " +
                                    "\n(4) Super " +
                                    "\n(5) Premium " +
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
                            case "0": { // Activate
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
                            case "1": { // Start
                                System.out.println(">Start<");
                                gp2.Start();
                                break;
                            }
                            case "2": { // PayCash
                                System.out.println(">PayCash<");
                                System.out.println("Insert cash (enter $ amount): ");
                                try {
                                    float cash = Float.parseFloat(scan.readLine());
                                    gp2.PayCash(cash);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Dollar amount must be a floating point decimal number");
                                }
                                break;
                            }
                            case "3": { // Regular
                                System.out.println(">Regular<");
                                gp2.Regular();
                                break;
                            }
                            case "4": { // Super
                                System.out.println(">Super<");
                                gp2.Super();
                                break;
                            }
                            case "5": { // Premium
                                System.out.println(">Premium<");
                                gp2.Premium();
                                break;
                            }
                            case "6": { // Cancel
                                System.out.println(">Cancel<");
                                gp2.Cancel();
                                break;
                            }
                            case "7": { // Start
                                System.out.println(">StartPump<");
                                gp2.StartPump();
                                break;
                            }
                            case "8": { // PumpLiter
                                System.out.println(">PumpLiter<");
                                gp2.PumpLiter();
                                break;
                            }
                            case "9": { // Stop
                                System.out.println(">Stop<");
                                gp2.Stop();
                                break;
                            }
                            case "p": { // PrintReceipt
                                System.out.println(">PrintReceipt<");
                                gp2.Receipt();
                                break;
                            }
                            case "n": { // NoReceipt
                                System.out.println(">NoReceipt<");
                                gp2.NoReceipt();
                                break;
                            }
                            case "q": { // Quit
                                break;
                            }
                            default: { // Anything else: unknown / unsupported operation
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