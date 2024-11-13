
import java.util.*;

class Item{
    int weight;
    int value;

    Item(int weight , int value){
        this.weight = weight;
        this.value = value;
    }
}


public class FractionalKnapsack {

    static double getMaxValue(Item[] items,int capacity){

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value/o1.weight;
                double r2 = (double) o2.value/o2.weight;
                return Double.compare(r2,r1);
            }
        });

        double totalValue = 0.0;
        for(Item item : items){
            if(capacity>0 &&  item.weight<=capacity){
                capacity -= item.weight;
                totalValue += item.value;
            } else{
                double fraction = ((double) capacity/item.weight);
                totalValue += (item.value * fraction);
                capacity = 0;
                break;
            }
        }

        return totalValue;
    }
    public static void main(String[] args) {
        Item1[] items = { new Item(10, 60), new Item(20, 100), new Item(30, 120) };
        int capacity = 30;

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack = " + maxValue);
    }

}
