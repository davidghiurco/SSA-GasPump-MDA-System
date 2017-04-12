package ActionStrategy.ReturnCash;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class ReturnCash2 extends ReturnCash {

    public ReturnCash2(Data data) {
        super(data);
    }

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
        System.out.println("Transaction finished");
    }
}
