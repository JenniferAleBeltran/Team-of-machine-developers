/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class Register {
        private int amountOfSale;
        private String VehicleSold;
        private String name;
        private String lastname;
        private int documentBuyer;

    public Register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Register{" + "amountOfSale=" + amountOfSale + ", VehicleSold=" + VehicleSold + ", name=" + name + ", lastname=" + lastname + ", documentBuyer=" + documentBuyer + '}';
    }

    public Register(int amountOfSale, String VehicleSold, String name, String lastname, int documentBuyer) {
        this.amountOfSale = amountOfSale;
        this.VehicleSold = VehicleSold;
        this.name = name;
        this.lastname = lastname;
        this.documentBuyer = documentBuyer;
    }

    /**
     * @return the amountOfSale
     */
    public int getAmountOfSale() {
        return amountOfSale;
    }

    /**
     * @param amountOfSale the amountOfSale to set
     */
    public void setAmountOfSale(int amountOfSale) {
        this.amountOfSale = amountOfSale;
    }

    /**
     * @return the VehicleSold
     */
    public String getVehicleSold() {
        return VehicleSold;
    }

    /**
     * @param VehicleSold the VehicleSold to set
     */
    public void setVehicleSold(String VehicleSold) {
        this.VehicleSold = VehicleSold;
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the documentBuyer
     */
    public int getDocumentBuyer() {
        return documentBuyer;
    }

    /**
     * @param documentBuyer the documentBuyer to set
     */
    public void setDocumentBuyer(int documentBuyer) {
        this.documentBuyer = documentBuyer;
    }
}
