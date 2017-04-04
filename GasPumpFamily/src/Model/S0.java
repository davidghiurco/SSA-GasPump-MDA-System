package Model;

import OutputProcessor.OutputProcessor;

class S0 extends State {

    S0(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void start() {
        if (model.s == model.LS[0]) {
            model.s = model.LS[1];
            op.PayMsg();
        }

    }
}
