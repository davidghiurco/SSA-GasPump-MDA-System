package Model;

import OutputProcessor.OutputProcessor;

class S2 extends State {

    S2(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void approved() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[3];
            op.DisplayMenu();
        }
    }

    @Override
    void rejected() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[0];
            op.RejectMsg();
        }
    }
}
