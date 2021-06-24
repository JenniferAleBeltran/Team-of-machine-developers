/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.view;

import ec.edu.espe.vehicle.model.Accessory;
import ec.edu.espe.vehicle.model.Brand;
import ec.edu.espe.vehicle.model.Client;
import ec.edu.espe.vehicle.model.ModelofVehicle;
import ec.edu.espe.vehicle.model.Type;
import ec.edu.espe.vehicle.model.Vehicle;

import ec.edu.espe.vehicle.model.*;


/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemVehicle {
        public static void main(String[] args  ){
        
      Vehicle vehicle= new Vehicle("34000");
      Client client= new Client("good", "Jennifer", "Quitumbe");

      ModelofVehicle modelofvehicle= new ModelofVehicle("Toyota", "black", "squard");
      Accessory accessory= new Accessory(5, 4, 1);
      Brand brand= new Brand(25, 4, "Toyota");
      Type type= new Type("vehicle");
      
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
