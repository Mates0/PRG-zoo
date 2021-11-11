package com.company;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected double weight;
    protected LocalDate dateofbirth;
    protected String sound;

    public Animal(String name, double weight, LocalDate dateofbirth) {
        this.name = name;
        this.weight = weight;
        this.dateofbirth = dateofbirth;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double eat(double input) {
        setWeight(getWeight() + input);
        return getWeight();
    }

    public double poop(double input) {
        setWeight(getWeight() - input);
        return getWeight();
    }

    public String makeSound() {
        return sound;
    }
}
