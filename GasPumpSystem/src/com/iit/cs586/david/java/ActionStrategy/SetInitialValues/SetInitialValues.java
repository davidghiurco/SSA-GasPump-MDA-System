package ActionStrategy.SetInitialValues;

import PlatformData.Data;

/*
    Abstract SetInitialValues action strategy
    Groups all "Set Initial Values" actions under 1 abstract superclass
 */
public abstract class SetInitialValues {
    Data data;

    public SetInitialValues(Data data) {
        this.data = data;
    }

    public abstract void setInitialValues();
}
