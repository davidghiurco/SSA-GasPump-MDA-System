package ActionStrategy.StoreData;

import PlatformData.Data;

/*
    Abstract StoreData action strategy
    Groups all "Store Data" actions under 1 abstract superclass
 */
public abstract class StoreData {
    Data data;

    public StoreData(Data data) {
        this.data = data;
    }

    public abstract void storeData();
}
