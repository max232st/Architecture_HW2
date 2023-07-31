package Classes.Rewards.Gem;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class GemFabric extends ItemGenerator  {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}