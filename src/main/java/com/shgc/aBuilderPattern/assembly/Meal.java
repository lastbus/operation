package com.shgc.aBuilderPattern.assembly;

import com.shgc.aBuilderPattern.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class Meal {
    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : list){
            cost += item.price();
        }
        return  cost;
    }

    public void showItem(){
        for (Item item : list){
            System.out.print("Item : " + item.name());
            System.out.print(", Packing + " + item.packing());
            System.out.println(", Price : " + item.price());
        }
    }
}
