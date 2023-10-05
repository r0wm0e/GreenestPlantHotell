package PlantHotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    Palmer pLaura = new Palmer("Laura", 5);
    Palmer pOlof = new Palmer("Olof", 1);
    CarnivorousPlants cMeatLoaf = new CarnivorousPlants("Meatloaf", 0.7);
    Cactus cIgge = new Cactus("Igge" , 0.2);

    public Main(){
        String name = JOptionPane.showInputDialog("Vilken växt ska få mat?");

        List<Plants> plants = new ArrayList<>();
        plants.add(pLaura);
        plants.add(pOlof);
        plants.add(cMeatLoaf);
        plants.add(cIgge);

        for (Plants plant : plants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                JOptionPane.showMessageDialog(null, plant.getName() + " ska få " + plant.dailyNutrition() + "Liter " + plant.food() + " per dag");
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
