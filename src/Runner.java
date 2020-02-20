

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    //Here my cup sizes prices and beverage types are made and initiated
    public static void main(String[] args) {
        Size small = new Size("small");
        Size medium = new Size("medium");
        Size large = new Size("large");
        
        Money price = new Money(5);
        Money price2 = new Money(3);
        Money price3 = new Money(4);
        Money price4 = new Money(6);
        Money price5 = new Money(7);
        
        Coffee cup1 = new Coffee("coldbrew",small,price);
        Receipt list = new Receipt();
        list.add(cup1);
        list.add(new Coffee("latte",medium,price2));
        list.add(new Coffee("frappe",large,price3));
        list.add(new Coffee("expresso",large,price4));
        list.add(new Coffee("cappuccino",small,price5));
        System.out.println(list.prepare());
        
        //Estimated time-2 hours, Real time-30min
        
    }
    
}
