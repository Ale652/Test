/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ale
 */
public class AverageRandomNumber {
    
    
    public static void main(String args[]){
    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myint = keyboard.nextInt();
        
        ArrayList al = new ArrayList();
        
        int i =0;
        Random rand = new Random();
        //the random number generated
        int  n;
         //memorate the most common number in the list & number of apparitions
        int m_common=0, nr_common =0;
        
        while(i<myint){
            //used to compare the last number generated with the exiting numbers in the list
            int j = 0, nr =0;
            //last random number generated
            n = rand.nextInt(6) + 1;
            al.add(n);
            
            while(j<i){
                //comparing last number generated  wiht all existing numbers in the list
                if((int)al.get(j)==n)
                    //count the number of apparitions of the last number int he list
                    nr++;
                
                j++;
            }
            if(nr>nr_common){
                m_common = n;
                nr_common = nr;
            }
            i++;
        }
        
        System.out.println(al);
        System.out.println("Most common number: "+m_common);
        System.out.println("Number of apparitions: "+(nr_common+1));
        
    }
}
