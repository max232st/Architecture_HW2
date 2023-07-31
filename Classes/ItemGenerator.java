package Classes;

// Абстактный класс ля фабрики наград

public abstract class ItemGenerator {
    public void openReward()
    {
        IGameItem gameItem = createItem();
        gameItem.open();

    }

    public abstract IGameItem createItem();
}
