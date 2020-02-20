
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
        Money price3 = new Money(6);
        Money price6 = new Money(1);
        Money price7 = new Money(8);
        Receipt receipt = new Receipt();
        FancyCoffee cup = new FancyCoffee("latte", small, price);
        FancyCoffee cup2 = new FancyCoffee("mocha",medium,price3);
        Syrup chocolate = new Syrup("chocolate", price6);
        Syrup strawberry = new Syrup("strawberry", price6);
        cup.add(chocolate);
        cup.add(strawberry);
        receipt.add(cup2);
        receipt.add(cup);       
        Sandwich sandwich = new Sandwich(price7);
        Meat ham = new Meat("ham",price2);
        Meat turkey = new Meat("turkey",price2);
        Toppings mustard = new Toppings("mustard",price6);
        Toppings mayo = new Toppings("mayo",price6);
        sandwich.add(ham);
        sandwich.add(turkey);
        sandwich.add(mustard);
        sandwich.add(mayo);
        receipt.add(sandwich);

        System.out.println(receipt.prepare());
        System.out.println(receipt.getTotalString());
        //Estimated time-2 hours, Real time-30min(LAB)
        //Estimated time-5 hours, Real time- 8hrs 45min(H.W) BECAUSE I CAN'T 
        //FOCUS
        //Also, i don't understand why the math for getting the total cost works
        //perfectly fine for sandwich but not FancyCoffee? It's not adding the 
        //chocolate and strawberry syrup as part of the total. So I guess 
        //they're free? ¯\_(ツ)_/¯
        
        
    } 

}
