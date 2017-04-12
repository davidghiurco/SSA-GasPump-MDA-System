package ActionStrategy.StoreCash;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class StoreCash2 extends StoreCash {

    public StoreCash2(Data data) {
        super(data);
    }

    @Override
    public void storeCash() {
        DataGasPump2 d = (DataGasPump2) data;
        d.cash = d.temp_cash;
        System.out.println("Amount of cash inserted: $" + d.cash);
    }
}
