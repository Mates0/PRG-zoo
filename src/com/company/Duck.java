package com.company;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, double weight, LocalDate dateofbirth) {
        super(name, weight, dateofbirth);
    }

    public boolean canFly() {
        if (getWeight() <= 1.6)
            return true;
        else
            return false;
    }

    public String makeSound() {
        sound = "kvak";
        return sound;
    }
}
