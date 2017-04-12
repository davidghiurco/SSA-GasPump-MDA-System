package ActionStrategy.GasPumpedMsg;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class GasPumpedMsg2 extends GasPumpedMsg {

    public GasPumpedMsg2(Data data) {
        super(data);
    }
    @Override
    public void gasPumpedMsg() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Pumped 1 liter of " + d.gasType + " gasoline");
        System.out.println("Total # of liters pumped: " + d.L);
    }
}
