/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.view;
<<<<<<< HEAD:Vehicle/src/ec/edu/espe/vehicle/view/System.java
import ec.edu.espe.vehicle.model.Accessory;
import ec.edu.espe.vehicle.model.Brand;
import ec.edu.espe.vehicle.model.Client;
import ec.edu.espe.vehicle.model.ModelofVehicle;
import ec.edu.espe.vehicle.model.Type;
import ec.edu.espe.vehicle.model.Vehicle;
=======
import ec.edu.espe.vehicle.model.*;

>>>>>>> a0bb17feb4185c42de359bc1977f7a065b574ab0:Vehicle/src/ec/edu/espe/vehicle/view/SystemVehicle.java
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemVehicle {
        public static void main(String[] args  ){
        
      Vehicle vehicle= new Vehicle();
      Client client= new Client();

      ModelofVehicle modelofvehicle= new ModelofVehicle("Toyota", "black", "squard");
      Accessory accessory= new Accessory();
      Brand brand= new Brand();
      Type type= new Type();
      
      vehicle.setPrice("2.000");
      client.setEsconomicstatus("middle class ");
      modelofvehicle.setName("Chevrolet");
      accessory.setSeat(7);
      brand.setAge(2004);
      type.setT("t");
      
      System.out.println("vehicle -> " + vehicle);
      System.out.println("client -> " + client);
      System.out.println("modelofvehicle -> " + modelofvehicle);
      System.out.println("accessory -> " + accessory);
      System.out.println("brand -> " + brand);
      System.out.println("type -> " + type);
    }
}
