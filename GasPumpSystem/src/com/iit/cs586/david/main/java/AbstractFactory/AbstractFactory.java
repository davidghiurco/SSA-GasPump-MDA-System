package AbstractFactory;

import DataStore.Data;
import InputProcessor.InputProcessor;
import Model.StateMachine;
import OutputProcessor.OutputProcessor;

/*
    This class groups all ConcreteFactory classes under 1 abstract superclass
    Also important part of the Abstract Factory design pattern
*/
public abstract class AbstractFactory {

    public abstract Data getData();

    public abstract InputProcessor getInputProcessor();

    public abstract StateMachine getStateMachine();

    public abstract OutputProcessor getOutputProcessor();
}
