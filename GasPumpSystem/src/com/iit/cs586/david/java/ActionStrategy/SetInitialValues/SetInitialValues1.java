package ActionStrategy.SetInitialValues;

import PlatformData.Data;
import PlatformData.DataGasPump1;


/*
    GasPump1 SetInitialValues action responsible for initializing the necessary data structure attributes
    to begin a transaction calculation
 */
public class SetInitialValues1 extends SetInitialValues {

    public SetInitialValues1(Data data) {
        super(data);
    }

    /*
        Set the number of gallons pumped and payment balance initially to zero for this transaction
     */
    @Override
    public void setInitialValues() {
        DataGasPump1 d = (DataGasPump1) data;
        d.G = 0;
        d.total = 0;
    }
}
