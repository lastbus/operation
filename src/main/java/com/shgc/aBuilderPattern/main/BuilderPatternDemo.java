package com.shgc.aBuilderPattern.main;

import com.shgc.aBuilderPattern.assembly.Meal;
import com.shgc.aBuilderPattern.assembly.MealBuilder;

/**
 * Created by make on 10/25/15.
 */
public class BuilderPatternDemo {
    public static void main(String args[]){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegBurger();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal noVegMeal = mealBuilder.prepareNoVegMeal();
        System.out.println("\n\n\nNo-Veg Meal");
        noVegMeal.showItem();
        System.out.println("Total cost: " + noVegMeal.getCost());
    }
}
