package GasPump;

import AbstractFactory.AbstractFactory;
import DataStore.Data;
import InputProcessor.InputProcessor;
import Model.StateMachine;
import OutputProcessor.OutputProcessor;

/*
    This abstract superclass implements the client-side of the Abstract Factory design pattern.
    It provides a constructor which subclasses can use to build up their drivers and necessary objects.

    Each child GasPump class will call this superclass's constructor passing in its own ConcreteFactory
    as the AbstractFactory field.
*/

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

        // Initialize the InputProcessor's Data and StateMachine drivers
        this.ip.    setData(this.data);
        this.ip.    setModel(this.model);

        // Initialize the StateMachine's OutputProcessor
        this.model. setOP(this.op);

        // Initialize OutputProcessor's DataStore to the same one InputProcessor is using
        this.op.    setData(this.data);


    }

    public abstract void printOperations();


    /*
        GETTERS AND SETTERS
    */
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
