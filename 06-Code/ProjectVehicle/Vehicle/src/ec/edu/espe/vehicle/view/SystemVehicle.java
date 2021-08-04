//This project is created to help the client to quote a vehicle in a dealership,
//according to his budget, it helps him choose between several options of brands and models,
//so he will choose the one that best suits him.


package ec.edu.espe.vehicle.view;
import ec.edu.espe.vehicle.model.Accessory;
import ec.edu.espe.vehicle.model.Register;
import ec.edu.espe.vehicle.model.Vehicle;

import java.util.Scanner; // Falta library json

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemVehicle {

    public static void main(String[] args) {

        String codeVehicle; 
        String brandVehicle;
        String typeVehicle;
        int priceVehicle;
        String ColorVehicle;
        int mileageVehicle;              
        int amountOfSale;
        String vehicleSold;
        String name;
        String lastname;
        int documentBuyer;
             
        
        
        int option = 1;
        
        Scanner reader = new Scanner (System.in);
        
        Scanner in = new Scanner (System.in);
        
        System.out.println ("***** WELCOME TO THE CAR DEALERSHIP *****");
        
        while(option != 0){
            System.out.println ("Select the option you want to make");
              System.out.println (">> Register vehicle: 1");
              System.out.println (">> Register vehicle sale: 2");
              System.out.println (">> Exit consessionary: 0");
              
              option = in.nextInt ();
            
                if(option == 1) {
                System.out.println ("\n");
                
                String[] typeOfVehicles = {"Vehicle", "Truck", "Motorcycle"};
                
                
                System.out.println ("Enter the vehicle code:");
                codeVehicle= reader.next ();
                
                System.out.println ("Enter the brand of the vehicle:");
                brandVehicle = reader.next ();
                
                System.out.println ("\n");
                
                System.out.println ("** Enter the vehicle type **");
                System.out.println (">> Vehicle: 0");
                System.out.println (">> Truck: 1");
                System.out.println (">> Motorcycle: 2");
                String type = reader.next ();
                
                int intType = Integer.parseInt (type);
                typeVehicle = typeOfVehicles [intType];
                
                System.out.println ("Enter the price of the vehicle");
                priceVehicle = reader.nextInt ();
                
                System.out.println ("Enter the color  of the vehicle");
                ColorVehicle = reader.next();
                
                System.out.println ("Enter vehicle mileage");
                mileageVehicle = reader.nextInt (); 
                
                Vehicle vehicle = new Vehicle (codeVehicle, brandVehicle,
                typeVehicle, priceVehicle,  ColorVehicle, mileageVehicle);
                
                System.out.println ("\n");
          
                System.out.println ("** YOUR VEHICLE HAS BEEN REGISTERED **");
                System.out.println ("> Code:" + vehicle.getCode ());
                System.out.println ("> Make:" + vehicle.getBrand ());
                System.out.println ("> Type:" + vehicle.getType ());
                System.out.println ("> Price:" + vehicle.getPrice ());
                System.out.println ("> Color:" + vehicle.getColorVehicle());
                System.out.println ("> Mileage:" + vehicle.getMileage () + "Km");
            }
        
                if (option == 2) {
                System.out.println ("Enter the amount of the sale:");
                amountOfSale = in.nextInt ();
                
                System.out.println ("Enter the vehicle sold code:");
                vehicleSold = reader.next ();
                
                System.out.println ("Enter the buyer's name:");
                name = reader.next ();
                
                System.out.println ("Enter the buyer's last name:");
                lastname = reader.next();
                
                System.out.println ("Enter the buyer's identification document");
                documentBuyer = reader.nextInt ();
                
                Register registrationOfSale = new Register (amountOfSale, vehicleSold, name, lastname, documentBuyer);
                
                System.out.println ("\n");
                
                System.out.println ("** SALE RECORD **");
                System.out.println ("> The amount of the sale:" + registrationOfSale.getAmountOfSale ());
                System.out.println ("> The vehicle sold:" + registrationOfSale.getVehicleSold ());
                System.out.println ("> The buyer's name:" + registrationOfSale.getName ());
                System.out.println ("> The buyer's last name:" + registrationOfSale.getLastname ());
                System.out.println ("> The buyer's identification document:" + registrationOfSale.getDocumentBuyer ());
    }
        }
        

}
    
} 
