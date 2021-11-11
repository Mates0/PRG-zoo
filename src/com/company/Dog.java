package com.company;

import java.time.LocalDate;

public class Dog extends Animal{
    protected boolean collar;

    public Dog(String name, double weight, LocalDate dateofbirth, boolean collar) {
        super(name, weight, dateofbirth);
        this.collar = collar;
    }

    public boolean isCollar() {
        return collar;
    }

    public String makeSound() {
        sound = "haf";
        return sound;
    }
}
