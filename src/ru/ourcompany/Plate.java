package ru.ourcompany;

public class Plate {
    protected static int foodIn;

    Plate(int foodIn) {
        Plate.foodIn = foodIn;
    }

    public void eatFromAPlate(int countFood) {
        foodIn -= countFood;
    }

    public void addFood(int countFood) {
        if (countFood > 0) foodIn += countFood;
        System.out.println("В тарелку добавили " + countFood + " единиц еды. Теперь в ней: " + foodIn + " единиц еды.");
    }

    public boolean checkCountFood(int needFood){
        return foodIn >= needFood;
    }
}
