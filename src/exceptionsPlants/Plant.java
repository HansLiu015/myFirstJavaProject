package exceptionsPlants;

public class Plant {

    private String name, location;
    private double height;

    public Plant(String name, double height, String location) {
        this.name = name;
        this.height = height;
        this.location = location;
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String plantName) {
        this.name = plantName;
    }

    public void setHeight(double plantHeight) {
        this.height = plantHeight;
    }

    public void setLocation(String plantLocation) {
        this.location = plantLocation;
    }
}
