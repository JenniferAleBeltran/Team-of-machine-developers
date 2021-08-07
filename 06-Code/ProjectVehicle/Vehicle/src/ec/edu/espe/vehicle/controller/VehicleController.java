/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.controller;

import com.mongodb.MongoClient;
import ec.edu.espe.vehicle.model.Vehicle;
import ec.edu.espe.vehicle.view.FrmVehicle;
import java.net.UnknownHostException;
import utils.VehicleDearleship;
import java.util.ArrayList;
import utils.DBManager;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class VehicleController {

    public MongoClient connect() throws UnknownHostException {
        MongoClient mongo = new MongoClient("localhost", 27017);
        return mongo;
    }
}
   
    

