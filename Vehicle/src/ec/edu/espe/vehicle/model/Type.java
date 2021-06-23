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
public class Type {
    
    ////construtor, toString(), Getter and Setter.
    private String t;

    public Type(String t) {
        this.t = t;
    }

    public Type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Type{" + "t=" + getT() + '}';
    }

    /**
     * @return the t
     */
    public String getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(String t) {
        this.t = t;
    }

    
    
}
