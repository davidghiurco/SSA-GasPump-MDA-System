package Model.EFSM;

/*
    State S6 in the EFSM model
 */
class S6 extends State {

    S6(StateMachine model) {
        super(model);
    }

    /*
        Transition to State S0 and call PrintReceipt() and ReturnCash() meta-actions
     */
    @Override
    void receipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().PrintReceipt();
            model.getOP().ReturnCash();
        }
    }

    /*
        Transition to State S0 and call ReturnCash() meta-actions
     */
    @Override
    void noReceipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().ReturnCash();
        }
    }
}
