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
              System.out.println (">> Registrar vehicle: 1");
              System.out.println (">> Register vehicle sale: 2");
              System.out.println (">> Exit consessionary: 0");
    }
}
    
} 
