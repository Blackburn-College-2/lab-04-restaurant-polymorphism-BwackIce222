/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
import edu.blackburn.cs.cs212.restaurantbase.*;
//Stores the variant sizes for the beverages
public class Size extends Measurement{
 private String name;
 //Constructor for size that takes in the name of the size
 public Size(String name){
     this.name = name;
 }
 //returns the name of the size
 public String getName(){
     return this.name;
 }
//toString for the Size class. Returns the name of the beverage
    @Override
    public String toString() {
      return this.name;
    }
   
   
}
