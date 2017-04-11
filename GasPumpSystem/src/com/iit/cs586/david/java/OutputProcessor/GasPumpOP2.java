package OutputProcessor;

import DataStore.DataGasPump2;

/*
    This class implements the inherited abstract methods of the Strategy Superclass for GasPump-2
*/

public class GasPumpOP2 extends OutputProcessor {

    public GasPumpOP2() {
    }

    @Override
    public void StoreData() {
        DataGasPump2 d = (DataGasPump2) data;
        d.R_price = d.a;
        d.S_price = d.b;
        d.P_price = d.c;
        System.out.println("GasPump2 activated successfully!");
    }

    @Override
    public void PayMsg() {
        System.out.println("Thank you for choosing GasPump-2");
        System.out.println("Please select payment type: ");
    }

    @Override
    public void StoreCash() {
        DataGasPump2 d = (DataGasPump2) data;
        d.cash = d.temp_cash;
        System.out.println("Amount of cash inserted: $" + d.cash);
    }

    /*
        GasPump-2 does nothing with this method
    */
    @Override
    public void RejectMsg() {
    }

    @Override
    public void DisplayMenu() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Please select gas type: ");
        System.out.println(
                "(3) Regular [$" + d.R_price + "/liter] " +
                "\n(4) Super [$" + d.S_price + "/liter] " +
                "\n(5) Premium [$" + d.P_price + "/liter]");
        System.out.println("Otherwise, select (6) to cancel");
    }

    @Override
    public void CancelMsg() {
        System.out.println("Cancelling ... ");
    }

    @Override
    public void SetPrice(int g) {
        DataGasPump2 d = (DataGasPump2) data;
        if (g == 1) { // Regular selected
            d.price = d.R_price;
            d.gasType = 3;
        } else if (g == 2) { // Super selected
            d.price = d.S_price;
            d.gasType = 4;
        } else if (g == 3) { // Premium selected
            d.price = d.P_price;
            d.gasType = 5;
        }
        System.out.println(gType(d) + " gasoline selected @ price of $" + d.price + "/liter");
        System.out.println("Select (7) to start the pump");
    }

    @Override
    public void SetInitialValues() {
        DataGasPump2 d = (DataGasPump2) data;
        d.L = 0;
        d.total = 0;
    }

    @Override
    public void ReadyMsg() {
        System.out.println("Ready to dispense fuel");
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Select '8' to dispense 1 liter of " + gType(d) + " gasoline");
        System.out.println("Otherwise, select '9' to stop");

    }

    @Override
    public void PumpGasUnit() {
        DataGasPump2 d = (DataGasPump2) data;

        /*
            Call the subroutine that ACTUALLY pumps gas here
            Now increment the appropriate data values
        */
        d.L++;
        d.total = d.price * d.L;
    }

    @Override
    public void GasPumpedMsg() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Pumped 1 liter of " + gType(d) + " gasoline");
        System.out.println("Total # of liters pumped: " + d.L);
        System.out.println("Select '8' to dispense 1 more liter of " + gType(d) + " gasoline");
        System.out.println("Otherwise, select '9' to stop");
    }

    @Override
    public void StopMsg() {
        System.out.println("Stopping pump ...");
    }

    @Override
    public void PrintReceipt() {
        System.out.println("Printing receipt ...");
        System.out.println("*********************************************************************");
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println(d.L + " liters of " + gType(d) + " gasoline @ $" + d.price + "/liter");
        System.out.println("Total: $" + (float) d.total);
        System.out.println("Cash inserted: $" + d.cash);
        System.out.println("*********************************************************************");
    }

    @Override
    public void ReturnCash() {
        DataGasPump2 d = (DataGasPump2) data;
        float cash_return = d.cash - d.total;
        if (cash_return > 0) {
            System.out.println("Cash to return: $" + cash_return);
            System.out.println("Returning $" + cash_return);
            /*
                Call the subroutine that ACTUALLY returns cash
            */
        } else {
            System.out.println("No cash to return");
        }
        System.out.println("Transaction finished");
        System.out.println("Enter an operation: (1) Start");
    }
    /*
        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ HELPER METHODS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    */

    private String gType(DataGasPump2 d) {
        String type;
        switch (d.gasType) {
            case 3: {
                type = "Regular";
                break;
            }
            case 4: {
                type = "Super";
                break;
            }
            case 5: {
                type = "Premium";
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
