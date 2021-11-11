package com.company;

import java.time.LocalDate;

public class Cat extends Animal{
    protected int numberOfLives;

    public Cat(String name, double weight, LocalDate dateofbirth, int numberOfLives) {
        super(name, weight, dateofbirth);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int fall() {
        setNumberOfLives(getNumberOfLives() - 1);
        return getNumberOfLives();
    }

    public String makeSound() {
        sound = "mnau";
        return sound;
    }
}
