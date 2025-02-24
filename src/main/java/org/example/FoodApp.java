package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodApp {
    public static void main(String[] args) {
        ArrayList<Food> items = new ArrayList<>();
        System.out.println("Welcome to Just App");
        System.out.println("You Order....");
        //Add some items burgers, pizza, fries and salad...
        Burger cheeseBurger = new Burger("cheeseBurger",1.99, "Tasty");
        Pizza Chicken = new Pizza("Pizza",6.99,"Make the right choice");
        Fries curry = new Fries("Curry",3.50,"Not Healthy go to the gym");

        items.add(cheeseBurger);
        items.add(Chicken);


        for(Food item : items){

            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
        }
    }
}
