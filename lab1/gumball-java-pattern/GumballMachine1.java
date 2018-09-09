

public class GumballMachine1 extends GumballMachine {
	
	public GumballMachine1(int numberGumballs)
	{
		super(numberGumballs);
	}
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	

}
