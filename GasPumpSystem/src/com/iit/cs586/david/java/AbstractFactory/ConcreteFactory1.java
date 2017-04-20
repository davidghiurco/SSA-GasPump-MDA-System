package AbstractFactory;

import ActionStrategy.CancelMsg.CancelMsg;
import ActionStrategy.DisplayMenu.DisplayMenu;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg;
import ActionStrategy.PayMsg.PayMsg;
import ActionStrategy.PrintReceipt.PrintReceipt;
import ActionStrategy.PumpGasUnit.PumpGasUnit;
import ActionStrategy.ReadyMsg.ReadyMsg;
import ActionStrategy.RejectMsg.RejectMsg;
import ActionStrategy.ReturnCash.ReturnCash;
import ActionStrategy.SetInitialValues.SetInitialValues;
import ActionStrategy.SetPrice.SetPrice;
import ActionStrategy.StopMsg.StopMsg;
import ActionStrategy.StoreCash.StoreCash;
import ActionStrategy.StoreData.StoreData;
import ActionStrategy.CancelMsg.CancelMsg1;
import ActionStrategy.DisplayMenu.DisplayMenu1;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg1;
import ActionStrategy.PayMsg.PayMsg1;
import ActionStrategy.PrintReceipt.PrintReceipt1;
import ActionStrategy.PumpGasUnit.PumpGasUnit1;
import ActionStrategy.ReadyMsg.ReadyMsg1;
import ActionStrategy.RejectMsg.RejectMsg1;
import ActionStrategy.ReturnCash.ReturnCash1;
import ActionStrategy.SetInitialValues.SetInitialValues1;
import ActionStrategy.SetPrice.SetPrice1;
import ActionStrategy.StopMsg.StopMsg1;
import ActionStrategy.StoreCash.StoreCash1;
import ActionStrategy.StoreData.StoreData1;
import PlatformData.Data;
import PlatformData.DataGasPump1;
/*
    Factory that produces the necessary driver objects for GasPump1
    Instantiates the proper action strategies with the shared data structure
*/
public class ConcreteFactory1 extends AbstractFactory {
    private Data data;

    public ConcreteFactory1() {
        // Create 1 data structure and pass references to all classes that need it
        this.data  = new DataGasPump1();
    }

    @Override
    public Data getDataObj() {
        return this.data;
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1(this.data);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg1(this.data);
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg1();
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1(this.data);
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit1(this.data);
    }

    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg1(this.data);
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg1();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash1();
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues1(this.data);
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice1(this.data);
    }

    @Override
    public StopMsg getStopMsg() {
        return new StopMsg1();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash1();
    }

    @Override
    public StoreData getStoreData() {
        return new StoreData1(this.data);
    }
}
