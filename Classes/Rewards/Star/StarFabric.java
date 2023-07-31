package Classes.Rewards.Star;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class StarFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Star();
    }
}
