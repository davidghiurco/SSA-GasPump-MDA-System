package ActionStrategy.StoreCash;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 StoreCash action responsible for updating the shared data structure with the inserted cash amount
    during each transaction
 */
public class StoreCash2 extends StoreCash {

    public StoreCash2(Data data) {
        super(data);
    }

    /*
        Read the temporarily cash information input by the InputProcessor
        and store it in the cash attribute of the shared data structure.
        Then, print the amount of cash that was inserted
     */
    @Override
    public void storeCash() {
        DataGasPump2 d = (DataGasPump2) data;
        d.cash = d.temp_cash;
        System.out.println("Amount of cash inserted: $" + d.cash);
    }
}
