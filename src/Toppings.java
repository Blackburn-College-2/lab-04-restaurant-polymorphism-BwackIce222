
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Creates a toppings object
 * @author montr
 */
public class Toppings implements Orderable {
    private Money price;
    private String type;
    /**
     * Constructor for toppings
     * @param type
     * @param money 
     */
    public Toppings(String type, Money money){
        this.price=money;
        this.type=type;
    }
    /**
     * returns the price of the topping
     * @return 
     */
    @Override
    public Money getPrice() {
       return this.price;
    }
    /**
     * returns the information of the topping in receipt form.
     * @return 
     */
    @Override
    public String getReceiptItem() {
      String toppingsBoi = this.type+"\t\t"+this.getPrice();
        return toppingsBoi;
    }
    /**
     * returns the name and price of the topping as a string
     * @return 
     */
    @Override
    public String toString(){
         return type + price.getAmountString();
    }
    /**
     * The only deviation from the class diagram is the price attribute
     */
}
