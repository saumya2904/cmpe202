
package cmpe202;
public class GumballMachine
{

    public int num_gumballs;
    public boolean has_money;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_money = false;
    }
    
    public void turnCrank()
    {
    	if ( this.has_money )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_money = false ;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert money" ) ;
    	}        
    }
    
}
