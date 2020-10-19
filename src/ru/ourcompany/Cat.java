package ru.ourcompany;

public class Cat {
    protected String name;
    protected int needFood;
    protected boolean isFull;

    Cat(String name, int needFood) {
        this.name = name;
        this.needFood = needFood;
    }

    public void eat(Plate plate) {
        this.isFull = plate.eatFromAPlate(needFood, isFull);
    }
}
