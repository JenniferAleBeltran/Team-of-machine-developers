/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.controller;

import ec.edu.espe.vehicle.model.Vehicle;
import ec.edu.espe.vehicle.view.FrmVehicle;
import utils.VehicleDearleship;
import java.util.ArrayList;
import utils.DBManager;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class VehicleController {

   private Vehicle vehicle;
   private FrmVehicle frmVehicle;
   private VehicleDearleship vehicleDearleship;

    /**
     * @return the vehicle
     */
   
   
   public void add(Vehicle vehicle){
        //TODO add contact to database
        //TODO call utils classes
        vehicleDearleship = new DBManager();
        //TODO convert contact to json;
        String VehicleJson = "{\"Brand\":\"Chevrolet\"}";
        
    }
    
    public ArrayList<Vehicle> find(String code){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        //TODO find the contact(s) by email using utils
        Vehicle vehicle = new Vehicle("123", "Chevrolet", "vehicle", 13000, "red", 10000);
        vehicles.add(vehicle);
        return vehicles;
    }
    
    public boolean delete(String code){
        boolean deleted = false;
        //TODO 
         ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles = find (code);
        if(vehicles.size()>0){
            //TODO delete from data base
            deleted = true;
        }
        return deleted;
    }
    
    public boolean update(String code){
        boolean updated = false;
        //TODO 
         ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles = find (code);
        if(vehicles.size()>0){
            updated = true;
        }
        return updated;
         }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the frmVehicle
     */
    public FrmVehicle getFrmVehicle() {
        return frmVehicle;
    }

    /**
     * @param frmVehicle the frmVehicle to set
     */
    public void setFrmVehicle(FrmVehicle frmVehicle) {
        this.frmVehicle = frmVehicle;
    }

    /**
     * @return the persistence
     */
    public VehicleDearleship getPersistence() {
        return vehicleDearleship;
    }

    /**
     * @param persistence the persistence to set
     */
    public void setPersistence(VehicleDearleship persistence) {
        this.vehicleDearleship = persistence;
    }

    
    }
   
    

