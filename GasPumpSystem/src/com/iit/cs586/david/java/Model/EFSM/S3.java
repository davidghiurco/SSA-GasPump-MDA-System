package Model.EFSM;

/*
    State S3 in the EFSM model
 */
class S3 extends State {

    S3(StateMachine model) {
        super(model);
    }

    /*
        Transition to State S4 and call SetPrice() meta-action
     */
    @Override
    void selectGas(int g) {
        if (model.s == model.LS[3]) {
            model.s = model.LS[4];
            model.getOP().SetPrice(g);
        }
    }

    /*
        Transition to State S0 and call CancelMsg() and ReturnCash() meta-actions
     */
    @Override
    void cancel() {
        if (model.s == model.LS[3]) {
            model.s = model.LS[0];
            model.getOP().CancelMsg();
            model.getOP().ReturnCash();
        }
    }
}
