
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Creates a sandwich object
 * @author montr
 */
public class Sandwich implements Orderable{
private ArrayList <Orderable> contents = new ArrayList();
     Money basePrice;
     Money initial;
     
     /**
      * The sandwich constructor. Only requires a price
      * @param basePrice 
      */
     public Sandwich(Money basePrice){
         this.basePrice = basePrice;
         this.initial = basePrice;
         
      
    }
     /**
      * get the price of your sandwich
      * @return returns the price of the sandwich 
      */
@Override
    public Money getPrice() {
        return this.basePrice;
    }
/**
 * 
 * @return returns a String type in the form of a receipt
 */
    @Override
    public String getReceiptItem() {
         String receipt ="Sandwich"+"\t\t"+this.initial+"\n" ;
       for(int c =0;c<contents.size();c++){
           receipt +="\t"+contents.get(c).getReceiptItem()+"\n";
       }
       return receipt;
    }
    /**
     * add either a meat or topping object to the receipt
     * @param a an Orderable object
     */
    public void add(Orderable a){  
        this.basePrice = this.basePrice.add(a.getPrice());
        this.contents.add(a);
    }
    /**
     * 
     * @return Returns a String with information about the sandwich 
     */
@Override
    public String toString(){
       return "The sandwich is "+this.initial.getAmountString();
    }
    /**
     * The only differences from the class diagram are the basePrice and initial
     * attributes
     */
}
