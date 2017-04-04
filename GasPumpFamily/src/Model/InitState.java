package Model;

import OutputProcessor.OutputProcessor;

class InitState extends State {

    InitState(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void activate() {
        if (model.s == model.LS[7]) {
            model.s = model.LS[0];
            op.StoreData();
        }
    }
}
