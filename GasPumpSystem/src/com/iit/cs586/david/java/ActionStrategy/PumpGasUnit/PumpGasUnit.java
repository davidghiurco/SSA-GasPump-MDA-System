package ActionStrategy.PumpGasUnit;

import PlatformData.Data;

/*
    Abstract PumpGasUnit action strategy
    Groups all "Pump Gas Unit" actions under 1 abstract superclass
 */
public abstract class PumpGasUnit {
    Data data;

    public PumpGasUnit(Data data) {
        this.data = data;
    }

    public abstract void pumpGasUnit();
}
