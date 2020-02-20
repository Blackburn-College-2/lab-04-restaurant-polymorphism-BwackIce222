
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Creates a Meat object
 * @author montr
 */
public class Meat implements Orderable{
private Money price;
private String name;   
public Meat(String name,Money money){
this.name=name;
this.price=money;
}
/**
 * returns the price of the meat
 * @return 
 */
    @Override
    public Money getPrice() {
        return this.price;
    }
/**
 * returns the meat in receipt format
 * @return 
 */
    @Override
    public String getReceiptItem() {
         String meatBoi = this.name+"\t\t"+this.getPrice();
        return meatBoi;
    }
    /**
     * prints out the name and price of the meat
     * @return 
     */
@Override
    public String toString(){
        return name + price.getAmountString();
    }
    /**
     * The only deviation from the class diagram is the price attribute
     */
}
