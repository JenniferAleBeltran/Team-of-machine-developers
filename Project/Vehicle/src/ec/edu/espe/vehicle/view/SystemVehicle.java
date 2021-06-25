/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.view;

import ec.edu.espe.vehicle.model.Accessory;
import ec.edu.espe.vehicle.model.Client;
import ec.edu.espe.vehicle.model.ModelofVehicle;
import ec.edu.espe.vehicle.model.Vehicle;

import java.util.Scanner;


/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemVehicle {
        public static void main(String[] args  ){
        
      float money;
      String brand;
      String color;
      Scanner read = new Scanner(System.in);
        int option;
      
        System.out.println("Welcome to the dealership");
            System.out.println("Enter the money you have to purchase the vehicle:");
            money= read.nextFloat();
            if(money<=10000 ){
            System.out.println("you can buy a used vehicle");
            }
            else{
            System.out.println("you can buy a new vehicle");  
            } 
            System.out.println("What brand of vehicle do you want to buy?");
            System.out.println("1.-Chevrolett");
            System.out.println("2.-Toyota");
            System.out.println("3.-KIA");
            System.out.println("4.-Hyundai");
            brand=read.next();
            System.out.println("What color do you want your vehicle?");
            System.out.println("1.-Red");
            System.out.println("2.-White");
            System.out.println("3.-Black");
            System.out.println("4.-Gray");
            color=read.next();
            
            }
            
    }

