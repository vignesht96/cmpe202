
/**
 * Write a description of class BuildOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BuildOrder {

    public static Component getFirstOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        //for testing purposes
        //System.out.println(b.price + " bison (4) and 1/2 (12)");
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        //for testing purposes
        //System.out.println(c.price + "american (0) and jack (1)");
        
        // 1 premium cheese is 1.50, extra premium cheese +1.50
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        //for testing purposes
        //System.out.println(pc.price + " danish (1.5)");
        
        //1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        //for testing purposes
        //System.out.println(s.price + "mayo (0) and peanut (0.5)");
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Black Olives", "Dill Pickle Chips", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        //for testing purposes
        //System.out.println(t.price + "olives (0) and chips (0) and pickles (0)");
        
        // premium topping +1.50
        PremiumTopping p = new PremiumTopping( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        //for testing purposes
        //System.out.println(p.price + " tomatoes (3)");
        
        // most buns free, pretzel bun +0.50, gluten-free/hawaiian +1.00
        Bun bu = new Bun( "Bun Options" ) ;
        String[] buo = { "Ciabatta (Vegan)" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( p ) ;
        
        //for testing purposes
        //System.out.println(bu.price + "ciabatta (0)");
        
        // all sides +3.00
        Side si = new Side( "Side Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( bu ) ;
        
        //for testing purposes
        //System.out.println(si.price + "fries (3)");
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ; //burger
        customBurger.addChild( c ) ; //cheese
        customBurger.addChild( pc ) ; //premium cheese
        customBurger.addChild( s ) ; //sauce
        customBurger.addChild( t ) ; //toppings
        customBurger.addChild( p ) ; //premium toppings
        customBurger.addChild( bu ) ; //bun
        customBurger.addChild( si ) ; //side
        
        // Add Custom Burger to the Order
        order.addChild( customBurger );
        return order ;
    }
    
    public static Component getSecondOrder()
    {
        Composite order = new Composite( "" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Hormone and Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        //for testing purposes
        //System.out.println(b.price + " beef (0) and 1/3 (9)");
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Smoked Gouda", "Greek Feta" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        //for testing purposes
        //System.out.println(c.price + "gouda (0) and feta (1)");
        
        // 1 premium cheese is 1.50, extra premium cheese +1.50
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Fresh Mozzarella" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        //for testing purposes
        //System.out.println(pc.price + " mozzarella (1.5)");
        
        //1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Habanero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        //for testing purposes
        //System.out.println(s.price + "salsa (0)");
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Crushed Peanuts" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        //for testing purposes
        //System.out.println(t.price + "peanuts (0)");
        
        // premium topping +1.50
        PremiumTopping p = new PremiumTopping( "Premium Options" ) ;
        String[] po = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        //for testing purposes
        //System.out.println(p.price + " egg (1) + tomatoes (3)");
        
        // most buns free, pretzel bun +0.50, gluten-free/hawaiian +1.00
        Bun bu = new Bun( "Bun Options" ) ;
        String[] buo = { "Gluten-Free Bun" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( p ) ;
        
        //for testing purposes
        //System.out.println(bu.price + "gluten (1)");
        
        // all sides +3.00
        Side si = new Side( "Side Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( bu ) ;
        
        //for testing purposes
        //System.out.println(si.price + "fries (3)");
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ; //burger
        customBurger.addChild( c ) ; //cheese
        customBurger.addChild( pc ) ; //premium cheese
        customBurger.addChild( s ) ; //sauce
        customBurger.addChild( t ) ; //toppings
        customBurger.addChild( p ) ; //premium toppings
        customBurger.addChild( bu ) ; //bun
        customBurger.addChild( si ) ; //side
        
        // Add Custom Burger to the Order
        order.addChild( customBurger );
        return order ;
    }
}
/*
Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square
*/
