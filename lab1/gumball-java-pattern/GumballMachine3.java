package cmpe202.cmpe202_2;

public class GumballMachine3 extends GumballMachine {
	int total = 0;
	public GumballMachine3(int numberGumballs)
	{
		super(numberGumballs);
		state=noQuarterState;
	}
	public void insertCoins(int[] coins) {
		for (int i =0; i<coins.length;i++) {
			this.total=this.total+coins[i];
		}
		if (this.total >= 50)
		{
		state=hasQuarterState;}
		else 
			state= noQuarterState;
	}

	public void ejectCoins() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	

}
