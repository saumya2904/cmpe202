  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Shoestring Fries", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        PCheese pc = new PCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise","Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Toppings" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75
       
        Bun bu = new Bun( "Bun Options" ) ;
        String[] buo = { "Ciabatta (Vegan)" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( p) ;
        
        Side si = new Side( "Side Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( bu ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bu ) ;
        customBurger.addChild( si ) ;
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Hormone & Antibiotic Free Beef", "1/3lb", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Smoked Gouda", "Greek Feta" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        // 4 toppings free, extra +.75
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Crushed Peanuts" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( c1 ) ;
        // premium topping +1.50
        Premium p1 = new Premium( "Premium Toppings" ) ;
        String[] po1 = { "Sunny Side Up Egg" , "Marinated Tomatoes" } ;
        p1.setOptions( po1 ) ;
        p1.wrapDecorator( t1 ) ;
        // 1 sauce free, extra +.75
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Habanero salsa" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( p1 ) ;
        Bun bu1 = new Bun( "Bun Options" ) ;
        String[] buo1 = { "Gluten-Free Bun" } ;
        bu1.setOptions( buo1 ) ;
        bu1.wrapDecorator( s1) ;
        Side si1 = new Side( "Side Options" ) ;
        String[] sio1 = { "Shoestring Fries" } ;
        si1.setOptions( sio1 ) ;
        si1.wrapDecorator( bu1 ) ;
        PCheese pc1 = new PCheese( "Premium Cheese Options" ) ;
        String[] pco1 = { "Fresh Mozzarella" } ;
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( si1 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( s1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( p1 ) ;
        customBurger1.addChild( bu1 ) ;
        customBurger1.addChild( si1 ) ;
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
