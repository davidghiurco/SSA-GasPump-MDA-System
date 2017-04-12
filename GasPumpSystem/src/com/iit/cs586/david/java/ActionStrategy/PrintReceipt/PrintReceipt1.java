package ActionStrategy.PrintReceipt;

import PlatformData.Data;
import PlatformData.DataGasPump1;

public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(Data data) {
        super(data);
    }

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
