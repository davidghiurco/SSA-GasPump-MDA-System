package AbstractFactory;

import InputProcessor.IPGasPump1;
import InputProcessor.InputProcessor;
import Model.EFSM.StateMachine;
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
import Model.OutputProcessor.OutputProcessor;
import PlatformData.Data;
import PlatformData.DataGasPump1;


/*
    Factory that produces the necessary driver objects for GasPump1
*/
public class ConcreteFactory1 extends AbstractFactory {
    private DataGasPump1 data;
    private IPGasPump1 ip;
    private StateMachine model;
    private OutputProcessor op;

    public ConcreteFactory1() {
        // create the 4 core objects that a GasPump needs
        data  = new DataGasPump1();
        ip    = new IPGasPump1();
        model = new StateMachine();
        op    = new OutputProcessor();

        // InputProcessor and OutputProcessor share the same data structure
        ip.setData(data);
        op.setData(data);

        // set the InputProcessor's model object reference
        ip.setModel(model);

        // set the OutputProcessor's action strategies to GasPump1 specific actions
        // and also pass in the shared Data structure to actions that need it
        op.setCancelMsg         (new CancelMsg1());
        op.setDisplayMenu       (new DisplayMenu1(data));
        op.setGasPumpedMsg      (new GasPumpedMsg1(data));
        op.setPayMsg            (new PayMsg1());
        op.setPrintReceipt      (new PrintReceipt1(data));
        op.setPumpGasUnit       (new PumpGasUnit1(data));
        op.setReadyMsg          (new ReadyMsg1(data));
        op.setRejectMsg         (new RejectMsg1());
        op.setReturnCash        (new ReturnCash1());
        op.setSetInitialValues  (new SetInitialValues1(data));
        op.setSetPrice          (new SetPrice1(data));
        op.setStopMsg           (new StopMsg1());
        op.setStoreCash         (new StoreCash1());
        op.setStoreData         (new StoreData1(data));

        // set the EFSM model's OutputProcessor's object reference
        model.setOP(op);
    }

    @Override
    public Data getDataObj() {
        return this.data;
    }

    @Override
    public InputProcessor getInputProcessor() {
        return this.ip;
    }

    @Override
    public StateMachine getStateMachine() {
        return this.model;
    }

    @Override
    public OutputProcessor getOutputProcessor() {
        return this.op;
    }
}
