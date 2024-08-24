public class Vehicle {

    private String make;
    private String model;
    private String year;

    // Default Constructor
    public Vehicle() {
        System.out.println("This is a vehicle class.");
    }

    // Parameterized Constructor
    public Vehicle(String mak, String mod, String year) {
        this.make = mak;
        this.model = mod;
        this.year = year;
    }

    // Getter and setter for taking individual input and displaying output
     public void setMake(String make){
        this.make = make;
     }

     public String getMake(){
        return this.make;
     }

     public void setModel(String model){
        this.model = model;
     }

     public String getModel(){
        return this.model;
     }
     public void setYear(String year){
        this.year = year;
     }

     public String getYear(){
        return this.year;
     }

}