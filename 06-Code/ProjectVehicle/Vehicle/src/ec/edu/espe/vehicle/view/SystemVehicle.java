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
        int modelVehicle;
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
                
                System.out.println ("Enter the model year of the vehicle");
                modelVehicle = reader.nextInt ();
                
                System.out.println ("Enter vehicle mileage");
                mileageVehicle = reader.nextInt (); 
                
                Vehicle vehicle = new Vehicle (codeVehicle, brandVehicle,
                typeVehicle, priceVehicle,  modelVehicle, mileageVehicle);
                
                System.out.println ("\n");
          
                System.out.println ("** YOUR VEHICLE HAS BEEN REGISTERED **");
                System.out.println ("> Code:" + vehicle.getCode ());
                System.out.println ("> Make:" + vehicle.getBrand ());
                System.out.println ("> Type:" + vehicle.getType ());
                System.out.println ("> Price:" + vehicle.getPrice ());
                System.out.println ("> Model:" + vehicle.getModel ());
                System.out.println ("> Mileage:" + vehicle.getMileage () + "Km");
            }
                
    }
        

}
    
} 
