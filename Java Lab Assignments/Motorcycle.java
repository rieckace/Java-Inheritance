public class Motorcycle extends Vehicle  {
    private Boolean hasSidecar;
   
    public Motorcycle(){
        System.out.println("Inside my motorcycle:");
        // Default Constructor
    } 

    /**
     * Constructor for objects of class Motorcycle with parameters
     * @param make - make of vehicle
     * @param model - model of vehicle
     * @param year - make year of vehicle
     * @param hasSidecar - tells wheteher there is side car or not
     * 
     */  
     public Motorcycle (String make, String model ,String year, Boolean hasSidecar){
        super(make, model, year);
        this.hasSidecar= hasSidecar;
    }

    public Boolean getHasSideCar(){
        return this.hasSidecar;
    }

    public void setHasSideCar(Boolean hassideCar){
        this.hasSidecar = hassideCar;
    }
    
    @Override  
    public String toString() {  
        // Call toString() from Vehicle and append hasSidecar information  
        return super.toString() + ", Motorcycle{" +  
                "hasSidecar=" + (hasSidecar ? "Yes" : "No") +  
                '}';  
    } 
}
