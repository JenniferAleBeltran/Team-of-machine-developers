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
            System.out.println("1.-Chevrolet");
            System.out.println("2.-Toyota");
            System.out.println("3.-KIA");
            System.out.println("4.-Hyundai");
            brand=read.next();
            option=read.nextInt();
       
            switch(option){    
                
            case 1:
                System.out.println("Welcome to Chevrolet");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Aveo");
                System.out.println("2.-Sparkgt");
                System.out.println("3.-Beat");
                System.out.println("4.-Sail");
                
            case 2:
                System.out.println("Welcome to Toyota");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Corolla");
                System.out.println("2.-Yaris");
                System.out.println("3.-Hilux");
                System.out.println("4.-Fortuner");
                
            case 3:
                System.out.println("Welcome to KIA");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Sportage R");
                System.out.println("2.-Picanto");
                System.out.println("3.-Rio");
                System.out.println("4.-Cerato");
                
            case 4:
                System.out.println("Welcome to Hyundai");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.- i-10");
                System.out.println("2.- Elantra");
                System.out.println("3.- Accent");
                System.out.println("4.- Santa Fe");
                
            default: System.out.println("WARNING!!!!");
            
        }
            
            }
            
    }

