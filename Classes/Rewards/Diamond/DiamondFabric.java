package Classes.Rewards.Diamond;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class DiamondFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Diamond();
    }
}
