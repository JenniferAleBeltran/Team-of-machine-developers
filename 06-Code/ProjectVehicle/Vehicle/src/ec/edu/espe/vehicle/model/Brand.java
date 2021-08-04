/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class Brand {
    private String nameOfBrand;

    public Brand(String nameOfBrand) {
        this.nameOfBrand = nameOfBrand;
    }

    @Override
    public String toString() {
        return "Brand{" + "nameOfBrand=" + nameOfBrand + '}';
    }

    /**
     * @return the nameOfBrand
     */
    public String getNameOfBrand() {
        return nameOfBrand;
    }

    /**
     * @param nameOfBrand the nameOfBrand to set
     */
    public void setNameOfBrand(String nameOfBrand) {
        this.nameOfBrand = nameOfBrand;
    }
    
    
}
