
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates a coffee object
public class FancyCoffee extends Coffee{
    private ArrayList <Orderable> addOn = new ArrayList();
     Money basePrice;
     Size size;
     /**
      * Constructor for a coffee object. Requires a name, size and price
      * @param name
      * @param size
      * @param basePrice 
      */
    public FancyCoffee(String name, Size size, Money basePrice) {
        super(name, size, basePrice);  
        this.basePrice = basePrice;
        this.size = size;
    }
    /**
     * returns a String of the coffee and its price, along with all of 
     * its syrups and their prices
     * @return 
     */
     @Override
    public String getReceiptItem() {
       String receipt =this.size+"\t"+this.getName()+"\t\t"+getPrice()+"\n" ;
       for(int c =0;c<addOn.size();c++){
           receipt +="\t"+addOn.get(c).getReceiptItem()+"\n";
       }
       return receipt;
    }
    /**
     * add a syrup to the receipt of the coffee
     * @param a 
     */
     public void add(Orderable a){  
        this.basePrice = this.basePrice.add(a.getPrice());
        this.addOn.add(a);
    }
     /**
      * toString method for Fancy coffee
      * @return a String, including the name and price
      */
    @Override
     public String toString(){
         return this.getName()+"\t"+this.basePrice.getAmountString();
     }
    /**
     * Compared with the class diagram, the only differences are the basePrice 
     * and size attributes.
     */
    
}
