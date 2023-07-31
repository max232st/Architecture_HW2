package Classes.Rewards.Medal;

import Classes.IGameItem;

public class Medal implements IGameItem {
    @Override
    public void open() {
        System.out.println("Medal");
    }
}
