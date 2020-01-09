import java.util.Scanner;

public class Bike implements Vehicle {
    String Vehicle;
    String model;
    String category;

    public void setVehicle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Vehicle ID [IN UPPER CASE}: ");
        Vehicle = input.next();
    }

    public  void setModel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Vehicle model: ");
        model = input.next();
    }

    public void setCategory(){
        category = "Bike";
    }
}