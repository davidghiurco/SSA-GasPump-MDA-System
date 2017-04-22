package ActionStrategy.PrintReceipt;

import PlatformData.Data;
import PlatformData.DataGasPump1;

/*
    GasPump1 PrintReceipt action responsible for printing a receipt
 */
public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(Data data) {
        super(data);
    }

    /*
        Print a receipt by reading the appropriate values from the shared data structure
     */
    @Override
    public void printReceipt() {
        System.out.println("Printing receipt ...");
        System.out.println("######################################################################");
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println(d.G + " gallons of " + d.gasType + " gasoline @ $" + d.price + "/gallon");
        System.out.println("Total: $" + d.total);
        System.out.println("#######################################################################");
        System.out.println("Transaction complete");
    }
}
