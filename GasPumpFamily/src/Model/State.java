package Model;

/*
    This class is the abstract State superclass in the De-centralized State Design Pattern

    Methods not declared abstract so that each State subclass doesn't have to
    implement methods that it doesn't need.
    Most State Subclasses only overwrite a couple of these methods.

    The other methods that are inherited work as intended because
    if they are somehow called from a State which has not re-defined their empty body, nothing
    will happen.
*/

public abstract class State {
    StateMachine model;

    public State(StateMachine model) {
        this.model = model;
    }

    void activate() {}

    void start() {}

    /*
        credit: t=1
        cash:   t=2
     */
    void payType(int t) {}

    void approved() {}

    void rejected() {}

    void cancel() {}

    void startPump() {}

    void pump() {}

    void stopPump() {}

    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
     */
    void selectGas(int g) {}

    void receipt() {}

    void noReceipt() {}
}
