

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Coffee class, creates different coffee objects
public class Coffee extends MenuItem{
    //Contructor for the coffee items
    public Coffee(String name,Size size,Money basePrice){
        super(name,basePrice);
        
    }
//toString for Coffee that returns the name of the coffee
    @Override
    public String toString() {
       return this.getName();
    }
//returns the base price of the coffee
    @Override
    public Money getPrice() {
       return this.getBasePrice();
    }

//returns the name and price of the item
    @Override
    public String getReceiptItem() {
      return this.toString()+" "+getPrice()+"\n" ;
    }
    
    
}
