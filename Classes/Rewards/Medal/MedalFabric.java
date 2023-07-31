package Classes.Rewards.Medal;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class MedalFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Medal();
    }
}
