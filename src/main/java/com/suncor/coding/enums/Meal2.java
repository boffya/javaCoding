package com.suncor.coding.enums;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public enum Meal2 {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;

    Meal2(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }

    public interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO;
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE,
            FRUIT, CREME_CARAMEL;
        }

        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }

    public static void main(String[] args) {
        System.out.println(DateFormat.getDateTimeInstance(0,0).format(new Date()));
        System.out.println(DateFormat.getDateTimeInstance(1,1).format(new Date()));
        System.out.println(DateFormat.getDateTimeInstance(2,2).format(new Date()));
        System.out.println(DateFormat.getDateTimeInstance(3,3).format(new Date()));
        for (int i = 0; i < 10; i++) {
            System.out.println("******");
            for (Meal2 meal2 : Meal2.values()) {
                Food food = meal2.randomSelection();
                System.out.println(food);
            }
        }
    }

}
