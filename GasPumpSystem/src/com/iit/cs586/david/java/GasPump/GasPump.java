package GasPump;

import AbstractFactory.AbstractFactory;
import Model.EFSM.StateMachine;
import Model.OutputProcessor.OutputProcessor;
import PlatformData.Data;

/*
    This abstract superclass implements the client-side of the Abstract Factory design pattern.
    It provides a constructor which subclasses can use to build up their drivers and necessary objects.

    Each child GasPump class will call this superclass's constructor passing in its own ConcreteFactory
    as the AbstractFactory field. The ConcreteFactory class makes sure each returned object has the proper
    object references
*/

public abstract class GasPump {
    Data data;
    StateMachine model;


    GasPump(AbstractFactory af) {
        this.data = af.getDataObj();
        this.model = new StateMachine();
        this.model.setOP(new OutputProcessor(af));
    }

    public abstract void printOperations();

}
