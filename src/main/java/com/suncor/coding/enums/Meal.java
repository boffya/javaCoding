package com.suncor.coding.enums;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class Meal {
    public static void main(String[] args) {
        ExecutorService executor =  Executors.newFixedThreadPool(4);
        ExecutorService executor1 = Executors.newScheduledThreadPool(5);


        List<Integer> list = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        list.listIterator().remove();
        System.out.println("linked:"+test(linked));
        System.out.println("array:"+test(list));
        System.out.println("linked:"+test2(linked));
        System.out.println("array:"+test2(list));
        for (int i = 0; i < 5; i++) {
            Course c = Course.APPETIZER;
            for (Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("***");
        }
    }

    public static long test(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static long test2(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.set(5000000,i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
