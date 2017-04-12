package ActionStrategy.GasPumpedMsg;

import PlatformData.Data;
import PlatformData.DataGasPump1;

public class GasPumpedMsg1 extends GasPumpedMsg {

    public GasPumpedMsg1(Data data) {
        super(data);
    }

    @Override
    public void gasPumpedMsg() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Pumped 1 gallon of " + d.gasType + " gasoline");
        System.out.println("Total # of gallons pumped: " + d.G);
    }

}
