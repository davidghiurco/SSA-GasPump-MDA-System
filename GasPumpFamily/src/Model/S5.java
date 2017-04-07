package Model;

import OutputProcessor.OutputProcessor;

class S5 extends State {

    S5(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void pump() {
        if(model.s == model.LS[5]) {
            // stay in the same state
            op.PumpGasUnit();
            op.GasPumpedMsg();
        }
    }

    @Override
    void stopPump() {
        if(model.s == model.LS[5]) {
            model.s = model.LS[6];
            op.StopMsg();
        }
    }
}
