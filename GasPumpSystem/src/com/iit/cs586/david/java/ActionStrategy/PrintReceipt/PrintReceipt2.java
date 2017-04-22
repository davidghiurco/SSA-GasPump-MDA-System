package ActionStrategy.PrintReceipt;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 PrintReceipt action responsible for printing a receipt
 */
public class PrintReceipt2 extends PrintReceipt {

    public PrintReceipt2(Data data) {
        super(data);
    }

    /*
        Print a receipt by reading the appropriate values form the shared data structure
     */
    @Override
    public void printReceipt() {
        System.out.println("Printing receipt ...");
        System.out.println("*********************************************************************");
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println(d.L + " liters of " + d.gasType + " gasoline @ $" + d.price + "/liter");
        System.out.println("Total: $" + (float) d.total);
        System.out.println("Cash inserted: $" + d.cash);
        System.out.println("*********************************************************************");
        System.out.println("Transaction complete");
    }
}
