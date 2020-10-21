package ru.ourcompany;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Vasya", 9),
                new Cat("Mila", 3)
        };
        Plate plate = new Plate(15);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        checkCat(cats);

        plate.addFood(5);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        checkCat(cats);

    }

    public static void checkCat(Cat[] cats) {
        for (Cat cat : cats) {
            if (cat.isFull) {
                System.out.println("Кот " + cat.name + " сыт");
            } else {
                System.out.println("Кот " + cat.name + " голоден");
            }
        }
    }
}
