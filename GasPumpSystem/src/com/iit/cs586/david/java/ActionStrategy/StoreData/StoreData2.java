package ActionStrategy.StoreData;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class StoreData2 extends StoreData {

    public StoreData2(Data data) {
        super(data);
    }
    @Override
    public void storeData() {
        DataGasPump2 d = (DataGasPump2) data;
        d.R_price = d.a;
        d.S_price = d.b;
        d.P_price = d.c;
        System.out.println("GasPump2 activated successfully!");
    }
}
