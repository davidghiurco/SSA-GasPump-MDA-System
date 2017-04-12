package ActionStrategy.PumpGasUnit;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class PumpGasUnit2 extends PumpGasUnit {

    public PumpGasUnit2(Data data) {
        super(data);
    }
    @Override
    public void pumpGasUnit() {
        DataGasPump2 d = (DataGasPump2) data;

        /*
            Call the subroutine that ACTUALLY pumps gas here
            Now increment the appropriate data values
        */
        d.L++;
        d.total = d.price * d.L;
    }
}
