package Model.OutputProcessor;

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
    This class is the abstract superclass in the Strategy design pattern
    This OutputProcessor is instantiated by the appropriate ConcreteFactory for each GasPump.
    Its meta-action attributes are set to the appropriate GasPump-specific actions
    according to the Strategy pattern by the correct ConcreteFactory for each GasPump.
*/
public class OutputProcessor {
    private Data data;
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

    public OutputProcessor() {
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



    /*
        GETTERS AND SETTERS
    */


    public Data getData() {
        return data;
    }

    public void setCancelMsg(CancelMsg cancelMsg) {
        this.cancelMsg = cancelMsg;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setDisplayMenu(DisplayMenu displayMenu) {
        this.displayMenu = displayMenu;
    }

    public void setGasPumpedMsg(GasPumpedMsg gasPumpedMsg) {
        this.gasPumpedMsg = gasPumpedMsg;
    }

    public void setPayMsg(PayMsg payMsg) {
        this.payMsg = payMsg;
    }

    public void setPrintReceipt(PrintReceipt printReceipt) {
        this.printReceipt = printReceipt;
    }

    public void setPumpGasUnit(PumpGasUnit pumpGasUnit) {
        this.pumpGasUnit = pumpGasUnit;
    }

    public void setReadyMsg(ReadyMsg readyMsg) {
        this.readyMsg = readyMsg;
    }

    public void setRejectMsg(RejectMsg rejectMsg) {
        this.rejectMsg = rejectMsg;
    }

    public void setReturnCash(ReturnCash returnCash) {
        this.returnCash = returnCash;
    }

    public void setSetInitialValues(SetInitialValues setInitialValues) {
        this.setInitialValues = setInitialValues;
    }

    public void setSetPrice(SetPrice setPrice) {
        this.setPrice = setPrice;
    }

    public void setStopMsg(StopMsg stopMsg) {
        this.stopMsg = stopMsg;
    }

    public void setStoreCash(StoreCash storeCash) {
        this.storeCash = storeCash;
    }

    public void setStoreData(StoreData storeData) {
        this.storeData = storeData;
    }

}
