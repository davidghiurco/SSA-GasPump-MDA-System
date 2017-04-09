package Model;

class S4 extends State {

    S4(StateMachine model) {super(model);}

    @Override
    void startPump() {
        if(model.s == model.LS[4]) {
            model.s = model.LS[5];
            model.getOP().SetInitialValues();
            model.getOP().ReadyMsg();
        }
    }
}
