package ActionStrategy.DisplayMenu;

import PlatformData.Data;

/*
    Abstract DisplayMenu action strategy
    Groups all "Display Menu" actions under 1 abstract superclass
 */
public abstract class DisplayMenu {
    Data data;

    public DisplayMenu(Data data) {
        this.data = data;
    }

    public abstract void displayMenu();

}
