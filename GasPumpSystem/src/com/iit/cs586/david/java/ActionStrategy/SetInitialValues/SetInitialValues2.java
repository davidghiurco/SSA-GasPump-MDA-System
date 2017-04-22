package ActionStrategy.SetInitialValues;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 SetInitialValues action responsible for initializing the necessary data structure attributes
    to begin a transaction calculation
 */
public class SetInitialValues2 extends SetInitialValues {

    public SetInitialValues2(Data data) {
        super(data);
    }

    /*
        Set the number of liters pumped and payment balance initially to zero for this transaction
     */
    @Override
    public void setInitialValues() {
        DataGasPump2 d = (DataGasPump2) data;
        d.L = 0;
        d.total = 0;
    }
}
