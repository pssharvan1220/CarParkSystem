import java.util.Scanner;

public class Car implements Vehicle {
    String Vehicle;
    String model;
    String color;
    int  doornumber;
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

    public void setColor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Vehicle Color: ");
        color = input.next();
    }
    public void setDoornum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Door Number: ");
        doornumber = input.nextInt();
    }

    public void setCategory()
    {
        category = "Car";
    }
}
