package ActionStrategy.StoreData;

import PlatformData.Data;
import PlatformData.DataGasPump1;

public class StoreData1 extends StoreData {

    public StoreData1(Data data) {
        super(data);
    }
    @Override
    public void storeData() {
        DataGasPump1 d = (DataGasPump1) data;
        d.R_price = d.a;
        d.S_price = d.b;
        System.out.println("GasPump1 activated successfully!");
    }
}
