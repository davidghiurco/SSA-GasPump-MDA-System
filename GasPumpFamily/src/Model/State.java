package Model;

import OutputProcessor.OutputProcessor;

public abstract class State {
    StateMachine model;
    OutputProcessor op;

    public State(StateMachine model, OutputProcessor op) {
        this.model = model;
        this.op = op;
    }

    void activate() {

    }

    void start() {

    }

    /*
        credit: t=1
        cash:   t=2
     */
    void payType(int t) {

    }

    void approved() {

    }

    void rejected() {

    }

    void cancel() {

    }

    void startPump() {

    }

    void pump() {

    }

    void stopPump() {

    }

    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
     */
    void selectGas(int g) {

    }

    void receipt() {

    }

    void noReceipt() {

    }
}
