
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates a syrup object
public class Syrup implements Orderable {
    private String flavor;
    private Money price;
    private Receipt receipt;
   /**
    * Creates a syrup object
    * @param flavor what flavor the syrup will be
    * @param price what price it will be
    */
    public Syrup(String flavor, Money price){
        this.flavor = flavor;
        this.price = price;
    }
    /**
     * gets the price of the syrup
     * @return returns the price  
     */
    @Override
    public Money getPrice() {
        return this.price;
    }
    /**
     * 
     * @return returns a syrup string 
     */
    @Override
    public String getReceiptItem() {
        String syrupBoi = this.flavor+"\t"+this.getPrice();
        return syrupBoi;
      
    }
    /**
     * 
     * @return returns a syrup string 
     */
    @Override
    public String toString(){
        return this.flavor  + this.price.getAmountString();
    }
    /**
     * Compared with the class diagram the only differences are the price and 
     * receipt attributes 
     */
}
