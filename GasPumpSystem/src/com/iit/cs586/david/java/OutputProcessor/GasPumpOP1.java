package OutputProcessor;

import DataStore.DataGasPump1;

/*
    This class implements the inherited abstract methods of the Strategy Superclass for GasPump-1
*/

public class GasPumpOP1 extends OutputProcessor {

    public GasPumpOP1() {
    }

    @Override
    public void StoreData() {
        DataGasPump1 d = (DataGasPump1) data;
        d.R_price = d.a;
        d.S_price = d.b;
        System.out.println("GasPump1 activated successfully!");
    }

    @Override
    public void PayMsg() {
        System.out.println("Thank you for choosing GasPump-1");
        System.out.println("Please select payment type");
    }

    /*
        GasPump-1 does nothing with this method
    */
    @Override
    public void StoreCash() {
    }

    @Override
    public void RejectMsg() {
        System.out.println("Credit card rejected");
        System.out.println("Cancelling transaction ...");
    }


    @Override
    public void DisplayMenu() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Credit card approved");
        System.out.println("Please select gas type:");
        System.out.println(
                "(5) Regular [$" + d.R_price + "/gal] " +
                "\n(6) Super [$" + d.S_price + "/gal]");
        System.out.println("Otherwise, select (7) to cancel");

    }

    @Override
    public void CancelMsg() {
        System.out.println("Cancelling transaction ... ");
    }

    @Override
    public void SetPrice(int g) {
        DataGasPump1 d = (DataGasPump1) data;
        if (g == 1) { // Regular selected
            d.price = d.R_price;
            d.gasType = 5;
        } else if (g == 2) { // Super selected
            d.price = d.S_price;
            d.gasType = 6;
        }
        System.out.println(gType(d) + " gasoline selected @ price of $" + d.price + "/gallon");
        System.out.println("Select (8) to start the pump");
    }

    @Override
    public void SetInitialValues() {
        DataGasPump1 d = (DataGasPump1) data;
        d.G = 0;
        d.total = 0;
    }

    @Override
    public void ReadyMsg() {
        System.out.println("Ready to dispense fuel");
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Select (9) to dispense 1 gallon of " + gType(d) + " gasoline");
        System.out.println("Otherwise, select '(x) to stop");
    }

    @Override
    public void PumpGasUnit() {
        DataGasPump1 d = (DataGasPump1) data;
        /*
            Call the subroutine that ACTUALLY pumps gas here
            Now increment the appropriate data values
        */
        d.G++;
        d.total = d.price * d.G;
    }

    @Override
    public void GasPumpedMsg() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Pumped 1 gallon of " + gType(d) + " gasoline");
        System.out.println("Total # of gallons pumped: " + d.G);
        System.out.println("Select (9) to dispense 1 more gallon of " + gType(d) + " gasoline");
        System.out.println("Otherwise, select (x) to stop");
    }

    @Override
    public void StopMsg() {
        System.out.println("Stopping pump ...");
    }

    @Override
    public void PrintReceipt() {
        System.out.println("Printing receipt ...");
        System.out.println("*********************************************************************");
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println(d.G + " gallons of " + gType(d) + " gasoline @ $" + d.price + "/gallon");
        System.out.println("Total: $" + d.total);
        System.out.println("*********************************************************************");
        System.out.println("Transaction complete");
    }

    /*
        GasPump-1 does nothing with this method
     */
    @Override
    public void ReturnCash() {
    }

    /*
        HELPER METHODS
    */

    private String gType(DataGasPump1 d) {
        String type;
        switch (d.gasType) {
            case 5: {
                type = "Regular";
                break;
            }
            case 6: {
                type = "Super";
                break;
            }
            default: {
                type = "UNDEFINED";
                break;
            }
        }
        return type;
    }
}