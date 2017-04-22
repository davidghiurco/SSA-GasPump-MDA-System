package ActionStrategy.ReadyMsg;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 ReadyMsg action responsible for printing a ready message
 */
public class ReadyMsg2 extends ReadyMsg {

    public ReadyMsg2(Data data) {
        super(data);
    }

    /*
        Print a message indicating the GasPump is ready to dispense 1 litera
        of the selected type of gasoline
     */
    @Override
    public void readyMsg() {
        System.out.println("READY TO DISPENSE FUEL");
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Select (8) to dispense 1 liter of " + d.gasType + " gasoline");
        System.out.println("Otherwise, select (9) to stop");
    }
}
