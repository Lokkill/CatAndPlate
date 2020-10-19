package ru.ourcompany;

public class Plate {
    protected static int foodIn;

    Plate(int foodIn) {
        Plate.foodIn = foodIn;
    }

    public boolean eatFromAPlate(int countFood, boolean isFull) {
        if (isFull) return true; // Если кот сыт - он не будет есть
        if (foodIn >= countFood) {
            foodIn -= countFood;
            return true;
        } else {
            System.out.println("В тарелке закончилась еда!");
            return false;
        }
    }

    public void addFood(int countFood) {
        if (countFood > 0) foodIn += countFood;
        System.out.println("В тарелку добавили " + countFood + " единиц еды. Теперь в ней: " + foodIn + " единиц еды.");
    }
}
