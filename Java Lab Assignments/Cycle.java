public class Cycle extends Motorcycle {  
    private Integer numOfWheels;  

    // Default Constructor  
    public Cycle() {  
        super(); // Call to the Motorcycle default constructor  
        System.out.println("This is a cycle.");  
    }  

    // Constructor to initialize properties  
    public Cycle(String make, String model, String year, Boolean hasSidecar, Integer numOfWheels) {  
        super(make, model, year, hasSidecar); // Call to the Motorcycle constructor  
        this.numOfWheels = numOfWheels;  
    }  

    public Integer getNumOfWheels() {  
        return numOfWheels;  
    }  

    public void setNumOfWheels(Integer numOfWheels) {  
        this.numOfWheels = numOfWheels;  
    }  

    @Override  
    public String toString() {  
        // Return a string representation of the Cycle  
        return "Cycle{" +  
                "numOfWheels=" + numOfWheels +  
                ", " + super.toString() + // Include Motorcycle's toString()  
                '}';  
    }  
}  