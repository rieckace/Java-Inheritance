public class Car extends Vehicle {
    private Integer numofDoors;

    public Car() {
        // Default Constructor
        System.out.println("Default Constructor Car class is called.");
    }

    public Car(String make, String model, String year, Integer door) {
        super(make, model, year);
        this.numofDoors = door;

    }

    public void setNumofDoors(Integer door) {
        this.numofDoors = door;
    }

    public Integer getNumofDoors() {
        return this.numofDoors;
    }

    @Override  
    public String toString() {  
        // Call toString() from Vehicle and append numofDoors  
        return super.toString() + ", Car{" +  
                "numofDoors=" + numofDoors +  
                '}';  
    } 
}
