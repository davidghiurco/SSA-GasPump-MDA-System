package InputProcessor;

import Model.StateMachine;
import DataStore.Data;

public abstract class InputProcessor {
    StateMachine model;
    Data data;

    public InputProcessor(StateMachine model, Data data) {
        this.model = model;
        this.data = data;
    }

}
