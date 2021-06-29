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
public class ModelofVehicle {
    private String brand;
    private String name;
    private String color;

    public ModelofVehicle(String brand, String name, String color) {
        this.brand = brand;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ModelofVehicle{" + "brand=" + brand + ", name=" + name + ", color=" + color + '}';
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
   
    
    
}
