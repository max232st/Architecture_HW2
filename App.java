import java.util.ArrayList;
import java.util.List;

import Classes.ItemGenerator;
import Classes.Rewards.Diamond.DiamondFabric;
import Classes.Rewards.Gem.GemFabric;
import Classes.Rewards.Gold.GoldFabric;
import Classes.Rewards.Medal.MedalFabric;
import Classes.Rewards.Ring.RingFabric;
import Classes.Rewards.Star.StarFabric;

// создание экземпляров наград и добавление в список

public class App {
    public static void main(String[] args)  {
        ItemGenerator fab1 = new GoldFabric();
        ItemGenerator fab2 = new GemFabric();
        ItemGenerator fab3 = new RingFabric();
        ItemGenerator fab4 = new StarFabric();
        ItemGenerator fab5 = new MedalFabric();
        ItemGenerator fab6 = new DiamondFabric();


        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);

        // рандомный вывод наград из списка

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * fabricList.size()) ;
            fabricList.get(index).openReward();
        }
    }

}