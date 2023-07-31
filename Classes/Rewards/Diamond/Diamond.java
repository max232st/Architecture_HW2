package Classes.Rewards.Diamond;

import Classes.IGameItem;

public class Diamond implements IGameItem {
    @Override
    public void open() {
        System.out.println("Diamond");
    }
}
