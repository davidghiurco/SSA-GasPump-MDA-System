package ActionStrategy.ReturnCash;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 ReturnCash action responsible for returning the outstanding amount of cash (if any)
 */
public class ReturnCash2 extends ReturnCash {

    public ReturnCash2(Data data) {
        super(data);
    }

    /*
        This method first reads the shared data structure to calculate the amount of cash to return
        If there is any amount greater than $0 that is owed to the user, print a message indicating so,
        and return the cash
        Then, reset the data structure "cash" attribute to 0
     */
    @Override
    public void returnCash() {
        DataGasPump2 d = (DataGasPump2) data;
        float cash_return = d.cash - d.total;
        if (cash_return > 0) {
            System.out.println("Cash to return: $" + cash_return);
            System.out.println("Returning $" + cash_return);
        } else {
            System.out.println("No cash to return");
        }
        d.cash = 0;
        System.out.println("Transaction finished");
    }
}
