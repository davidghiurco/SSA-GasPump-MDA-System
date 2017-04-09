package AbstractFactory;

import DataStore.Data;
import InputProcessor.InputProcessor;
import Model.StateMachine;
import OutputProcessor.OutputProcessor;

public abstract class AbstractFactory {

    public abstract Data            getData();
    public abstract InputProcessor  getInputProcessor();
    public abstract StateMachine    getStateMachine();
    public abstract OutputProcessor getOutputProcessor();
}
