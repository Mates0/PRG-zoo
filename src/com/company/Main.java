package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat fatto = new Cat("Kitty", 5, LocalDate.of(2018,12,12), 9);
        Cat slimmo = new Cat("Jack", 1, LocalDate.of(2020,5,10), 1);
        fatto.fall();
        System.out.println(fatto.getNumberOfLives());

        Dog bruno = new Dog("Bruno",10, LocalDate.of(2006,2,2), true);
        System.out.println(bruno.isCollar());

        Duck donald = new Duck("Donald",2, LocalDate.of(2021,1,8));
        System.out.println(donald.canFly());
        donald.poop(0.8);
        System.out.println(donald.canFly());

        ArrayList<Animal> arr = new ArrayList<>();
        arr.add(fatto);
        arr.add(bruno);
        arr.add(donald);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).makeSound());
        }
    }
}
