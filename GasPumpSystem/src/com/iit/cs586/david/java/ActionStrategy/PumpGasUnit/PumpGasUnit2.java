package ActionStrategy.PumpGasUnit;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 PumpGasUnit action responsible for pumping a liter of gas
 */
public class PumpGasUnit2 extends PumpGasUnit {

    public PumpGasUnit2(Data data) {
        super(data);
    }

    /*
        Read and update the appropriate data structure attributes that correspond to
        pumping a liter of gas
     */
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
