package Model.OutputProcessor;

import AbstractFactory.AbstractFactory;
import ActionStrategy.PayMsg.PayMsg;
import ActionStrategy.PumpGasUnit.PumpGasUnit;
import ActionStrategy.StopMsg.StopMsg;
import ActionStrategy.StoreCash.StoreCash;
import ActionStrategy.CancelMsg.CancelMsg;
import ActionStrategy.DisplayMenu.DisplayMenu;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg;
import ActionStrategy.PrintReceipt.PrintReceipt;
import ActionStrategy.ReadyMsg.ReadyMsg;
import ActionStrategy.RejectMsg.RejectMsg;
import ActionStrategy.ReturnCash.ReturnCash;
import ActionStrategy.SetInitialValues.SetInitialValues;
import ActionStrategy.SetPrice.SetPrice;
import ActionStrategy.StoreData.StoreData;
import PlatformData.Data;

/*
    This class performs the platform independent actions of the meta-model. It calls the
    specific GasPump implementation of these actions
*/
public class OutputProcessor {
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private StoreData storeData;

    public OutputProcessor(AbstractFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.readyMsg = af.getReadyMsg();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPrice = af.getSetPrice();
        this.stopMsg = af.getStopMsg();
        this.storeCash = af.getStoreCash();
        this.storeData = af.getStoreData();
    }

    /*
        Meta-actions (implemented using Strategy pattern
    */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g) {
        this.setPrice.setPrice(g);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StoreData() {
        this.storeData.storeData();
    }

}
