import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class VehicleExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(null));
        try{
            System.out.println("Select the vehicle Type:");
            System.out.println("1)Cycle:");
            System.out.println("2)Motor Cycle:");
            System.out.println("3)Car:");

            int choice = Integer.parseInt(br.readLine());
            Vehicle v = new Vehicle();

            switch (choice) {
                case 1:
                v = new Cycle();
                    
                    break;
                case 2:
                v = new Motorcycle();
                break;

                v = new Car();
                break;

                default:
                System.out.println("Invalid Choice!");
                    break;
            }
        }
        catch (Exception e) {  
            System.out.println("An error occurred: " + e.getMessage());  
        } 
        // Car c1 = new Car();
        // Motorcycle m1 = new Motorcycle();
        // Vehicle v = new Car();    // Assigning the derived class to the super class / up casting
        // Vehicle v1 = new Motorcycle();  //// Assigning the derived class to the super class / up casting
        // Cycle c1 = new Cycle();
    }

}
