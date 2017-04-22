package ActionStrategy.GasPumpedMsg;

import PlatformData.Data;

/*
    Abstract GasPumpedMsg action strategy
    Groups all "Gas Pumped Message" actions under 1 abstract superclass
 */
public abstract class GasPumpedMsg {
    Data data;
    public GasPumpedMsg(Data data) {
        this.data = data;
    }

    public abstract void gasPumpedMsg();
}
