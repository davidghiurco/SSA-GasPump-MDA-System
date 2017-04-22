package ActionStrategy.PumpGasUnit;

import PlatformData.Data;
import PlatformData.DataGasPump1;

/*
    GasPump1 PumpGasUnit action responsible for pumping a gallon of gas
 */
public class PumpGasUnit1 extends PumpGasUnit {

    public PumpGasUnit1(Data data) {
        super(data);
    }

    /*
        Read and update the appropriate data structure attributes that correspond to
        pumping a gallon of gas
     */
    @Override
    public void pumpGasUnit() {
        DataGasPump1 d = (DataGasPump1) data;
        /*
            Call the subroutine that ACTUALLY pumps gas here
            Now increment the appropriate data values
        */
        d.G++;
        d.total = d.price * d.G;
    }
}
