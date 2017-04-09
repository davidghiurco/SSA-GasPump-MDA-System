package GasPump;

import AbstractFactory.AbstractFactory;
import DataStore.Data;
import InputProcessor.InputProcessor;
import Model.StateMachine;
import OutputProcessor.OutputProcessor;

public abstract class GasPump {
    private Data            data;
    private InputProcessor  ip;
    private StateMachine    model;
    private OutputProcessor op;
    private AbstractFactory af;

    public GasPump(AbstractFactory af) {
        this.data   = af.getData();
        this.ip     = af.getInputProcessor();
        this.model  = af.getStateMachine();
        this.op     = af.getOutputProcessor();
        this.af     = af;
        this.ip.    setData(this.data);
        this.model. setOP(this.op);
        this.op.    setData(this.data);
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public InputProcessor getIP() {
        return ip;
    }

    public void setIP(InputProcessor ip) {
        this.ip = ip;
    }

    public StateMachine getModel() {
        return model;
    }

    public void setModel(StateMachine model) {
        this.model = model;
    }

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    public AbstractFactory getAF() {
        return af;
    }

    public void setAF(AbstractFactory af) {
        this.af = af;
    }

}
