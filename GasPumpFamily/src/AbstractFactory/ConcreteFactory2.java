package AbstractFactory;

import DataStore.Data;
import DataStore.DataGasPump2;
import InputProcessor.InputProcessor;
import InputProcessor.IPGasPump2;
import Model.StateMachine;
import OutputProcessor.OutputProcessor;
import OutputProcessor.GasPumpOP2;

/*
    Factory that produces the necessary driver objects for GasPump1
*/
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Data getData() {return new DataGasPump2();}

    @Override
    public InputProcessor getInputProcessor() {return new IPGasPump2();}

    @Override
    public StateMachine getStateMachine() {return new StateMachine();}

    @Override
    public OutputProcessor getOutputProcessor() {return new GasPumpOP2();}
}
