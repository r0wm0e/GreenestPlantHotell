package PlantHotel;

import javax.swing.*;

public class Palmer extends Plants {


    public Palmer(String name, double height){
        super(name, height);

    }

    @Override
    public double dailyNutrition() {
        return 0.5 * getHeight();
    }

    @Override
    public String food() {
        return "kranvatten";
    }
}

