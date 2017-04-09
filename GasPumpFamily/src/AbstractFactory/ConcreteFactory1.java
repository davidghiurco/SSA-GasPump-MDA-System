package AbstractFactory;

import DataStore.Data;
import DataStore.DataGasPump1;
import InputProcessor.InputProcessor;
import InputProcessor.IPGasPump1;
import Model.StateMachine;
import OutputProcessor.OutputProcessor;
import OutputProcessor.GasPumpOP1;

/*
    Factory that produces the necessary driver objects for GasPump1
*/
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Data getData() {return new DataGasPump1();}

    @Override
    public InputProcessor getInputProcessor() {return new IPGasPump1();}

    @Override
    public StateMachine getStateMachine() {return new StateMachine();}

    @Override
    public OutputProcessor getOutputProcessor() {return new GasPumpOP1();}
}
