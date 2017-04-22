package ActionStrategy.PrintReceipt;

import PlatformData.Data;

/*
    Abstract PrintReceipt action strategy
    Groups all "Print Receipt" actions under 1 abstract superclass
 */
public abstract class PrintReceipt {
    Data data;

    public PrintReceipt(Data data) {
        this.data = data;
    }

    public abstract void printReceipt();
}
