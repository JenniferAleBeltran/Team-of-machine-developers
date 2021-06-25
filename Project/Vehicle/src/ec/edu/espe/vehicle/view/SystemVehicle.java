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
        int option2; 
        int option3;
        
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
                option2=read.nextInt(); 
             switch(option2){
                 case 1:
                 System.out.println("The Chevrolet Aveo version features:"); 
                 System.out.println("1.5L 4-cylinder engine\n" +
                  "    107 HP of power and 104 lb.-ft. of torque\n" +
                  "    McPherson® front suspension\n" +
                  "    5 speed manual transmission\n" +
                  "    Air conditioning with manual control\n" +
                  "    AM / FM radio, MP3 player, input for USB and Aux In and Bluetooth® connection\n" +
                  "    14 ”steel wheels\n" +
                  "    2 front airbags for driver and passenger\n" +
                  "    4-wheel ABS brakes");
                  System.out.println("Its price is: $15000");
                    case 2:
                 System.out.println("The Chevrolet Sparkgt version features:"); 
                 System.out.println(" Gasoline engine\n" +
                  "    Displacement 1999 cc\n" +
                  "    Maximum Power 152 hp @ 6,200 rpm\n" +
                  "    Maximum torque 191 nm @ 4,700 rpm\n" +
                  "    6-speed manual transmission + reverse\n" +
                  "    Driver and Passenger Airbag\n" +
                  "    ABS anti-lock braking system");
                  System.out.println("Its price is: $13000"); 
                         case 3:
                 System.out.println("The Chevrolet Beat version features:"); 
                 System.out.println("1.2L 4-cylinder engine\n" +
                  "   5-speed manual transmission\n" +
                  "   Electro-assisted steering\n" +
                  "   Mylink system with 7-inch touch screen (Compatible with Android Auto and Apple CarPlay)\n" +
                  "   Air-conditioning\n" +
                  "   Mirrors with electrical adjustment\n" +
                  "   Electric windows on the 4 doors\n" +
                  "   Audio and phone controls behind the wheel\n" +
                  "   ABS + EBD braking systems\n" +
                  "   Double front airbag");
                  System.out.println("Its price is: $14799"); 
                              case 4:
                 System.out.println("The Chevrolet Sail version features:"); 
                 System.out.println("Slope start assistant\n" +
                  "   Electronic stability control\n" +
                  "   Aluminum rings\n" +
                  "   Power: 109 hp");
                  System.out.println("Its price is: $16000"); 
             }  
            case 2:
                System.out.println("Welcome to Toyota");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Corolla");
                System.out.println("2.-Yaris");
                System.out.println("3.-Hilux");
                System.out.println("4.-Fortuner");
                option3=read.nextInt(); 
             switch(option3){
                 case 1:
                 System.out.println("The Toyota Corolla version features:"); 
                 System.out.println("Hybrid 1.8 L engine.\n" +
                         "    Power of 122cv.\n" +
                         "    170 Nm torque.\n" +
                         "    CVT transmission.\n" +
                         "    86 km / Gal consumption.");        
                 System.out.println("Its price is: $30000"); 
                 
                            case 2:
                 System.out.println("The Toyota Yaris version features:"); 
                 System.out.println(" car body\n" +
                         "doors 5.\n" +
                         "squares5.\n" +
                         "trunk286 l.\n" +
                         "power125 hp.\n" +
                         "consumption4.8 l / 100km");
                 System.out.println("Its price is: $22000");
                 
                            case 3:
                 System.out.println("The Toyota Hilux version features:"); 
                 System.out.println("2,700cc engine\n" +
                         "160 horsepower power\n" +
                         "maximum torque of 241 Nm ");
                 System.out.println("Its price is: $53000");
                 
                            case 4:
                 System.out.println("The Toyota Fortuner version features:"); 
                 System.out.println("2,700 cc engine" + 
                         "4 cylinders in line" + 
                         "16 valves" + 
                         " DOHC and DUAL VVT-i technology" +
                         " 163Hp power" +
                         "torque of 245 Nm");
                 System.out.println("Its price is: $56000");









                
                
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
          
            
            
   

