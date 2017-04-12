package ActionStrategy.ReturnCash;

import PlatformData.Data;

public abstract class ReturnCash {
    Data data;

    public ReturnCash() {
    }

    public ReturnCash(Data data) {
        this.data = data;
    }

    public abstract void returnCash();
}
