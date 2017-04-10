package OutputProcessor;

import DataStore.Data;

/*
    This class is the abstract superclass in the Strategy design pattern
    Also provides the method declarations that each platform-dependent OutputProcessor will implement
*/
public abstract class OutputProcessor {
    Data data;

    public OutputProcessor() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    // Each of these methods to be over-written by each child OutputProcessor subclass
    public abstract void StoreData();

    public abstract void PayMsg();

    public abstract void StoreCash();

    public abstract void RejectMsg();

    public abstract void DisplayMenu();

    public abstract void CancelMsg();

    public abstract void SetPrice(int g);

    public abstract void SetInitialValues();

    public abstract void ReadyMsg();

    public abstract void PumpGasUnit();

    public abstract void GasPumpedMsg();

    public abstract void StopMsg();

    public abstract void PrintReceipt();

    public abstract void ReturnCash();
}
