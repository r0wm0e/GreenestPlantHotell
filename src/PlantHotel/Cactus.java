package PlantHotel;

import javax.swing.*;

public class Cactus extends Plants {
    public Cactus(String name, double height){
        super(name, height);

    }

    @Override
    public double dailyNutrition() {
        return 0.02;
    }

    @Override
    public String food() {
        return "mineralvatten";
    }
}
