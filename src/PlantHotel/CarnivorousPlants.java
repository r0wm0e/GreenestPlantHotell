package PlantHotel;

import javax.swing.*;

public class CarnivorousPlants extends Plants {

    public CarnivorousPlants(String name, double height){
        super(name, height);
    }


    @Override
    public double dailyNutrition() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public String food() {
        return "proteindryck";
    }
}
