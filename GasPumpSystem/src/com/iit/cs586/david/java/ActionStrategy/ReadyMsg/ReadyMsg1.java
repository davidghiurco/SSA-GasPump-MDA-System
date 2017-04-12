package ActionStrategy.ReadyMsg;

import PlatformData.Data;
import PlatformData.DataGasPump1;

public class ReadyMsg1 extends ReadyMsg {

    public ReadyMsg1(Data data) {
        super(data);
    }

    @Override
    public void readyMsg() {
        System.out.println("READY TO DISPENSE FUEL");
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Select (9) to dispense 1 gallon of " + d.gasType + " gasoline");
        System.out.println("Otherwise, select (x) to stop");
    }
}
