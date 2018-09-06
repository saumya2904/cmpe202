
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
public class GumballMachine1 extends GumballMachine {

	public GumballMachine1(int size) {
		super(size);
	}
	
    public void insertMoney(int coin)
    {
        if ( coin == 25 )
            this.has_money = true ;
        else 
            this.has_money = false ;
    }

}
public class GumballMachine2 extends GumballMachine {

	//private boolean has_money;
	public GumballMachine2(int size) {
		super(size);
	}
	public void insertMoney(int coin1, int coin2)
	{
		if(coin1==25&&coin1==coin2)
		this.has_money=true;
		else
			this.has_money=false;
		
	}

}
public class GumballMachine3 extends GumballMachine {

	public GumballMachine3(int size) {
		super(size);
	}
	
	public void insertMoney(int[] coins)
	{
		int sum=0;
		for (int i=0; i<coins.length;i++)
			sum= sum+coins[i];
		if(sum==50||sum>50)
		this.has_money=true;
		else
			this.has_money=false;
		
	}

}
