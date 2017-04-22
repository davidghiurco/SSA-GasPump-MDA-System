package ActionStrategy.GasPumpedMsg;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 GasPumped action responsible for printing a message that gasoline has been pumped
 */
public class GasPumpedMsg2 extends GasPumpedMsg {

    public GasPumpedMsg2(Data data) {
        super(data);
    }

    /*
        Print a a message informing the user that 1 liter of gasoline
        has been pumped. Also display the total number of liters pumped.
     */
    @Override
    public void gasPumpedMsg() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Pumped 1 liter of " + d.gasType + " gasoline");
        System.out.println("Total # of liters pumped: " + d.L);
    }
}
