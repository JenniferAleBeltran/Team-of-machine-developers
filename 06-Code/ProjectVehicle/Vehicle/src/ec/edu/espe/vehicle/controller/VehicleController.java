/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.controller;

import ec.edu.espe.vehicle.model.Vehicle;
import ec.edu.espe.vehicle.view.FrmVehicle;
import utils.PersistenceI;
import utils.VehicleDearleship;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class VehicleController {

   private Vehicle vehicle;
   private FrmVehicle frmVehicle;
   private PersistenceI persistence;

    /**
     * @return the vehicle
     */
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
    public PersistenceI getPersistence() {
        return persistence;
    }

    /**
     * @param persistence the persistence to set
     */
    public void setPersistence(PersistenceI persistence) {
        this.persistence = persistence;
    }

    
    }
   
    

