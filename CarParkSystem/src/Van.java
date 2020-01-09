import java.util.Scanner;

public class Van implements Vehicle {
    String Vehicle;
    String model;
    String cargo;
    String category;

    public void setVehicle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Vehicle ID [IN UPPER CASE}: ");
        Vehicle = input.next();
    }

    public void setModel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Vehicle model: ");
        model = input.next();
    }

    public void setCargo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Cargo size: ");
        cargo = input.next();
    }

    public void setCategory(){
        category = "Van";
    }
}