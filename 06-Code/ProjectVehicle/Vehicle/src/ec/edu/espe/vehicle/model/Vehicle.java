/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;

import java.util.ArrayList;

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class Vehicle {
    private String code ;
    private String brand;
    private String type;
    private int price;    
    private String ColorVehicle;
    private int mileage;
    private ArrayList<Accessory> accessory = new ArrayList<>();

    public Vehicle(String code, String brand, String type, int price, String colorVehicle, int mileage) {
        this.code = code;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.ColorVehicle = colorVehicle;
        this.mileage = mileage;
    }

    

    @Override
    public String toString() {
        return "Vehicle{" + "code=" + code + ", brand=" + brand + ", type=" + type + ", price=" + price + ", ColorVehicle=" + ColorVehicle + ", mileage=" + mileage + ", accessory=" + accessory + '}';
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the ColorVehicle
     */
    public String getColorVehicle() {
        return ColorVehicle;
    }

    /**
     * @param ColorVehicle the ColorVehicle to set
     */
    public void setColorVehicle(String ColorVehicle) {
        this.ColorVehicle = ColorVehicle;
    }

    /**
     * @return the mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * @return the accessory
     */
    public ArrayList<Accessory> getAccessory() {
        return accessory;
    }

    /**
     * @param accessory the accessory to set
     */
    public void setAccessory(ArrayList<Accessory> accessory) {
        this.accessory = accessory;
    }

}
