package PlantHotel;

abstract class Plants implements Nutrition {
    protected String name;
    protected double height;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public Plants(String name, double height){
        this.name = name;
        this.height = height;
    }
}
