package Model.EFSM;

/*
    State S4 in the EFSM model
 */
class S4 extends State {

    S4(StateMachine model) {
        super(model);
    }

    /*
        Transition to State S2 and call SetInitialValues() and ReadyMsg() meta-actions
     */
    @Override
    void startPump() {
        if (model.s == model.LS[4]) {
            model.s = model.LS[5];
            model.getOP().SetInitialValues();
            model.getOP().ReadyMsg();
        }
    }
}
