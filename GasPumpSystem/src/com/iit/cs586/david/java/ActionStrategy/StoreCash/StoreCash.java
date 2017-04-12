package ActionStrategy.StoreCash;

import PlatformData.Data;

public abstract class StoreCash {
    Data data;

    public StoreCash() {
    }

    public StoreCash(Data  data) {
        this.data = data;
    }

    public abstract void storeCash();
}
