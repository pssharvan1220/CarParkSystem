import java.io.*;
import java.util.Scanner;

public class WestminsterCarParkManager {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String[] model = new String[20];
        String[] cargo = new String[20];
        String[] color = new String[20];
        int[] doornum= new int[20];
        String[] category = new String[20];
        String[] ID = new String[20];
        int count;
        int Choice=0;

        Van Van = new Van();
        Bike Bike = new Bike();
        Car Car = new Car();

        FileWriter fw=new FileWriter("output.txt", true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw =new PrintWriter(bw);

        File file = new File("output.txt");
        FileInputStream fr = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];
        fr.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        count = stringArray.length;
        System.out.println(count+1);

        do {
            System.out.println("--------------------------------");
            System.out.println("Welcome to WEST MINSTER CAR PARK");
            System.out.println("What do you want to do?");
            System.out.println("1. Add a Vehicle");
            System.out.println("2. Delete a Vehicle");
            System.out.println("3. Show parked Vehicles");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Choice = input.nextInt();
            switch (Choice) {
                case 1:
                    if (count != 20) {
                        System.out.print("\nVehicle category\n\ta. van\n\tb. bike\n\tc. car\nselect: ");
                        String option = input.next();
                        switch (option) {
                            case "a":
                                Van.setVehicle();
                                Van.setModel();
                                Van.setCargo();
                                Van.setCategory();
                                ID[count]=Van.Vehicle;
                                model[count] = Van.model;
                                cargo[count] = Van.cargo;
                                category[count] = Van.category;
                                pw.println(category[count]+" - "+ID[count]+" | "+model[count]+" | "+cargo[count]);
                                count = count + 1;
                                break;
                            case "b":
                                Bike.setVehicle();
                                Bike.setModel();
                                Bike.setCategory();
                                ID[count]=Bike.Vehicle;
                                model[count] = Bike.model;
                                category[count] = Bike.category;
                                pw.println(category[count]+" - "+ID[count]+" | "+model[count]);
                                count = count + 1;
                                break;
                            case "c":
                                Car.setVehicle();
                                Car.setModel();
                                Car.setColor();
                                Car.setDoornum();
                                Car.setCategory();
                                ID[count]=Car.Vehicle;
                                model[count] = Car.model;
                                color[count] = Car.color;
                                doornum[count] = Car.doornumber;
                                category[count] = Car.category;
                                pw.println(category[count]+" - "+ID[count]+" | "+model[count]+" | "+color[count]+" | "+doornum[count]);
                                count = count + 1;
                                break;
                            case "A":
                                Van.setVehicle();
                                Van.setModel();
                                Van.setCargo();
                                Van.setCategory();
                                ID[count]=Van.Vehicle;
                                model[count] = Van.model;
                                cargo[count] = Van.cargo;
                                category[count] = Van.category;
                                pw.println(category[count]+" - "+ID[count]+" | "+model[count]+" | "+cargo[count]);
                                count = count + 1;
                                break;
                            case "B":
                                Bike.setVehicle();
                                Bike.setModel();
                                Bike.setCategory();
                                ID[count]=Bike.Vehicle;
                                model[count] = Bike.model;
                                category[count] = Bike.category;
                                pw.println(category[count]+" - "+ID[count]+" | "+model[count]);
                                count = count + 1;
                                break;
                            case "C":
                                Car.setVehicle();
                                Car.setModel();
                                Car.setColor();
                                Car.setDoornum();
                                Car.setCategory();
                                ID[count]=Car.Vehicle;
                                model[count] = Car.model;
                                color[count] = Car.color;
                                doornum[count] = Car.doornumber;
                                category[count] = Car.category;
                                pw.println(category[count]+" - "+ID[count]+" | "+model[count]+" | "+color[count]+" | "+doornum[count]);
                                count = count + 1;
                                break;
                            default:
                                System.out.println("No facilities to Park this type of vehicle");
                        }
                        System.out.println("\nThank You For using Our Facility ..!!!!!\n");
                        break;
                    }else{
                        System.out.println("Car Park is FULL..!!!!!");
                    }

                case 2:
                    System.out.print("Vehicle ID [IN UPPER CASE]: ");
                    String VID = input.next();
                    for (int i = 0; i <= count; i++) {
                        if (ID[i].equals(VID)) {
                            for (int j = i; j <= count; j++) {
                                ID[j] = ID[j + 1];
                            }
                        } else {
                            System.out.println("Invalid Vehicle ID");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Vehicle ID");
                    for (int i = 0; i < 20; i++) {
                        System.out.println((i+1) + "." + ID[i]);
                    }

                    System.out.println("i. View vehicle details: ");
                    System.out.print("ii. Main Menu\n=> :");
                    String n = input.next();
                    System.out.println("");
                    switch (n){
                        case "i":
                            System.out.print("Enter the parked order number above: ");
                            int p_odr = input.nextInt();
                            String Cate=category[p_odr-1];
                            System.out.println();
                            switch (Cate){
                                case "Car":
                                    System.out.println("Car ID: "+ ID[p_odr-1]);
                                    System.out.println("Car model: "+ model[p_odr-1]);
                                    System.out.println("Car color: " + color[p_odr-1]);
                                    System.out.println("Door num: "+ doornum[p_odr-1]);
                                    break;
                                case "Van":
                                    System.out.println("Van ID: "+ ID[p_odr-1]);
                                    System.out.println("Van model: "+ model[p_odr-1]);
                                    System.out.println("Cargo size: "+ cargo[p_odr-1]);
                                    break;
                                case "Bike":
                                    System.out.println("Bike ID: "+ ID[p_odr-1]);
                                    System.out.println("Bike model: "+ model[p_odr-1]);
                            }
                            break;
                        case "ii":
                            break;
                    }
            }
        } while(Choice != 4);
        System.out.println("Thank You For Coming...!!!!!!");
        pw.flush();
        pw.close();
        bw.close();
        fw.close();

    }
}
