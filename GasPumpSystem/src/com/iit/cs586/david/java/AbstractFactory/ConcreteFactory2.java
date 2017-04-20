package AbstractFactory;

import ActionStrategy.CancelMsg.CancelMsg;
import ActionStrategy.CancelMsg.CancelMsg2;
import ActionStrategy.DisplayMenu.DisplayMenu;
import ActionStrategy.DisplayMenu.DisplayMenu2;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg2;
import ActionStrategy.PayMsg.PayMsg;
import ActionStrategy.PayMsg.PayMsg2;
import ActionStrategy.PrintReceipt.PrintReceipt;
import ActionStrategy.PrintReceipt.PrintReceipt2;
import ActionStrategy.PumpGasUnit.PumpGasUnit;
import ActionStrategy.PumpGasUnit.PumpGasUnit2;
import ActionStrategy.ReadyMsg.ReadyMsg;
import ActionStrategy.ReadyMsg.ReadyMsg2;
import ActionStrategy.RejectMsg.RejectMsg;
import ActionStrategy.RejectMsg.RejectMsg2;
import ActionStrategy.ReturnCash.ReturnCash;
import ActionStrategy.ReturnCash.ReturnCash2;
import ActionStrategy.SetInitialValues.SetInitialValues;
import ActionStrategy.SetInitialValues.SetInitialValues2;
import ActionStrategy.SetPrice.SetPrice;
import ActionStrategy.SetPrice.SetPrice2;
import ActionStrategy.StopMsg.StopMsg;
import ActionStrategy.StopMsg.StopMsg2;
import ActionStrategy.StoreCash.StoreCash;
import ActionStrategy.StoreCash.StoreCash2;
import ActionStrategy.StoreData.StoreData;
import ActionStrategy.StoreData.StoreData2;
import PlatformData.Data;
import PlatformData.DataGasPump2;
/*
    Factory that produces the necessary driver objects for GasPump2
    Instantiates the proper action strategies with the shared data structure
*/
public class ConcreteFactory2 extends AbstractFactory {
    private Data data;
    public ConcreteFactory2() {
        // Create 1 data structure and pass references to all classes that need it
        data  = new DataGasPump2();

    }
    @Override
    public Data getDataObj() {
        return this.data;
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg2();
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2(this.data);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg2(this.data);
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg2();
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2(this.data);
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit2(this.data);
    }

    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg2(this.data);
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg2();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash2(this.data);
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues2(this.data);
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2(this.data);
    }

    @Override
    public StopMsg getStopMsg() {
        return new StopMsg2();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash2(this.data);
    }

    @Override
    public StoreData getStoreData() {
        return new StoreData2(this.data);
    }

}
