package com.shgc.aBuilderPattern.assembly;

import com.shgc.aBuilderPattern.implement.ChickenBurger;
import com.shgc.aBuilderPattern.implement.Coke;
import com.shgc.aBuilderPattern.implement.Pepsi;
import com.shgc.aBuilderPattern.implement.VegBurger;

/**
 * Created by make on 10/25/15.
 */
public class MealBuilder {
    public Meal prepareVegBurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNoVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
