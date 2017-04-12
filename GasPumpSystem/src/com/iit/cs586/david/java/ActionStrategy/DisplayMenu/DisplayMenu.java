package ActionStrategy.DisplayMenu;

import PlatformData.Data;

public abstract class DisplayMenu {
    Data data;

    public DisplayMenu(Data data) {
        this.data = data;
    }

    public abstract void displayMenu();

    public Data getData() {
        return data;
    }
}
