package Model;

class S0 extends State {

    S0(StateMachine model) {super(model);}

    void start() {
        if (model.s == model.LS[0]) model.s = model.LS[1];
    }
}
