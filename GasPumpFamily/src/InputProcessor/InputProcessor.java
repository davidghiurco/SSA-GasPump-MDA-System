package InputProcessor;

import Model.StateMachine;
import DataStore.Data;

/*
    This class groups all platform input processors under 1 abstract superclass
*/
public abstract class InputProcessor {
    Data data;
    StateMachine model;

    public InputProcessor() {}

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public StateMachine getModel() {
        return model;
    }

    public void setModel(StateMachine model) {
        this.model = model;
    }


}
