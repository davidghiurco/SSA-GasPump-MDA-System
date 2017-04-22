package ActionStrategy.StoreData;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 StoreData action responsible for storing the "a", "b", and "c"  price parameters specified by
    method "Activate" of the InputProcessor for GasPump2
 */
public class StoreData2 extends StoreData {

    public StoreData2(Data data) {
        super(data);
    }

    /*
        Read the temporary variables "a", "b", and "c"  and initialize the gas prices of the system accordingly
     */
    @Override
    public void storeData() {
        DataGasPump2 d = (DataGasPump2) data;
        d.R_price = d.a;
        d.S_price = d.b;
        d.P_price = d.c;
        System.out.println("GasPump2 activated successfully!");
    }
}
