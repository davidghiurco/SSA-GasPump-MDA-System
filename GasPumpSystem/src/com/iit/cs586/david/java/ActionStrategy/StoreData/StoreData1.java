package ActionStrategy.StoreData;

import PlatformData.Data;
import PlatformData.DataGasPump1;

/*
    GasPump1 StoreData action responsible for storing the "a" and "b" price parameters specified by
    method "Activate" of the InputProcessor for GasPump1
 */
public class StoreData1 extends StoreData {

    public StoreData1(Data data) {
        super(data);
    }

    /*
        Read the temporary variables "a" and "b" and initialize the gas prices of the system accordingly
     */
    @Override
    public void storeData() {
        DataGasPump1 d = (DataGasPump1) data;
        d.R_price = d.a;
        d.S_price = d.b;
        System.out.println("GasPump1 activated successfully!");
    }
}
