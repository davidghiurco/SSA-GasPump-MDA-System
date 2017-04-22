package Model.EFSM;

/*
    State S5 in the EFSM model
 */
class S5 extends State {

    S5(StateMachine model) {
        super(model);
    }

    /*
        Self-loop (No transition) and call PumpGasUnit() and GasPumpedMsg() meta-actions
     */
    @Override
    void pump() {
        if (model.s == model.LS[5]) {
            // stay in the same state
            model.getOP().PumpGasUnit();
            model.getOP().GasPumpedMsg();
        }
    }

    /*
        Transition to State S6 and call StopMsg() meta-action
     */
    @Override
    void stopPump() {
        if (model.s == model.LS[5]) {
            model.s = model.LS[6];
            model.getOP().StopMsg();
        }
    }
}
