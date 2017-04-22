package ActionStrategy.StoreCash;

import PlatformData.Data;

/*
    Abstract StoreCash action strategy
    Groups all "Store Cash" actions under 1 abstract superclass
 */
public abstract class StoreCash {
    Data data;

    /*
        GasPump1 constructor (doesn't need the shared data structure)  --> Used by StoreCash1
        Note, GasPump1 should never call this constructor under the current system design
     */
    public StoreCash() {
    }

    /*
        Constructor for GasPump2 --> Used by StoreCash2
        Needs the shared data structure to store information
     */
    public StoreCash(Data  data) {
        this.data = data;
    }

    public abstract void storeCash();
}
