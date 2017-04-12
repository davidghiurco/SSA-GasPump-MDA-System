package AbstractFactory;

import PlatformData.Data;
import InputProcessor.InputProcessor;
import Model.EFSM.StateMachine;
import Model.OutputProcessor.OutputProcessor;

/*
    This class groups all ConcreteFactory classes under 1 abstract superclass
    It defines the method that returns a GasPump specific component

*/
public abstract class AbstractFactory {

    public abstract Data getDataObj();

    public abstract InputProcessor getInputProcessor();

    public abstract StateMachine getStateMachine();

    public abstract OutputProcessor getOutputProcessor();

}