package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addiIem(Item item) {
        itemList.add(item);
    }

    public double getCost() {
        double cost = 0.0;

        for (Item item: itemList) {
        cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item: itemList) {
            System.out.println("Item " + item.name());
            System.out.println(", Packing " + item.packing().pack());
            System.out.println(", Price " + item.price());
        }
    }
}
