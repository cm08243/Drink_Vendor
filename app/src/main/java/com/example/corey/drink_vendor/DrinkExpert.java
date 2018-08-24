package com.example.corey.drink_vendor;
import java.util.ArrayList;
import java.util.List;


public class DrinkExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();

        if (color.equals("Soda")) {
            brands.add("coke");
            brands.add("pepsi");
            brands.add("Mountain dew");
            brands.add("Dr pepper");
            brands.add("Root beer");

        }
        else if (color.equals("Juice")){
            brands.add("orange juice");
            brands.add("apple juice");
            brands.add("grape juice");
        }
        else if(color.equals("Tea")){
            brands.add("green tea");
            brands.add("iced tea");
            brands.add("earl grea tea");
        }
        else if (color.equals("Energy Drink")){
            brands.add("Red bull");
            brands.add("Monster");
        }
        return brands;
    }



}