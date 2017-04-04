package Model;

class S2 extends State {

    S2(StateMachine model) {super(model);}

    boolean approved() {
        model.s = model.LS[3];
        return true;
    }

    boolean rejected() {
        model.s = model.LS[0];
        return true;
    }
}
