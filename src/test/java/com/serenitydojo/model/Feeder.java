package com.serenitydojo.model;

import org.hamcrest.core.Is;

public class Feeder {

    public FoodType feeds(AnimalType animal,Boolean IsPremium) {
        switch (animal) {
            case CAT:
                return (IsPremium) ? FoodType.SALMON:FoodType.TUNA;
            case DOG:
                return (IsPremium) ? FoodType.DELUXE_DOG_FOOD: FoodType.DOG_FOOD;
            case HAMSTER:
                return (IsPremium) ? FoodType.CABBAGE:FoodType.Lettuce;

            default:
                return FoodType.UNKNOWN;
        }
    }
    }

