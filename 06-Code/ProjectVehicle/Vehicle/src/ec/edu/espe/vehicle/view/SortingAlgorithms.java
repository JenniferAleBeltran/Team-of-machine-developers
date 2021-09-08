/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.view;

import ec.edu.espe.vehicle.model.SortingContext;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class SortingAlgorithms {
   public static void main(String[] args) {
        // TODO code application logic here
        SortingContext sortingContext = new SortingContext(); 

        int data[] = {10,65,100,25};        
        int sortedList[] = sortingContext.sort(data); 
        
        int data2[] = {30,50,60,70,50,70};        
        sortingContext.sort(data2); 
        
        int data3[] = {30,50,60,70,50,70,100,120,340,450,120,230};        
        sortingContext.sort(data3); 
        
    }
    
} 
