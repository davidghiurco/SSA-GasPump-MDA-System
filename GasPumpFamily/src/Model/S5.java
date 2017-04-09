package Model;

class S5 extends State {

    S5(StateMachine model) {super(model);}

    @Override
    void pump() {
        if(model.s == model.LS[5]) {
            // stay in the same state
            model.getOP().PumpGasUnit();
            model.getOP().GasPumpedMsg();
        }
    }

    @Override
    void stopPump() {
        if(model.s == model.LS[5]) {
            model.s = model.LS[6];
            model.getOP().StopMsg();
        }
    }
}
